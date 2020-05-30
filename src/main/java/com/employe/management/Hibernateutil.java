package com.employe.management;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Hibernateutil {
private static StandardServiceRegistry ssr;
private static SessionFactory sf;
	static {
		if(sf == null) {
			try {
			ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			MetadataSources	mdts= new MetadataSources(ssr);
			Metadata md=mdts.getMetadataBuilder().build();
					 sf = md.getSessionFactoryBuilder().build();
	      } catch (Exception e) {
	        e.printStackTrace();
	        if (ssr != null) {
	          StandardServiceRegistryBuilder.destroy(ssr);
	        }
	      }
	    }
}
//Utility method to return SessionFactory
public static SessionFactory getSessionFactory() {
	  return sf;
		}
	
		

	}
