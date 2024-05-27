package com.thenxtprogrammer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_registration")
@Data
public class Registration {

	// primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// varchar
	@Column(length = 100)
	private String firstName;// first_name

	@Column(name = "l_name", length = 100)
	private String lastName;

	@Column(unique = true)
	private String userName;

	@Column(unique = true)
	private String email;

	private String mobNo;

	private String city;

	@Column(nullable = false)
	private String state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}

//select * from tbl_registration where email='subhamashish2@gmail.com';
//
//findByEmail("")
//
//Method query
//JPQL

