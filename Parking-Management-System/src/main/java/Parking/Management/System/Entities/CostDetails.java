package Parking.Management.System.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Cost_Details")
@Data
@NoArgsConstructor
public class CostDetails {
	@Id
	@Column(name="Vehicle_Type", length = 10, nullable = false)
	private String vehicleType;
	@Column(name = "Price_per_Hours", length = 10, nullable = false)
	private Long pricePerHrs;
	

}
