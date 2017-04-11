package org.priya.hibernate.dto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table (name="User_OneToOne")
public class UserOneToOneDTO
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO) //Crete the ID(primary-Key) automatically

private int userId;
private String userName;

@OneToOne
@JoinColumn(name="Vehicle_ID") //By default the column name will be VehicleDTO_VehicleId so renaming to Vehicle_ID 
private VehicleOneToOneDTO vechicleDTO;




public VehicleOneToOneDTO getVechicleDTO() {
	return vechicleDTO;
}

public void setVechicleDTO(VehicleOneToOneDTO vechicleDTO) {
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
