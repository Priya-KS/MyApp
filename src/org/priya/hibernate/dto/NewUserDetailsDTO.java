package org.priya.hibernate.dto;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="NewUser_Details")
public class NewUserDetailsDTO
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)//Crete the ID(primary-Key) automatically
///@Column is not required but if we want to name the column according to our wish then we use @Column/// 
@Column(name="User_Id") 
private int userId;

@Column(name="User_Name")
private String userName;

@Column(name="Birth_Date")
private Date birthDate;


@Embedded
private AddressDTO address; //creating AddressDTO object

public Date getBirthDate() {
	return birthDate;
}
public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

public AddressDTO getAddress() {
	return address;
}
public void setAddress(AddressDTO address) {
	this.address = address;
}
public int getUserId()
{
	return userId;
}
public void setUserId(int userId) 
{
	this.userId = userId;
}
public String getUserName()
{
	return userName;
}
public void setUserName(String userName)
{
	this.userName = userName;
}

}
