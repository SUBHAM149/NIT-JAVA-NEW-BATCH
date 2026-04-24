package com.nit.dao;

import com.nit.dto.PanCard;                           
import com.nit.dto.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CardDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("subh");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        Person p=new Person();
        p.setName("Kamal");
        p.setAdress("ODISHA");
        p.setMob_num(8965789586l);
        
        PanCard card=new PanCard();
        card.setCh_name("Kamal Sahu");
        card.setC_num("GF1235j");
        
        
        p.setCard(card);
        et.begin();
        em.persist(card);
        em.persist(p);
        et.commit();
        System.out.println("Data Has Been Inserted Sucessfully.....");
        
        

	}

}
