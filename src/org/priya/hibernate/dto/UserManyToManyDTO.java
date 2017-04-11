package org.priya.hibernate.dto;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/*import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;*/

@Entity 
@Table (name="User_ManyToMany")
public class UserManyToManyDTO
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO) //Crete the ID(primary-Key) automatically

private int userId;
private String userName;

@ManyToMany
private Collection<VehicleManyToManyDTO> vechicleDTO= new ArrayList<VehicleManyToManyDTO>(); //Collection of vehicles







public Collection<VehicleManyToManyDTO> getVechicleDTO() {
	return vechicleDTO;
}

public void setVechicleDTO(Collection<VehicleManyToManyDTO> vechicleDTO) {
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
