/**
 * 
 */
package ParkingManagementSystemDTO;

/**
 * 
 */
public class ParkingSpot {
	private String parkingSpotId;
	/**
	 * @param parkingSpotId
	 */
	public ParkingSpot(String parkingSpotId) {
		super();
		this.parkingSpotId = parkingSpotId;
	}
	private Boolean isSpotAvailable;
	/**
	 * @param isSpotAvailable
	 */
	public ParkingSpot(Boolean isSpotAvailable) {
		super();
		this.isSpotAvailable = isSpotAvailable;
	}
	private Vehicle vehicle;
	/**
	 * @param vehicle
	 */
	public ParkingSpot(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	private ParkingSpotType parkingSpotType;
	/**
	 * @param parkingSpotType
	 */
	public ParkingSpot(ParkingSpotType parkingSpotType) {
		super();
		this.parkingSpotType = parkingSpotType;
	}
	/**
	 * @param parkingSpotId
	 * @param isSpotAvailable
	 * @param vehicle
	 * @param parkingSpotType
	 */
	public ParkingSpot(String parkingSpotId, Boolean isSpotAvailable, Vehicle vehicle,
			ParkingSpotType parkingSpotType) {
		super();
		this.parkingSpotId = parkingSpotId;
		this.isSpotAvailable = isSpotAvailable;
		this.vehicle = vehicle;
		this.parkingSpotType = parkingSpotType;
	}
	/**
	 * @return the parkingSpotId
	 */
	public String getParkingSpotId() {
		return parkingSpotId;
	}
	/**
	 * @param parkingSpotId the parkingSpotId to set
	 */
	public void setParkingSpotId(String parkingSpotId) {
		this.parkingSpotId = parkingSpotId;
	}
	/**
	 * @return the isSpotAvailable
	 */
	public Boolean getIsSpotAvailable() {
		return isSpotAvailable;
	}
	/**
	 * @param isSpotAvailable the isSpotAvailable to set
	 */
	public void setIsSpotAvailable(Boolean isSpotAvailable) {
		this.isSpotAvailable = isSpotAvailable;
	}
	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}
	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	/**
	 * @return the parkingSpotType
	 */
	public ParkingSpotType getParkingSpotType() {
		return parkingSpotType;
	}
	/**
	 * @param parkingSpotType the parkingSpotType to set
	 */
	public void setParkingSpotType(ParkingSpotType parkingSpotType) {
		this.parkingSpotType = parkingSpotType;
	}

}
