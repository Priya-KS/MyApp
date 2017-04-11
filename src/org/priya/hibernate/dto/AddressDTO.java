package org.priya.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable //to insert the address sub type in the address column
public class AddressDTO
{
	@Column(name="Street_Name")
private String street;
	@Column(name="City_Name")
	private String city;
		@Column(name="State_Name")
private String state;
	@Column(name="Pin_Code")
	private int pincode;

public String getcity() {
	return city;
}
public void setcity(String city) {
	this.city = city;
}

public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

}
