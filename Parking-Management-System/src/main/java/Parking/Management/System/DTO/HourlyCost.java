/**
 * 
 */
package Parking.Management.System.DTO;

import java.util.Map;

/**
 * 
 */
public class HourlyCost {
	private Map<ParkingSpotType,Long> hourlyCost;

	/**
	 * @return the hourlyCost
	 */
	public Map<ParkingSpotType, Long> getHourlyCost() {
		return hourlyCost;
	}

	/**
	 * @param hourlyCost the hourlyCost to set
	 */
	public void setHourlyCost(Map<ParkingSpotType, Long> hourlyCost) {
		this.hourlyCost = hourlyCost;
	}

}
