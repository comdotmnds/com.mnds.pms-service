/**
 * 
 */
package Parking.Management.System.DTO;

import java.util.List;

/**
 * 
 */
public class ParkingFloor {
	private List<ParkingSpot> parkingSpots;
	private String parkingFloorID;
	/**
	 * @param parkingSpots
	 * @param parkingFloorID
	 */
	public ParkingFloor(List<ParkingSpot> parkingSpots, String parkingFloorID) {
		
		this.parkingSpots = parkingSpots;
		this.parkingFloorID = parkingFloorID;
	}
	/**
	 * 
	 */
	public ParkingFloor() {
		
	}
	/**
	 * @return the parkingSpots
	 */
	public List<ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	/**
	 * @param parkingSpots the parkingSpots to set
	 */
	public void setParkingSpots(List<ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
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

}
