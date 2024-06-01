package ParkingManagementSystemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ParkingManagementSystemDao.AdminDaoImp;
import ParkingManagementSystemEntities.Admin;

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
