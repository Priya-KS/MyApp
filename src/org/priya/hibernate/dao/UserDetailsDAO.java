package org.priya.hibernate.dao;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.priya.hibernate.dto.UserDetailsDTO;

public class UserDetailsDAO 
{
public static void main(String[] args)
{
UserDetailsDTO user= new UserDetailsDTO();
//Just change the values or create new object to add the values to the table
//user.setUserId(1);// Not required when @GeneratedValue is used in DTO file
user.setUserName("First user");
user.setBirthDate(new Date());
user.setAddress("Bangalore");

SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
Session session = sessionFactory.openSession();
session.beginTransaction();
session.save(user);
session.getTransaction().commit();
session.close();
/// To retrieve the data from table///
user=null;
session = sessionFactory.openSession();
session.beginTransaction();
user= session.get(UserDetailsDTO.class, 2); //work as select statement in sql and arguments are(object class, primary key)
System.out.println(user.getUserName()); 
System.out.println(user.getAddress()); 
}
}
