/**
 * 
 */
package Parking.Management.System.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Parking.Management.System.Entities.Spot;

/**
 * 
 */
@Repository
public interface SpotDaoImp extends JpaRepository<Spot, String> {

}
