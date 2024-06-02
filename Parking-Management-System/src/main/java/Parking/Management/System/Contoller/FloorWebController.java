/**
 * 
 */
package Parking.Management.System.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Parking.Management.System.Service.ParkingManagementServiceImp;

/**
 * 
 */
@RestController
@RequestMapping(path ="/pms")
public class FloorWebController {
	
	@Autowired
	private ParkingManagementServiceImp parkingManagementServiceImp;
	
//	@GetMapping("/floor")
	

}
