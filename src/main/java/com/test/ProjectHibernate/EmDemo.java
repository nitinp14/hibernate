package com.test.ProjectHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student student1=new Student();
		student1.setId(10);
		student1.setName("rohit");
		student1.setCity("london");
		
		Certificate certificate=new Certificate();
		certificate.setCourse("java");
		certificate.setDuration("2 months");
		
		student1.setCerti(certificate);
		
		Student student2=new Student();
		student2.setId(11);
		student2.setName("virat");
		student2.setCity("chandigarh");
		
		Certificate ceri=new Certificate();
		ceri.setCourse("python");
		ceri.setDuration("3 months");
		student2.setCerti(ceri);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
//		saving objects
		s.save(student1);
		s.save(student2);
		tx.commit();
		
		factory.close();
	}
}
