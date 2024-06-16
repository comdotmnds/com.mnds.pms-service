/**
 * 
 */
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
import Parking.Management.System.Entities.CustomerDetails;
import Parking.Management.System.Entities.Spot;
import Parking.Management.System.Service.ParkingManagementServiceImp;

/**
 * 
 */
@CrossOrigin (origins="*")
@RestController
@RequestMapping(path ="/pms")

public class SpotDetailController {
	@Autowired
	private ParkingManagementServiceImp parkingManagementServiceImp;
	
	@GetMapping ("/get/spot/detail/{id}")
    public ResponseEntity <Spot> getSpotDtails(@PathVariable String id){
		
		Spot spot=parkingManagementServiceImp.getSpotDetails(id);
		return new ResponseEntity <Spot>(spot, HttpStatus.OK);
	}
	
	@PostMapping(path = "/spotDtl")
	public ResponseEntity<CustomerDetails> createSpotDetails(@RequestBody CustomerDetails spotTO) {

		CustomerDetails customerDetails = parkingManagementServiceImp.saveSpotDetails(spotTO);

		return new ResponseEntity<CustomerDetails>(customerDetails, HttpStatus.OK);

	}	

}
