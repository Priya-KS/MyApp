package org.priya.hibernate.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.priya.hibernate.dto.AddressDTO;
import org.priya.hibernate.dto.UserDetailsCollectionDTO;

public class UserDetailsCollectionDAO 
{
public static void main(String[] args)
{
UserDetailsCollectionDTO user= new UserDetailsCollectionDTO();
//Just change the values or create new object to add the values to the table
//user.setUserId(1);// Not required when @GeneratedValue is used in DTO file
user.setUserName("First user");

AddressDTO addr1=new AddressDTO();
addr1.setStreet("First address");
addr1.setcity("smg");
addr1.setState("KA");
addr1.setPincode(577201);

AddressDTO addr2=new AddressDTO();
addr2.setStreet("Second address");
addr2.setcity("BNG");
addr2.setState("KA");
addr2.setPincode(560013);

user.getListOfAddress().add(addr1);
user.getListOfAddress().add(addr2);
SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
Session session = sessionFactory.openSession();
session.beginTransaction();
session.save(user);
session.getTransaction().commit();
session.close();
user=null;
session = sessionFactory.openSession();
user= session.get(UserDetailsCollectionDTO.class,1);
session.close();
System.out.println(user.getListOfAddress().size());


}
}
