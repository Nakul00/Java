package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Alien telusko = new Alien();
        /*telusko.setAid(102);
        telusko.setAname("Suru");
        telusko.setColor("Orange");*/
    	
    	Laptop laptop = new Laptop();
    	laptop.setLid(105);
    	laptop.setLname("Dell");
    	
    	Student s = new Student();
    	s.setName("Nakul");
    	s.setRollno(10);
    	s.setMarks(90);
    	s.setLaptop(laptop);
        
        
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	//Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        //Transaction tx = session.beginTransaction();
        session.beginTransaction(); 
        //telusko = (Alien) session.get(Alien.class, 102);
        //session.save(telusko);
        //tx.commit();
        
        session.save(laptop);
        session.save(s);
        session.getTransaction().commit();
        //System.out.println(telusko);
    }
}
