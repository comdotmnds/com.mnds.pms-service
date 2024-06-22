package Parking.Management.System.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Parking.Management.System.Dao.AdminDaoImp;
import Parking.Management.System.Dao.CustomerDetailsDaoImp;
import Parking.Management.System.Dao.SpotAvailabilityDaoImp;
import Parking.Management.System.Dao.SpotDaoImp;
import Parking.Management.System.Entities.Admin;
import Parking.Management.System.Entities.CustomerDetails;
import Parking.Management.System.Entities.Spot;
import Parking.Management.System.Entities.SpotAvailability;
import Parking.Management.System.Entities.Ticket;
import jakarta.transaction.Transactional;

@Service
public class ParkingManagementServiceImp {
	@Autowired
	private AdminDaoImp adminDaoImp;
	@Autowired
	private SpotAvailabilityDaoImp spotAvailabilityDaoImp;
	@Autowired
	private SpotDaoImp spotDaoImp;
	@Autowired
	private CustomerDetailsDaoImp customerDetailsDaoImp;
	
	public Admin getAdminDetails(String id) {
		
		return adminDaoImp.findById(id).orElse(null);
	}
    @Transactional
	public Admin saveAdminDetails(Admin admin) {
		// TODO Auto-generated method stub
    	admin.setPassword(UUID.randomUUID().toString());
		return adminDaoImp.save(admin);
	}

	public List<SpotAvailability> getSpotAvailability() {
		// TODO Auto-generated method stub
		return spotAvailabilityDaoImp.findAll();
	}
	
	public SpotAvailability saveSpotAvailability(SpotAvailability spotAvailability) {
		// TODO Auto-generated method stub
		return spotAvailabilityDaoImp.save(spotAvailability);
	}
	public CustomerDetails getSpotDetails(String id) {
		// TODO Auto-generated method stub
		return customerDetailsDaoImp.findBySpotId(id).orElse(null);
	}
	public CustomerDetails saveSpotDetails(CustomerDetails spotTO) {
		// TODO Auto-generated method stub
		return customerDetailsDaoImp.save(spotTO);
	}

	public SpotAvailability updateSpotAvailability(Long id) {
		// TODO Auto-generated method stub
		return spotAvailabilityDaoImp.findById(id).orElse(null);
	}

	public Admin findByUsername(String username) {
		// TODO Auto-generated method stub
		return adminDaoImp.findById(username).orElse(null);
	}
	public CustomerDetails getTicketDetails(Long id) {
		// TODO Auto-generated method stub
		return customerDetailsDaoImp.findById(id).orElse(null);
	}
	public CustomerDetails saveTicketDetails(CustomerDetails ticket) {
		// TODO Auto-generated method stub
		return customerDetailsDaoImp.save(ticket);
	}

	

}
