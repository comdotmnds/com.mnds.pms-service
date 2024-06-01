package ParkingManagementSystemDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdminTO {

	private int adminId;
	private String adminName;	
	private String adminSex;	
	private int adminAge;
	private String adminAddress;
}
