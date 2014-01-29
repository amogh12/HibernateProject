package com.hibernate.chapter1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

//http://www.youtube.com/watch?v=ReAZmA83Myg
public class TestEmployee {
	
	private static SessionFactory factory;
	private static ServiceRegistry serviceRegistry;

	public static void main(String[] args) {
		
//		SessionFactory sessionFactory = new Configuration()
//			.configure()
//			.buildSessionFactory();
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry(); 
			factory = configuration.buildSessionFactory(serviceRegistry);
		}
		catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
		}
		
		//creating 
		
		Session session = factory.openSession();
		
		
		
	}
}
