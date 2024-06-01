package ParkingManagementSystemDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdminTO {

	private String adminName;	
	private String adminSex;	
	private Long adminAge;
	private String adminAddress;
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
