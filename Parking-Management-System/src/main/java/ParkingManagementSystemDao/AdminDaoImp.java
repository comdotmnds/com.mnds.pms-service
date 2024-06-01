package ParkingManagementSystemDao;

import org.springframework.data.jpa.repository.JpaRepository;

import ParkingManagementSystemDTO.AdminTO;
import ParkingManagementSystemEntities.Admin;

public interface AdminDaoImp extends JpaRepository<Admin, Long> {

	Admin save(AdminTO adminTO);

}
