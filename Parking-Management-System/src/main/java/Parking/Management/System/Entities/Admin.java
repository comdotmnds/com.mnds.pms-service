package Parking.Management.System.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "Admin")
@Data
@NoArgsConstructor
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "Admin_Id")
	private Long id;
	
	@Column(name= "Admin_Name", length=50)	
	private String adminName;
	
	@Column(name= "Admin_Sex", length=10)
	private String adminSex;
	
	@Column(name= "Admin_Age", length=20)
	private Long adminAge;
	
	@Column(name= "Admin_Address", length=100)
	private String adminAddress;

	public Admin() {
		
	}

	public Admin(Long adminId, String adminName, String adminSex, Long adminAge, String adminAddress) {
		
		this.adminName = adminName;
		this.adminSex = adminSex;
		this.adminAge = adminAge;
		this.adminAddress = adminAddress;
	}

	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * @return the adminSex
	 */
	public String getAdminSex() {
		return adminSex;
	}

	/**
	 * @param adminSex the adminSex to set
	 */
	public void setAdminSex(String adminSex) {
		this.adminSex = adminSex;
	}

	/**
	 * @return the adminAge
	 */
	public Long getAdminAge() {
		return adminAge;
	}

	/**
	 * @param adminAge the adminAge to set
	 */
	public void setAdminAge(Long adminAge) {
		this.adminAge = adminAge;
	}

	/**
	 * @return the adminAddress
	 */
	public String getAdminAddress() {
		return adminAddress;
	}

	/**
	 * @param adminAddress the adminAddress to set
	 */
	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}
	
}
