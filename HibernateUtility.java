package com.hibernate.learning;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private static final SessionFactory sessionFactory = buildSessionFactory();
 
	private static SessionFactory buildSessionFactory() {
	 SessionFactory sessionFactory = null;
	 try {
	   //Create the session factory object.
	   return new  Configuration().configure().buildSessionFactory(); 
	 }
	 catch (Exception e) {
	  e.printStackTrace();
	 }
	 return sessionFactory;
	}
 
	public static SessionFactory getSessionFactory() {
	  return sessionFactory;
	}
 
}
