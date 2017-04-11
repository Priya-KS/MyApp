package org.priya.hibernate.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.priya.hibernate.dto.UserManyToManyDTO;
import org.priya.hibernate.dto.VehicleManyToManyDTO;

public class UserManyToManyDAO 
{
public static void main(String[] args)
{
UserManyToManyDTO user= new UserManyToManyDTO();
user.setUserName("First user");

///one to many/////
VehicleManyToManyDTO vehicle1= new VehicleManyToManyDTO();
vehicle1.setVehicleName("Car");
user.getVechicleDTO().add(vehicle1); // adding the values to getVehicleDto

VehicleManyToManyDTO vehicle2= new VehicleManyToManyDTO();
vehicle2.setVehicleName("Jeep");
user.getVechicleDTO().add(vehicle2); // adding the values to getVehicleDto

///Many to one///
vehicle1.getUserManyToManyDTO().add(user);
vehicle2.getUserManyToManyDTO().add(user);

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
