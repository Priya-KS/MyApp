package org.priya.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class VehicleManyToManyDTO 
{
@Id
@GeneratedValue
private int vehicleId;
private String vehicleName;

@ManyToMany(mappedBy="vechicleDTO")// here mappedBy is used to avoid extra table
private Collection <UserManyToManyDTO> userManyToManyDTO= new ArrayList<UserManyToManyDTO>(); // to make ManyToMany




public Collection<UserManyToManyDTO> getUserManyToManyDTO() {
	return userManyToManyDTO;
}
public void setUserManyToManyDTO(Collection<UserManyToManyDTO> userManyToManyDTO) {
	this.userManyToManyDTO = userManyToManyDTO;
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
