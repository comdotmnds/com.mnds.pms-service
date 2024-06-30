package Parking.Management.System.Business;

import java.time.Duration;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Parking.Management.System.Dao.CostDetailsDaoImp;
import Parking.Management.System.Dao.CustomerDetailsDaoImp;
import Parking.Management.System.Dao.FloorDetailDaoImp;
import Parking.Management.System.Dao.SpotAvailabilityDaoImp;
import Parking.Management.System.Dao.SpotDaoImp;
import Parking.Management.System.Entities.CostDetails;
import Parking.Management.System.Entities.CustomerDetails;
import Parking.Management.System.Entities.FloorDetail;
import Parking.Management.System.Entities.Spot;
import Parking.Management.System.Entities.SpotAvailability;

@Component
public class ParkingManaagementBusiness {
	@Autowired
	private FloorDetailDaoImp floorDetailDaoImp;
	@Autowired
	private SpotAvailabilityDaoImp spotAvailabilityDaoImp;
	@Autowired
	private SpotDaoImp spotDaoImp;
	@Autowired
	private CustomerDetailsDaoImp customerDetailsDaoImp;

	@Autowired
	private CostDetailsDaoImp costDetailsDaoImp;
	public SpotAvailability addFloor(SpotAvailability spotAvb) {
		// TODO Auto-generated method stub
		List<Spot> spotList = new ArrayList<>();
		List<Spot> spotListTwoWhl = new ArrayList<>();
		List<Spot> spotListFourWhl = new ArrayList<>();

		int twoWhlr = Integer.parseInt(spotAvb.getAvailableTwoWheelerSpot());
		int fourWhlr = Integer.parseInt(spotAvb.getAvailableFourWheelerSpot());
		int total = twoWhlr+fourWhlr;
		spotAvb.setTotalNoOfSpots(total+"");
		SpotAvailability spl = spotAvailabilityDaoImp.save(spotAvb);
		
		for (int i = 0; i < twoWhlr; i++) {
			spotListTwoWhl.add(new Spot(spl.getFloorId(), "Twhlr", true));
		}
		
		for (int i = 0; i < fourWhlr; i++) {
			spotListFourWhl.add(new Spot(spl.getFloorId(), "Fwhlr", true));
		}
	spotList.addAll(spotListTwoWhl)	;
	spotList.addAll(spotListFourWhl);
		spotDaoImp.saveAll(spotList);
		List<Long> spotIds= new ArrayList<>();
		List<Spot> spots = spotDaoImp.findByFloorId(spl.getFloorId());
	//	List<Long> TwoWl = spots.stream().filter(e-> "WH2".equalsIgnoreCase(e.getSpotType())).map(Spot::getId)
	//	List<Long> FourWl = spots.stream().filter(e-> "WH4".equalsIgnoreCase(e.getSpotType())).collect(Collectors.toList());
 
		List<Long> twoWhlIds= new ArrayList<>(); 
		List<Long> fourWhlIds= new ArrayList<>(); 
		spots.stream().forEach(e-> {
			if("WH2".equalsIgnoreCase(e.getSpotType())) {
				twoWhlIds.add(e.getSpotId());	
			}
			else if("WH4".equalsIgnoreCase(e.getSpotType())) {
				fourWhlIds.add(e.getSpotId());
			}
		});

	String spIdsStr =spotIdsInStr(spotIds);
		floorDetailDaoImp.save(new FloorDetail(spl.getFloorId(), spIdsStr,spotIdsInStr(twoWhlIds), spotIdsInStr(fourWhlIds) ));
		
	//	customerDetailsDaoImp.
		return spl;

	}

	public String spotIdsInStr(List<Long> spotIds) {

		return spotIds.stream().map(String::valueOf).collect(Collectors.joining(","));
	}

	public CustomerDetails vhclEntry(CustomerDetails entry) {
		// TODO Auto-generated method stub
		List<FloorDetail> flrDtlList = floorDetailDaoImp.findAll();
  
		CustomerDetails customerDetails = null;
		List<FloorDetail> avlTwoWhList = flrDtlList.stream()
				.filter(e -> !"".equalsIgnoreCase(e.getAvailableTwoWheelerSpotIds())).collect(Collectors.toList());
		List<FloorDetail> avlFourWhList = flrDtlList.stream()
				.filter(e -> !"".equalsIgnoreCase(e.getAvailableFourWheelerSpotIds())).collect(Collectors.toList());

		if( avlTwoWhList.size() > 0 && entry.getVehicleType().equalsIgnoreCase("WH2")) {
			FloorDetail fld=avlTwoWhList.get(0);
			customerDetails = createCustomerDetails(entry, fld);
		}

		if(avlFourWhList.size() >0 && entry.getVehicleType().equalsIgnoreCase("WH4")) {
			FloorDetail fld=avlFourWhList.get(0);
			customerDetails = createCustomerDetails(entry, fld);
		}

		return customerDetailsDaoImp.save(customerDetails) ;
	}

