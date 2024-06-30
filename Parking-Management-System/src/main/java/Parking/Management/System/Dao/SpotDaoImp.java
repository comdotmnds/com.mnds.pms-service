/**
 * 
 */
package Parking.Management.System.Dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Parking.Management.System.Entities.Spot;

/**
 * 
 */
@Repository
public interface SpotDaoImp extends JpaRepository<Spot, Long> {

	@Query("SELECT sp from Spot sp where sp.floorId=:floorId")
	public List<Spot> findByFloorId(@Param("floorId") String floorId);
	

}
