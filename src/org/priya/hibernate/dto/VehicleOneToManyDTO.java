package org.priya.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class VehicleOneToManyDTO 
{
@Id
@GeneratedValue
private int vehicleId;
private String vehicleName;

@ManyToOne
@JoinColumn(name="User_ID")
private UserOneToManyDTO userOneToManyDTO; // to make ManyToOne

public UserOneToManyDTO getUserOneToManyDTO() {
	return userOneToManyDTO;
}
public void setUserOneToManyDTO(UserOneToManyDTO userOneToManyDTO) {
	this.userOneToManyDTO = userOneToManyDTO;
}
public int getVehicleId() {
	return vehicleId;
}
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}

}
