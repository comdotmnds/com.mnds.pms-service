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
@Table(name= "Spot_Availability")
@Data
@NoArgsConstructor
public class SpotAvailability {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "Floor_Id", length =10)
	private Long floorId;
	
	@Column(name= "available_two_wheeler_spot", length =10)
	private String availableTwoWheelerSpot;

	@Column(name= "available_four_wheeler_spot", length =10)
	private String availableFourWheelerSpot;
	
	@Column(name ="total_no_of_spots", length =20)
	private String totalNoOfSpots;

	/**
	 * 
	 */
	public SpotAvailability() {
		
	}

	/**
	 * @param floorId
	 * @param availableTwoWheelerSpot
	 * @param availableFourWheelerSpot
	 * @param totalNoOfSpots
	 */
	public SpotAvailability( String availableTwoWheelerSpot, String availableFourWheelerSpot,
			String totalNoOfSpots) {
		
		this.availableTwoWheelerSpot = availableTwoWheelerSpot;
		this.availableFourWheelerSpot = availableFourWheelerSpot;
		this.totalNoOfSpots = totalNoOfSpots;
	}

	/**
	 * @return the floorId
	 */
	public Long getFloorId() {
		return floorId;
	}

	/**
	 * @param floorId the floorId to set
	 */
	public void setFloorId(Long floorId) {
		this.floorId = floorId;
	}

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
