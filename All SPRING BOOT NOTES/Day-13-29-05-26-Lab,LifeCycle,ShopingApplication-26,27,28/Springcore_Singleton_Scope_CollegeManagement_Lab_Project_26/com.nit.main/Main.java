package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.BookIssue;
import com.nit.beans.College;
import com.nit.beans.Library;
import com.nit.beans.Order;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("========== TASK 1 ==========");

		College c1 = context.getBean(College.class);
		College c2 = context.getBean(College.class);

		System.out.println(c1);
		System.out.println(c2);

		System.out.println("Principal HashCode 1 : " + c1.getPrincipal().hashCode());

		System.out.println("Principal HashCode 2 : " + c2.getPrincipal().hashCode());

		System.out.println("\n========== TASK 2 ==========");

		Order o1 = context.getBean(Order.class);
		Order o2 = context.getBean(Order.class);

		System.out.println(o1);
		System.out.println(o2);

		System.out.println("Order HashCode 1 : " + o1.hashCode());
		System.out.println("Order HashCode 2 : " + o2.hashCode());

		System.out.println("\n========== TASK 3 ==========");

		Library l1 = context.getBean(Library.class);
		Library l2 = context.getBean(Library.class);

		BookIssue b1 = context.getBean(BookIssue.class);
		BookIssue b2 = context.getBean(BookIssue.class);

		System.out.println(l1);
		System.out.println(l2);

		System.out.println("Library HashCode 1 : " + l1.hashCode());

		System.out.println("Library HashCode 2 : " + l2.hashCode());

		System.out.println(b1);
		System.out.println(b2);

		System.out.println("BookIssue HashCode 1 : " + b1.hashCode());

		System.out.println("BookIssue HashCode 2 : " + b2.hashCode());
	}
}

OUTPUT
---------
========== TASK 1 ==========
College [collegeName=NIT College, location=Hyderabad, principal=Principal [principalId=101, principalName=Ramesh Sir]]
College [collegeName=NIT College, location=Hyderabad, principal=Principal [principalId=101, principalName=Ramesh Sir]]
Principal HashCode 1 : 2114444063
Principal HashCode 2 : 2114444063

========== TASK 2 ==========
Order [orderId=5001, itemName=Pizza, price=399.99]
Order [orderId=5001, itemName=Pizza, price=399.99]
Order HashCode 1 : 210506412
Order HashCode 2 : 112049309

========== TASK 3 ==========
Library [libraryName=Central Library, address=Bhubaneswar]
Library [libraryName=Central Library, address=Bhubaneswar]
Library HashCode 1 : 1162918744
Library HashCode 2 : 1162918744
BookIssue [issueId=9001, bookName=Java Programming, issueDate=29-05-2026]
BookIssue [issueId=9001, bookName=Java Programming, issueDate=29-05-2026]
BookIssue HashCode 1 : 156856360
BookIssue HashCode 2 : 1617550160

