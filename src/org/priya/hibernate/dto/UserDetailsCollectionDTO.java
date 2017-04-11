package org.priya.hibernate.dto;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
/*
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
*/
@Entity 
@Table (name="User_Details_Collection")
public class UserDetailsCollectionDTO
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO) //Crete the ID(primary-Key) automatically

///@Column is not required but if we want to name the column according to our wish then we use @Column/// 
@Column(name="User_Id") 
private int userId;

@Column(name="User_Name")
private String userName;

@ElementCollection(fetch=FetchType.EAGER) /// Collection with proxy object Eager instead of lazy
///////By default UserDetailsDTO_ListOfAddress name we will be generated but we are giving User_address and similarly default column name UserDetailsCollectionDTO_User_Id we are passing User_ID
@JoinTable(name="User_Address",
joinColumns=@JoinColumn(name="User_ID")) 
private Collection<AddressDTO> listOfAddress=new ArrayList<AddressDTO>();

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public Collection<AddressDTO> getListOfAddress() {
	return listOfAddress;
}

public void setListOfAddress(Collection<AddressDTO> listOfAddress) {
	this.listOfAddress = listOfAddress;
}




}
