package Parking.Management.System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Parking.Management.System.Dao.AdminDaoImp;
import Parking.Management.System.Dao.SpotAvailabilityDaoImp;
import Parking.Management.System.Entities.Admin;
import Parking.Management.System.Entities.SpotAvailability;

@Service
public class ParkingManagementServiceImp {
	@Autowired
	private AdminDaoImp adminDaoImp;
	@Autowired
	private SpotAvailabilityDaoImp spotAvailabilityDaoImp;
	
	public Admin getAdminDetails(String id) {
		
		return adminDaoImp.findById(id).orElse(null);
	}

	public Admin saveAdminDetails(Admin adminTO) {
		// TODO Auto-generated method stub
		return adminDaoImp.save(adminTO);
	}

	public List<SpotAvailability> getSpotAvailability() {
		// TODO Auto-generated method stub
		return spotAvailabilityDaoImp.findAll();
	}
	
	public SpotAvailability saveSpotAvailability(SpotAvailability spotAvailability) {
		// TODO Auto-generated method stub
		return spotAvailabilityDaoImp.save(spotAvailability);
	}

	

}
