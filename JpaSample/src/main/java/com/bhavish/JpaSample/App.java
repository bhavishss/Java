package com.bhavish.JpaSample;

import javax.persistence.EntityManager;
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
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	JpaApp j = em.find(JpaApp.class, 1);
    	System.out.println(j);
    	JpaApp add = new JpaApp();
    	add.setEid(4);
        add.setName("Soma");
        add.setTech("Design");
       	em.getTransaction().begin();
       	em.persist(add);
       	em.getTransaction().commit();
       	System.out.println(add);
    }
}
