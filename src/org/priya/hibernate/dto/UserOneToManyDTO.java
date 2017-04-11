package org.priya.hibernate.dto;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name="User_OneToMany")
public class UserOneToManyDTO
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO) //Crete the ID(primary-Key) automatically

private int userId;
private String userName;

@OneToMany(mappedBy="userOneToManyDTO")
//@JoinTable(name="User_vehicle", joinColumns=@JoinColumn(name="User_ID"), inverseJoinColumns=@JoinColumn(name="Vehicle_ID"))
private Collection<VehicleOneToManyDTO> vechicleDTO= new ArrayList<VehicleOneToManyDTO>(); //Collection of vehicles





public Collection<VehicleOneToManyDTO> getVechicleDTO() {
	return vechicleDTO;
}

public void setVechicleDTO(Collection<VehicleOneToManyDTO> vechicleDTO) {
	this.vechicleDTO = vechicleDTO;
}

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


}