	public CustomerDetails createCustomerDetails(CustomerDetails cust, FloorDetail flr) {
	       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		Instant timestamp = Instant.now();
		String timestampStrIn = formatter.format(timestamp);
		CustomerDetails customerDetails= new CustomerDetails();
		customerDetails.setFloorId(flr.getFloorId());
		List<String> spIds = getListOfSpotIds(flr.getSpotIds());
		String spId = null;
		if(spIds.size() > 0) {
			spId = spIds.get(0);
			customerDetails.setSpotId(spId);
			spIds.remove(spId);
		}
		customerDetails.setOwnerName(cust.getOwnerName());
		customerDetails.setVehicleNumber(cust.getVehicleNumber());
		customerDetails.setVehicleType(cust.getVehicleType());
		customerDetails.setContact(cust.getContact());
		customerDetails.setEmail(cust.getEmail());
		customerDetails.setInTime(timestampStrIn);
		customerDetails.setOutTime("");
		customerDetails.setTotalFare("");
		
		Spot sptdtl = spotDaoImp.findById(Long.parseLong(spId)).orElse(null);
		sptdtl.setIsSpotAvailable(false);
		if(cust.getVehicleType().equalsIgnoreCase("WH4"))
		flr.setAvailableFourWheelerSpotIds(spIds.stream().map(String::valueOf).collect(Collectors.joining(",")));
		if(cust.getVehicleType().equalsIgnoreCase("WH2"))
		flr.setAvailableTwoWheelerSpotIds(spIds.stream().map(String::valueOf).collect(Collectors.joining(",")));
		
		floorDetailDaoImp.save(flr);
		spotDaoImp.save(sptdtl);
		return customerDetails;
	}

	public CustomerDetails vhclExit(Long id) {
		// TODO Auto-generated method stub
		CustomerDetails customerDetails = customerDetailsDaoImp.findById(id).orElse(null);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		Instant timestamp = Instant.now();
		String outTime = formatter.format(timestamp);

		if(customerDetails!=null) {
			customerDetails.setOutTime(outTime);
			customerDetails.setTotalFare(costCalculation(customerDetails.getInTime(), outTime,customerDetails.getVehicleType()));
			Spot sptdtl = spotDaoImp.findById(Long.parseLong(customerDetails.getSpotId())).orElse(null);
			sptdtl.setIsSpotAvailable(true);
			spotDaoImp.save(sptdtl);
			FloorDetail flr= floorDetailDaoImp.findById(customerDetails.getFloorId()).orElse(null);
			List<String> spIds = getListOfSpotIds(flr.getSpotIds());

			
			if(customerDetails.getVehicleType().equalsIgnoreCase("WH4"))
				spIds.add(customerDetails.getSpotId());
				flr.setAvailableFourWheelerSpotIds(spIds.stream().map(String::valueOf).collect(Collectors.joining(",")));
				if(customerDetails.getVehicleType().equalsIgnoreCase("WH2"))
				spIds.add(customerDetails.getSpotId());
				flr.setAvailableTwoWheelerSpotIds(spIds.stream().map(String::valueOf).collect(Collectors.joining(",")));
				
				floorDetailDaoImp.save(flr);

			
		}
		return customerDetailsDaoImp.save(customerDetails);
	}
	
	public String costCalculation(String inTime,String outTime, String vehicleType) {
		CostDetails costDtls=
	 	costDetailsDaoImp.findById(vehicleType.trim()).orElse(null);
		
		Instant timestamp1 = Instant.parse(inTime);
        Instant timestamp2 = Instant.parse(outTime);
        Duration duration = Duration.between(timestamp1, timestamp2);
	 	return(costDtls.getPricePerHrs()*(duration.getSeconds()/(60*60)))+"";
	}
	public List<String> getListOfSpotIds(String spotId){
		return Arrays.asList(spotId.split(","));
	}
}
