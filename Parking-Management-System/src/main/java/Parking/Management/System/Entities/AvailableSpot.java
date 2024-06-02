/**
 * 
 */
package Parking.Management.System.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Entity
@Table(name= "Available_Spot")
@Data
@NoArgsConstructor
public class AvailableSpot {
	
	@Id
	@Column(name= "Floor_Id", length =10)
	private String floorId;
	
	@Column(name= "available_two_wheeler_spot", length =10)
	private String availableTwoWheelerSpot;

	@Column(name= "available_four_wheeler_spot", length =10)
	private String availableFourWheelerSpot;

}
