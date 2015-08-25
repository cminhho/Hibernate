package com.cminhho.common;

import org.hibernate.Session;

import com.cminhho.persistence.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Maven + Hibernate + Mysql");
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	
    	session.beginTransaction();
    	
    	Stock addStock = new Stock();
    	addStock.setStockCode("8080");
    	addStock.setStockName("GEM2");
    	
    	session.save(addStock);
    	session.getTransaction().commit();
    	
    	session.getSessionFactory().close();
    }
}
