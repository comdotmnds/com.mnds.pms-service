package Parking.Management.System.Entities;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="Customer_Details")
@Data
@NoArgsConstructor
public class CustomerDetails {
	
	@Id
	@Column(name= "Token_Id", length=10)
	private String tokenId;
	
	@Column(name= "Floor_Id", length=10)
	private String floorId;
	
	@Column(name= "Spot_Id", length=10)
	private String spotId;
	
	@Column(name= "Owner_Name", length=50)
	private String ownerName;
	
	@Column(name= "Vehicle_Number", length=20)
	private String vehicleNumber;
	
	@Column(name= "Vehicle_Type", length=10)
	private String vehicleType;
	
	@Column(name= "In_Time")
	private Timestamp inTime;
	
	@Column(name= "Out_Time")
	private Timestamp outTime;
	
	@Column(name= "Total_Fare", length=5)
	private String totalFare;
}
