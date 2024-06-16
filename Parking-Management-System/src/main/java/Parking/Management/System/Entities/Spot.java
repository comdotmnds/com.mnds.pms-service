package Parking.Management.System.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Spot")
@NoArgsConstructor
@Data
public class Spot {
	@Id
	@Column(name="Spot_Id", length = 10)
	private String spotId;
	@Column(name = "Floor_Id", length = 10)
	private Long floorId;
	@Column(name="Spot_Type", length = 20)
	private String spotType;
	/**
	 * 
	 */
	public Spot() {
		
	}
	/**
	 * @param spotId
	 * @param floorId
	 * @param spotType
	 */
	public Spot(String spotId, Long floorId, String spotType) {
		
		this.spotId = spotId;
		this.floorId = floorId;
		this.spotType = spotType;
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
	 * @return the spotType
	 */
	public String getSpotType() {
		return spotType;
	}
	/**
	 * @param spotType the spotType to set
	 */
	public void setSpotType(String spotType) {
		this.spotType = spotType;
	}

}
