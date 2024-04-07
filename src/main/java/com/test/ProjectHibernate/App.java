package com.test.ProjectHibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
        
//        creating student
        Student st=new Student();
        st.setId(103);
        st.setName("nitin");
        st.setCity("bhilai");
        
//        creating object addresss for student
        Address ad=new Address();
//        ad.setAddressId(1232);
        ad.setCity("nagpur");
        ad.setStreet("street 16");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(12.32);
        
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(st);
        session.save(ad);
        session.getTransaction().commit();
        System.out.println(st);
        System.out.println(ad);
        session.close();
        System.out.println("done");
    }
}
