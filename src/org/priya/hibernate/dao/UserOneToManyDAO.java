package org.priya.hibernate.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.priya.hibernate.dto.UserOneToManyDTO;
import org.priya.hibernate.dto.VehicleOneToManyDTO;

public class UserOneToManyDAO 
{
public static void main(String[] args)
{
UserOneToManyDTO user= new UserOneToManyDTO();
user.setUserName("First user");

//one to many////
VehicleOneToManyDTO vehicle1= new VehicleOneToManyDTO();
vehicle1.setVehicleName("Car");
user.getVechicleDTO().add(vehicle1); // adding the values to getVehicleDto

VehicleOneToManyDTO vehicle2= new VehicleOneToManyDTO();
vehicle2.setVehicleName("Jeep");
user.getVechicleDTO().add(vehicle2); // adding the values to getVehicleDto

///Many to one///
vehicle1.setUserOneToManyDTO(user);
vehicle2.setUserOneToManyDTO(user);

SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
Session session = sessionFactory.openSession();
session.beginTransaction();
session.save(user);
session.save(vehicle1);
session.save(vehicle2);

session.getTransaction().commit();
session.close();
}
}
