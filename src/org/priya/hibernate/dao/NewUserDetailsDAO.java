package org.priya.hibernate.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.priya.hibernate.dto.AddressDTO;
import org.priya.hibernate.dto.NewUserDetailsDTO;

public class NewUserDetailsDAO 
{
public static void main(String[] args)
{
NewUserDetailsDTO user= new NewUserDetailsDTO();
AddressDTO addr=new AddressDTO();
user.setUserName("Third user");
user.setBirthDate(new Date());
addr.setcity("Mysore");
addr.setPincode(123456);
addr.setState("KA");
addr.setStreet("PalaceRoad");
user.setAddress(addr); //passing AddressDTO object 


SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
Session session = sessionFactory.openSession();
session.beginTransaction();
session.save(user);
session.getTransaction().commit();
session.close();

}
}
