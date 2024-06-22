/**
 * 
 */
package Parking.Management.System.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Entity
@Table(name = "Ticket")
@NoArgsConstructor
@Data
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Parking_Ticket_Id")
	private Long parkingTicketID;
	
	@Column(name = "Vehicle_Type", length = 10)
	private String vehicleType;
	
	@Column(name="Vehicle_Register_Number", length = 20)
	private String vehicleRegisterNumber;
	
	@Column(name="ParkingSpotID", length = 20)
	private String parkingSpotID;
	
	@Column(name="Parking_Floor_ID", length = 20)
	private String parkingFloorID;
	
	@Column(name="Start_Time", length = 20)
	private String startTime;
	@Column(name="End_Time", length = 20)
	private String endTime;
	
	@Column(name="Amount", length = 20)
	private String amount;

	/**
	 * 
	 */
	public Ticket() {
		
	}

	/**
	 * @param parkingTicketID
	 * @param vehicleType
	 * @param vehicleRegisterNumber
	 * @param parkingSpotID
	 * @param parkingFloorID
	 * @param startTime
	 * @param endTime
	 * @param amount
	 */
	public Ticket(Long parkingTicketID, String vehicleType, String vehicleRegisterNumber, String parkingSpotID,
			String parkingFloorID, String startTime, String endTime, String amount) {
		
		this.parkingTicketID = parkingTicketID;
		this.vehicleType = vehicleType;
		this.vehicleRegisterNumber = vehicleRegisterNumber;
		this.parkingSpotID = parkingSpotID;
		this.parkingFloorID = parkingFloorID;
		this.startTime = startTime;
		this.endTime = endTime;
		this.amount = amount;
	}

	/**
	 * @return the parkingTicketID
	 */
	public Long getParkingTicketID() {
		return parkingTicketID;
	}

	/**
	 * @param parkingTicketID the parkingTicketID to set
	 */
	public void setParkingTicketID(Long parkingTicketID) {
		this.parkingTicketID = parkingTicketID;
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
	 * @return the vehicleRegisterNumber
	 */
	public String getVehicleRegisterNumber() {
		return vehicleRegisterNumber;
	}

	/**
	 * @param vehicleRegisterNumber the vehicleRegisterNumber to set
	 */
	public void setVehicleRegisterNumber(String vehicleRegisterNumber) {
		this.vehicleRegisterNumber = vehicleRegisterNumber;
	}

	/**
	 * @return the parkingSpotID
	 */
	public String getParkingSpotID() {
		return parkingSpotID;
	}

	/**
	 * @param parkingSpotID the parkingSpotID to set
	 */
	public void setParkingSpotID(String parkingSpotID) {
		this.parkingSpotID = parkingSpotID;
	}

	/**
	 * @return the parkingFloorID
	 */
	public String getParkingFloorID() {
		return parkingFloorID;
	}

	/**
	 * @param parkingFloorID the parkingFloorID to set
	 */
	public void setParkingFloorID(String parkingFloorID) {
		this.parkingFloorID = parkingFloorID;
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
