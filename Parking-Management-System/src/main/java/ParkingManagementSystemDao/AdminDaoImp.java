package ParkingManagementSystemDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ParkingManagementSystemEntities.Admin;

@Repository
public interface AdminDaoImp extends JpaRepository<Admin, Long> {

	//Admin save(AdminTO adminTO);

}
