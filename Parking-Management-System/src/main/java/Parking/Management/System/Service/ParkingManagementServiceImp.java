package Parking.Management.System.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Parking.Management.System.Dao.AdminDaoImp;
import Parking.Management.System.Dao.SpotAvailabilityDaoImp;
import Parking.Management.System.Entities.Admin;
import Parking.Management.System.Entities.SpotAvailability;
import jakarta.transaction.Transactional;

@Service
public class ParkingManagementServiceImp {
	@Autowired
	private AdminDaoImp adminDaoImp;
	@Autowired
	private SpotAvailabilityDaoImp spotAvailabilityDaoImp;
	
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

	

}
