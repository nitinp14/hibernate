package com.mapEx;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
//		creating session object
		Question q=new Question();
		q.setQuestionId(1212);
		q.setQuestion("what is java");
		
		
//		creating answer object for mapping
		Answer a=new Answer();
		a.setAnswerId(343);
		a.setAnswer("java is programming language");
		q.setAnswer(a);
		
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(q);
		session.save(a);
		tx.commit();
		
//		Question qn=session.get(Question.class, 343);
//		
//		System.out.println(qn.getQuestion());
//		System.out.println(qn.getAnswer().getAnswer());
		session.close();
		factory.close();
		
	}
}
