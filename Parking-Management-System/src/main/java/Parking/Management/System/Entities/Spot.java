package Parking.Management.System.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Spot_Id")
	private Long spotId;
	@Column(name= "Floor_Id")
	private String floorId;
	@Column(name="Spot_Type", length = 20)
	private String spotType;	
	@Column(name = "isSpotAvailable", length = 10)
	private Boolean isSpotAvailable;
	/**
	 * 
	 */
	public Spot() {

	}
	/**
	 * @param spotId
	 * @param floorId
	 * @param spotType
	 * @param isSpotAvailable
	 */
	public Spot(Long spotId, String floorId, String spotType, Boolean isSpotAvailable) {

		this.spotId = spotId;
		this.floorId = floorId;
		this.spotType = spotType;
		this.isSpotAvailable = isSpotAvailable;
	}
	public Spot(String floorId, String spotType, boolean isSpotAvailable) {
		// TODO Auto-generated constructor stub
		this.floorId = floorId;
		this.spotType = spotType;
		this.isSpotAvailable = isSpotAvailable;

	}
	/**
	 * @return the spotId
	 */
	public Long getSpotId() {
		return spotId;
	}
	/**
	 * @param spotId the spotId to set
	 */
	public void setSpotId(Long spotId) {
		this.spotId = spotId;
	}
	/**
	 * @return the floorId
	 */
	public String getfloorId() {
		return floorId;
	}
	/**
	 * @param floorId the floorId to set
	 */
	public void setfloorId(String floorId) {
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
	

}