package com.test.ProjectHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
public static void main(String[] args) {
	System.out.println( "project started" );
//	Configuration cfg= new Configuration();
//	cfg.configure("hibernate.cfg.xml"); //we have to provide the whole path here.
//	SessionFactory factory=cfg.buildSessionFactory();
	
    
    SessionFactory factory=new Configuration().configure().buildSessionFactory();
    System.out.println(factory);
    Session session=factory.openSession();
    
//    we have to use transition if we want to save the data,otherwise its not needed
//    Student student = session.get(Student.class, 1);
    Student student = session.load(Student.class, 1);
    System.out.println(student);
    
//    get returns NULL if data is not present
//    whereas load returns ObjectNotFoundException,lazy initialization
    
    Address ad=session.get(Address.class, 1);
    System.out.println(ad);
    System.out.println(ad.getCity());
    session.close();
    factory.close();
}
}
