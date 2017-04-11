package org.priya.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VehicleOneToOneDTO 
{
@Id
@GeneratedValue
private int vehicleId;
private String vehicleName;
@OneToOne
private UserOneToOneDTO UserOneToOneDTO;

public UserOneToOneDTO getUserOneToOneDTO() {
	return UserOneToOneDTO;
}
public void setUserOneToOneDTO(UserOneToOneDTO userOneToOneDTO) {
	UserOneToOneDTO = userOneToOneDTO;
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
