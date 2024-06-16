/**
 * 
 */
package Parking.Management.System.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Parking.Management.System.Entities.CustomerDetails;

/**
 * 
 */
@Repository
public interface CustomerDetailsDaoImp extends JpaRepository<CustomerDetails, Long> {

}
