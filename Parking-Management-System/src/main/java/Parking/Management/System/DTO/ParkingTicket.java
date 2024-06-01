/**
 * 
 */
package Parking.Management.System.DTO;

/**
 * 
 */
public class ParkingTicket {
	
	private String parkingTicketID;
	private VehicleType vehicleType;
	private String vehicleRegisterNumber;
	private String parkingSpotID;
	private String parkingFloorID;
	private String startTime;
	private String endTime;
	private String amount;
	/**
	 * @return the parkingTicketID
	 */
	public String getParkingTicketID() {
		return parkingTicketID;
	}
	/**
	 * @param parkingTicketID the parkingTicketID to set
	 */
	public void setParkingTicketID(String parkingTicketID) {
		this.parkingTicketID = parkingTicketID;
	}
	/**
	 * @return the vehicleType
	 */
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(VehicleType vehicleType) {
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
