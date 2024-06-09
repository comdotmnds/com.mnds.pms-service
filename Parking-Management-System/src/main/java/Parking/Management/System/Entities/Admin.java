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
	@Column(name= "Id")
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
	
	@Column(name="Password",nullable = false)
	private String password;
	
	

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

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public Long getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Long age) {
		this.age = age;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	
}
