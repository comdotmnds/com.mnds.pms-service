/**
 * 
 */
package Parking.Management.System.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Parking.Management.System.Entities.SpotAvailability;

/**
 * 
 */
@Repository
public interface SpotAvailabilityDaoImp extends JpaRepository<SpotAvailability, Long>{

}
