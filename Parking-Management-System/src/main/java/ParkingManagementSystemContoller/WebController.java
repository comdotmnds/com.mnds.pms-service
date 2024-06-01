package ParkingManagementSystemContoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ParkingManagementSystemEntities.Admin;
import ParkingManagementSystemService.ParkingManagementServiceImp;

@RestController
@RequestMapping("pms/v1")
public class WebController {
	
	private ParkingManagementServiceImp parkingManagementServiceImp;
	
	@GetMapping("/admins/{id}")
	public ResponseEntity<Admin> getAdminById(@PathVariable Long id){
		Admin admin = parkingManagementServiceImp.getAdminDetails(id);
		return new ResponseEntity<Admin>(admin,HttpStatus.OK);
		
	}
	

}
