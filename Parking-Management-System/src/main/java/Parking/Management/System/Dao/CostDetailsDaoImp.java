package Parking.Management.System.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Parking.Management.System.Entities.CostDetails;

public interface CostDetailsDaoImp extends JpaRepository<CostDetails, String> {

}
