package com.nit.dao;

import com.nit.dto.PanCard;
import com.nit.dto.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PPDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("subh");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        
        Person p=new Person();
        p.setP_name("Raju");
        p.setLoc("MH");
        p.setMob_num(7858693658l);
        
        PanCard card=new PanCard();
        card.setCh_name("Raju Kumar");
        card.setC_num("KN2563KJ");
        
        
        p.setCard(card);
        card.setP(p);
        
//        et.begin();
//        em.persist(card);
//        em.persist(p);
//        et.commit();
        
 //       System.out.println("Data Has Been Inserted Sycessfully.......");
        
//        Person p1=em.find(Person.class, 1);
//        System.out.println(p1.getP_id());
//        System.out.println(p1.getP_name());
//        System.out.println(p1.getMob_num());
//        System.out.println(p1.getLoc());
//        System.out.println(p1.getCard());
//        
        
        PanCard p1=em.find(PanCard.class, 1);
        System.out.println(p1.getC_id());
        System.out.println(p1.getCh_name());
        System.out.println(p1.getC_num());
        System.out.println(p1.getP());
        
        
	}

}
