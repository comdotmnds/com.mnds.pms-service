package Parking.Management.System.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Parking.Management.System.Entities.FloorDetail;


@Repository
public interface FloorDetailDaoImp extends JpaRepository<FloorDetail, String> {
	
	

}
