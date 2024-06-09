package Parking.Management.System.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Parking.Management.System.Entities.Admin;

@Repository
public interface AdminDaoImp extends JpaRepository<Admin, String> {

	//Admin save(AdminTO adminTO);

}
