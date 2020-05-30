package com.employe.management;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    Map<String, String> mp=new HashMap<>();
    mp.put("javax.persistence.jdbc.driver", "com.mysql.cj.jdbc.Driver");
    mp.put("javax.persistence.jdbc.url", "jdbc:mysql://localhost:3306/cachedb");
    mp.put("javax.persistence.jdbc.user", "root");
    mp.put("javax.persistence.jdbc.password", "MySql@3489");
    mp.put("hibernate.show_sql", "true");
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Employee", mp);
    
    }
    }

