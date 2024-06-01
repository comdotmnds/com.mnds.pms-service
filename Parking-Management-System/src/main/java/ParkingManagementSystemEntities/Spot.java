package ParkingManagementSystemEntities;

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

}
