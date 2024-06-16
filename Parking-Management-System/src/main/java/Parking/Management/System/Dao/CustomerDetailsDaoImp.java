/**
 * 
 */
package Parking.Management.System.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Parking.Management.System.Entities.Admin;
import Parking.Management.System.Entities.CustomerDetails;
//import Parking.Management.System.Entities.Spot;

/**
 * 
 */
@Repository
public interface CustomerDetailsDaoImp extends JpaRepository<CustomerDetails, Long> {

	Optional<CustomerDetails> findBySpotId(String id);

	/*
	 * @Query("SELECT spot_id, floor_id, vehicle_type, owner_name, vehicle_number from customer_details where spot_id= '?'"
	 * ) Optional<CustomerDetails> findBySpotId(String id);
	 */
}
