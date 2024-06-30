package Parking.Management.System.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Floor_Detail")
@Data
@NoArgsConstructor

public class FloorDetail {
	@Id
	@Column(name="floor_id")
	private String floorId;

	@Column(name="SpotIds")
	private String spotIds;

	@Column(name= "available_two_wheeler_spot_Ids", length =10)
	private String availableTwoWheelerSpotIds;

	@Column(name= "available_four_wheeler_spot_Ids", length =10)
	private String availableFourWheelerSpotIds;
	
	/**
	 * 
	 */
	public FloorDetail() {

	}
	/**
	 * @param floorId
	 * @param spotIds
	 * @param availableTwoWheelerSpotIds
	 * @param availableFourWheelerSpotIds
	 */
	public FloorDetail(String floorId, String spotIds, String availableTwoWheelerSpotIds,
			String availableFourWheelerSpotIds) {
	
		this.floorId = floorId;
		this.spotIds = spotIds;
		this.availableTwoWheelerSpotIds = availableTwoWheelerSpotIds;
		this.availableFourWheelerSpotIds = availableFourWheelerSpotIds;
	}
	/**
	 * @param floorId
	 * @param spotIds
	 * @param avalSpotId
	 */


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
	 * @return the spotIds
	 */
	public String getSpotIds() {
		return spotIds;
	}

	/**
	 * @param spotIds the spotIds to set
	 */
	public void setSpotIds(String spotIds) {
		this.spotIds = spotIds;
	}
	/**
	 * @return the availableTwoWheelerSpotIds
	 */
	public String getAvailableTwoWheelerSpotIds() {
		return availableTwoWheelerSpotIds;
	}
	/**
	 * @param availableTwoWheelerSpotIds the availableTwoWheelerSpotIds to set
	 */
	public void setAvailableTwoWheelerSpotIds(String availableTwoWheelerSpotIds) {
		this.availableTwoWheelerSpotIds = availableTwoWheelerSpotIds;
	}
	/**
	 * @return the availableFourWheelerSpotIds
	 */
	public String getAvailableFourWheelerSpotIds() {
		return availableFourWheelerSpotIds;
	}
	/**
	 * @param availableFourWheelerSpotIds the availableFourWheelerSpotIds to set
	 */
	public void setAvailableFourWheelerSpotIds(String availableFourWheelerSpotIds) {
		this.availableFourWheelerSpotIds = availableFourWheelerSpotIds;
	}

}
