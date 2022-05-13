package com.hibernate.learning;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.learning.entity.Person;

public class TestHibernate {

	public static void main(String[] args) {
		//Create the student object.
    	Person user = new Person();
 
    	//Setting the object properties.
    	user.setUserName("Vivek");
    	user.setPassword("vivek@123");
    	user.setCreateDate(new Date());
    	
 
    	Transaction tx = null;
    	//Get the session object.
    	Session session = HibernateUtility.getSessionFactory().openSession();
    	try{
              //Start hibernate session.
    	      tx = session.beginTransaction();
 
              //Insert a new student record in the database.
    	      session.save(user); 
 
              //Commit hibernate transaction if no exception occurs.
    	      tx.commit();
    	      System.out.println("Saved Successfully.");
    	  }catch (HibernateException e) {
    	     if(tx!=null){
                 //Roll back if any exception occurs. 
    	         tx.rollback();
    	     }
    	     e.printStackTrace(); 
    	  }finally {
             //Close hibernate session.
    	     session.close(); 
    	  }

	}

}
