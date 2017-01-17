package net.codejava.spring.model;

import java.util.Date;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	
	private String address1;
	private String address2;
	private String postcode;
	private String city;
	
	private String nameCard;
	private Integer numberCard;
	private Date expiryDate;
	private Integer securityCard;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getNameCard() {
		return nameCard;
	}

	public void setNameCard(String nameCard) {
		this.nameCard = nameCard;
	}
	
	public Integer getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(Integer numberCard) {
		this.numberCard = numberCard;
	}
	
	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getSecurityCard() {
		return securityCard;
	}

	public void setSecurityCard(Integer securityCard) {
		this.securityCard = securityCard;
	}
}
