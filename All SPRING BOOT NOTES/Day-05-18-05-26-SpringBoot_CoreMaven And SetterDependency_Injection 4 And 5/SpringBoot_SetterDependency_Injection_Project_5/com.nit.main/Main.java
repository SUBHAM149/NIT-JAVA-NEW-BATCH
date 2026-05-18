package com.nit.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Course;
import com.nit.beans.Strudent;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
             Strudent s=(Strudent)   context.getBean("sId");
             s.display();
             Course c=(Course)       context.getBean("cId");
             System.out.println(c.getC_id());
             System.out.println(c.getC_name()+" "+c.getC_fee());
	}

}
