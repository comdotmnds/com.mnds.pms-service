package Parking.Management.System.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Parking.Management.System.Dao.AdminDaoImp;
import Parking.Management.System.Entities.Admin;

@Service
public class ParkingManagementServiceImp {
	@Autowired
	private AdminDaoImp adminDaoImp;
	
	public Admin getAdminDetails(Long id) {
		
		return adminDaoImp.findById(id).orElse(null);
	}

	public Admin saveAdminDetails(Admin adminTO) {
		// TODO Auto-generated method stub
		return adminDaoImp.save(adminTO);
	}
	


}
