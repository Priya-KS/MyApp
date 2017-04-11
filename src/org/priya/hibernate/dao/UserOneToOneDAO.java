package org.priya.hibernate.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.priya.hibernate.dto.UserOneToOneDTO;
import org.priya.hibernate.dto.VehicleOneToOneDTO;

public class UserOneToOneDAO 
{
public static void main(String[] args)
{
UserOneToOneDTO user= new UserOneToOneDTO();
user.setUserName("First user");

VehicleOneToOneDTO vehicle= new VehicleOneToOneDTO();
vehicle.setVehicleName("Car");
///One to one relationship
user.setVechicleDTO(vehicle); //Runtime Relating to create relationship
vehicle.setUserOneToOneDTO(user);//Runtime Relating to create relationship

SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
Session session = sessionFactory.openSession();
session.beginTransaction();
session.save(user);
session.save(vehicle);
session.getTransaction().commit();
session.close();
}
}
