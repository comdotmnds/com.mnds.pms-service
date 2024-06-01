package ParkingManagementSystemEntities;

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
	@Column(name="spot_id")
	private String spotId;
	@Column(name="total_two_wheeler_spot",length = 10)
	private String totalTwoWheelerSpot;
	@Column(name="available_two_wheeler_spot",length = 10)
	private String availableTwoWheelerSpot;
	@Column(name="total_four_wheeler_spot",length = 10)
	private String totalFourWheelerSpot;
	@Column(name="available_four_wheeler_spot",length = 10)
	private String availableFourWheelerSpot;

}
