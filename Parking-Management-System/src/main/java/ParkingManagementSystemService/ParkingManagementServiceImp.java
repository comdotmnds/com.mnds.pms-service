package ParkingManagementSystemService;

import ParkingManagementSystemDTO.AdminTO;
import ParkingManagementSystemDao.AdminDaoImp;
import ParkingManagementSystemEntities.Admin;

public class ParkingManagementServiceImp {
	
	private AdminDaoImp adminDaoImp;
	
	public Admin getAdminDetails(Long id) {
		
		return adminDaoImp.findById(id).orElse(null);
	}

	public Admin saveAdminDetails(AdminTO adminTO) {
		// TODO Auto-generated method stub
		return adminDaoImp.save(adminTO);
	}
	


}
