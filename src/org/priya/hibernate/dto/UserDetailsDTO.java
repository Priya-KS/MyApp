package org.priya.hibernate.dto;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="User_Details")
public class UserDetailsDTO
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO) //Crete the ID(primary-Key) automatically

///@Column is not required but if we want to name the column according to our wish then we use @Column/// 
@Column(name="User_Id") 
private int userId;

@Column(name="User_Name")
private String userName;

@Column(name="Birth_Date")
private Date birthDate;

@Column(name="Address")
private String address;
///Setter and Getters////
public int getUserId()
{ return userId; }

public void setUserId(int userId) 
{ this.userId = userId; }

public String getUserName()
{ return userName; }
public void setUserName(String userName)
{ this.userName = userName; }

public Date getBirthDate() 
{ return birthDate; }

public void setBirthDate(Date birthDate) 
{ this.birthDate = birthDate; }

public String getAddress() 
{ return address; }

public void setAddress(String address) 
{ this.address = address; }
}
