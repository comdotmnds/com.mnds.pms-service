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
	@Column(name="two_wheeler_spot_id")
	private String twoWheelerSpotId;
	@Column(name="four_wheeler_spot_id")
	private String fourWheelerSpotId;
}
