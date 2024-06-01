package ParkingManagementSystemEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "Admin")
@Data
@NoArgsConstructor
public class Admin {

	@Id
	@Generated
	@Column(name= "Admin_Id", length=20)
	private int adminId;
	
	@Column(name= "Admin_Name", length=50)	
	private String adminName;
	
	@Column(name= "Admin_Sex", length=10)
	private String adminSex;
	
	@Column(name= "Admin_Age", length=20)
	private int adminAge;
	
	@Column(name= "Admin_Address", length=100)
	private String adminAddress;
	
}
