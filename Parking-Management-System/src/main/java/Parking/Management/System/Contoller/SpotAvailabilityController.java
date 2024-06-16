/**
 * 
 */
package Parking.Management.System.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Parking.Management.System.Entities.SpotAvailability;
import Parking.Management.System.Service.ParkingManagementServiceImp;

/**
 * 
 */
@RestController
@RequestMapping(path ="/pms")
public class SpotAvailabilityController {
	
	@Autowired
	private ParkingManagementServiceImp parkingManagementServiceImp;
	
	@GetMapping("/get/spot")
	public ResponseEntity<List<SpotAvailability>> getSpotAvailability(){
		
		List<SpotAvailability> spotAvailability=parkingManagementServiceImp.getSpotAvailability();
		return new ResponseEntity <List<SpotAvailability>>(spotAvailability, HttpStatus.OK);
	}
	
	@PostMapping(path = "/tracker")
	public ResponseEntity<SpotAvailability> createSpotAvailabilityDetails(@RequestBody SpotAvailability spotAvailabilityTO) {

		SpotAvailability spotAvailability = parkingManagementServiceImp.saveSpotAvailability(spotAvailabilityTO);

		return new ResponseEntity<SpotAvailability>(spotAvailability, HttpStatus.OK);

	}
	  @PutMapping("/floor/{id}")
		public ResponseEntity <SpotAvailability> updateSpotAvailability(@PathVariable Long id){
			
			SpotAvailability spotAvailability=parkingManagementServiceImp.updateSpotAvailability(id);
			return new ResponseEntity <SpotAvailability>(spotAvailability, HttpStatus.OK);
		}
 
}
