package ParkingManagementSystemService;

import ParkingManagementSystemDao.AdminDaoImp;
import ParkingManagementSystemEntities.Admin;

public class ParkingManagementServiceImp {
	
	private AdminDaoImp adminDaoImp;
	
	public Admin getAdminDetails(Long id) {
		
		return adminDaoImp.findById(id).orElse(null);
	}
	


}
