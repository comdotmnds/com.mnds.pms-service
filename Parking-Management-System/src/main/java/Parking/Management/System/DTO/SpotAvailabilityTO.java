/**
 * 
 */
package Parking.Management.System.DTO;

import jakarta.persistence.Column;

/**
 * 
 */
public class SpotAvailabilityTO {

	
	private String availableTwoWheelerSpot;
	private String availableFourWheelerSpot;
	private String totalNoOfSpots;
	/**
	 * @return the availableTwoWheelerSpot
	 */
	public String getAvailableTwoWheelerSpot() {
		return availableTwoWheelerSpot;
	}
	/**
	 * @param availableTwoWheelerSpot the availableTwoWheelerSpot to set
	 */
	public void setAvailableTwoWheelerSpot(String availableTwoWheelerSpot) {
		this.availableTwoWheelerSpot = availableTwoWheelerSpot;
	}
	/**
	 * @return the availableFourWheelerSpot
	 */
	public String getAvailableFourWheelerSpot() {
		return availableFourWheelerSpot;
	}
	/**
	 * @param availableFourWheelerSpot the availableFourWheelerSpot to set
	 */
	public void setAvailableFourWheelerSpot(String availableFourWheelerSpot) {
		this.availableFourWheelerSpot = availableFourWheelerSpot;
	}
	/**
	 * @return the totalNoOfSpots
	 */
	public String getTotalNoOfSpots() {
		return totalNoOfSpots;
	}
	/**
	 * @param totalNoOfSpots the totalNoOfSpots to set
	 */
	public void setTotalNoOfSpots(String totalNoOfSpots) {
		this.totalNoOfSpots = totalNoOfSpots;
	}

}
