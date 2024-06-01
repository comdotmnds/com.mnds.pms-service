package ParkingManagementSystemDao;

import org.springframework.data.jpa.repository.JpaRepository;

import ParkingManagementSystemEntities.Admin;

public interface AdminDaoImp extends JpaRepository<Admin, Long> {

}
