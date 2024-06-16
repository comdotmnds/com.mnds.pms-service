package Parking.Management.System.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Parking.Management.System.DTO.Login;
import Parking.Management.System.Entities.Admin;
import Parking.Management.System.Service.ParkingManagementServiceImp;

@CrossOrigin (origins="*")
@RestController
@RequestMapping(path = "/pms")
public class AdminWebController {

	@Autowired
	private ParkingManagementServiceImp parkingManagementServiceImp;
	@GetMapping("/admins/{id}")
	public ResponseEntity<Admin> getAdminById(@PathVariable String id) {
		Admin admin = parkingManagementServiceImp.getAdminDetails(id);
		return new ResponseEntity<Admin>(admin, HttpStatus.OK);

	}

	@PostMapping(path = "/admins")
	public ResponseEntity<Admin> createAdminDetails(@RequestBody Admin adminTO) {

		Admin admin = parkingManagementServiceImp.saveAdminDetails(adminTO);

		return new ResponseEntity<Admin>(admin, HttpStatus.OK);

	}
	@PostMapping(path = "pms/admin/login")
	public ResponseEntity<Admin> addloginDetails(@RequestBody Login login) {

		Admin admin = parkingManagementServiceImp.findByUsername(login.getUsername());
		if (null!= admin) {
			if(admin.getPassword().trim().equals(login.getPassword().trim())) {
				return new ResponseEntity<Admin>(admin, HttpStatus.OK);
				 //System.out.println("User login details saved successfully: " + login.getUsername()
			}
		}
	   
	  
	return new ResponseEntity<Admin>(admin, HttpStatus.NOT_FOUND);

	}


}
