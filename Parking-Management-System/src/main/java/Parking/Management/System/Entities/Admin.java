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
@Table(name= "Admin")
@Data
@NoArgsConstructor
public class Admin {

	@Id
	@Column(name= "Id",nullable = false)
	private String username;
	
	@Column(name= "Name", length=50,nullable = false)	
	private String name;
	
	@Column(name= "Gender", length=10,nullable = false)
	private String gender;
	
	@Column(name= "Age", length=3,nullable = false)
	private Long age;
	
	@Column(name= "Contact", length=10,nullable = true)
	private String contact;
	@Column(name= "Email_Id", length=100,nullable = false)
	private String email;
	
	@Column(name= "Address", length=500,nullable = false)
	private String address;
	
	

	public Admin() {
		
	}

	public Admin(String username, String name, String gender, Long age, String contact, String email, String address) {
		this.username = username;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.contact = contact;
		this.email = email;
		this.address = address;
	}

	
}
