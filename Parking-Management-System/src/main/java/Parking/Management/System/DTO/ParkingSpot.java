/**
 * 
 */
package Parking.Management.System.DTO;

/**
 * 
 */
public class ParkingSpot {
	private ParkingSpot parkingSpotId;

	private Boolean isSpotAvailable;

	private String floorIds;

	private String parkingSpotType;

	/**
	 * @return the parkingSpotId
	 */
	public ParkingSpot getParkingSpotId() {
		return parkingSpotId;
	}

	/**
	 * @param parkingSpot the parkingSpotId to set
	 */
	public void setParkingSpotId(ParkingSpot parkingSpot) {
		this.parkingSpotId = parkingSpot;
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
	 * @return the floorIds
	 */
	public String getFloorIds() {
		return floorIds;
	}

	/**
	 * @param floorIds the floorIds to set
	 */
	public void setFloorIds(String floorIds) {
		this.floorIds = floorIds;
	}

	/**
	 * @return the parkingSpotType
	 */
	public String getParkingSpotType() {
		return parkingSpotType;
	}

	/**
	 * @param parkingSpotType the parkingSpotType to set
	 */
	public void setParkingSpotType(String parkingSpotType) {
		this.parkingSpotType = parkingSpotType;
	}


}
