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
@Table(name ="Customer_Details")
@Data
@NoArgsConstructor
public class CustomerDetails {
	
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "Token_Id", length=10)
	private Long tokenId;
	
	@Column(name= "Spot_Id", length=10)
	private String spotId;
	
	@Column(name= "Floor_Id", length=10)
	private String floorId;
	
	@Column(name= "Owner_Name", length=50)
	private String ownerName;
	
	@Column(name= "Vehicle_Number", length=20)
	private String vehicleNumber;
	
	@Column(name= "Vehicle_Type", length=20)
	private String vehicleType;
	
	@Column(name= "In_Time")
	private String inTime;
	
	@Column(name= "Out_Time")
	private String outTime;
	
	@Column(name= "Total_Fare", length=5)
	private String totalFare;
	
	public CustomerDetails() {

	}

	/**
	 * @param tokenId
	 * @param spotId
	 * @param floorId
	 * @param ownerName
	 * @param vehicleNumber
	 * @param vehicleType
	 * @param inTime
	 * @param outTime
	 * @param totalFare
	 */
	public CustomerDetails(Long tokenId, String spotId, String floorId, String ownerName, String vehicleNumber,
			String vehicleType, String inTime, String outTime, String totalFare) {

		this.tokenId = tokenId;
		this.spotId = spotId;
		this.floorId = floorId;
		this.ownerName = ownerName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.inTime = inTime;
		this.outTime = outTime;
		this.totalFare = totalFare;
	}

	/**
	 * @return the tokenId
	 */
	public Long getTokenId() {
		return tokenId;
	}

	/**
	 * @param tokenId the tokenId to set
	 */
	public void setTokenId(Long tokenId) {
		this.tokenId = tokenId;
	}

	/**
	 * @return the spotId
	 */
	public String getSpotId() {
		return spotId;
	}

	/**
	 * @param spotId the spotId to set
	 */
	public void setSpotId(String spotId) {
		this.spotId = spotId;
	}

	/**
	 * @return the floorId
	 */
	public String getFloorId() {
		return floorId;
	}

	/**
	 * @param floorId the floorId to set
	 */
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}

	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * @return the vehicleNumber
	 */
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	/**
	 * @param vehicleNumber the vehicleNumber to set
	 */
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the inTime
	 */
	public String getInTime() {
		return inTime;
	}

	/**
	 * @param inTime the inTime to set
	 */
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	/**
	 * @return the outTime
	 */
	public String getOutTime() {
		return outTime;
	}

	/**
	 * @param outTime the outTime to set
	 */
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	/**
	 * @return the totalFare
	 */
	public String getTotalFare() {
		return totalFare;
	}

	/**
	 * @param totalFare the totalFare to set
	 */
	public void setTotalFare(String totalFare) {
		this.totalFare = totalFare;
	}



}
