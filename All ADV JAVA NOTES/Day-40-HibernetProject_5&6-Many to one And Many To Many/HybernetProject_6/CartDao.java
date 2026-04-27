//Many To One
package com.nit.dao;
import com.nit.dto.Cart;
import com.nit.dto.Item;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CartDao {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("subh");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
		
        
        Item i1 = new Item();
        i1.setName("Box");
        i1.setPrice(500);
        i1.setDescp("Stationary");
        
        Item i2 = new Item();
        i2.setName("Bat");
        i2.setPrice(650);
        i2.setDescp("Wood");
        

        Cart c=new Cart();
        c.setC_name("Subham Behera");
        c.setEmail("sb6028446@gmail.com");
        
        i1.setC(c);
        i2.setC(c);
        
        et.begin();
        em.persist(c);
        em.persist(i1);
        em.persist(i2);
        et.commit();
        
        System.out.println("Data Insrted Successfully ✅");
	}

}
