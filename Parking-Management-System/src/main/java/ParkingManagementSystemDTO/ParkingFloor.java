/**
 * 
 */
package ParkingManagementSystemDTO;

import java.util.List;
import java.util.Map;

/**
 * 
 */
public class ParkingFloor {
	private Map<ParkingSpotType,List<ParkingSpot>> parkingSpots;
	private String parkingFloorID;
	/**
	 * 
	 */
	public ParkingFloor() {
		
	}
	/**
	 * @param parkingSpots
	 */
	public ParkingFloor(Map<ParkingSpotType, List<ParkingSpot>> parkingSpots) {
		
		this.parkingSpots = parkingSpots;
	}
	/**
	 * @param parkingFloorID
	 */
	public ParkingFloor(String parkingFloorID) {
		
		this.parkingFloorID = parkingFloorID;
	}
	/**
	 * @param parkingSpots
	 * @param parkingFloorID
	 */
	public ParkingFloor(Map<ParkingSpotType, List<ParkingSpot>> parkingSpots, String parkingFloorID) {
		super();
		this.parkingSpots = parkingSpots;
		this.parkingFloorID = parkingFloorID;
	}
	/**
	 * @return the parkingSpots
	 */
	public Map<ParkingSpotType, List<ParkingSpot>> getParkingSpots() {
		return parkingSpots;
	}
	/**
	 * @param parkingSpots the parkingSpots to set
	 */
	public void setParkingSpots(Map<ParkingSpotType, List<ParkingSpot>> parkingSpots) {
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
