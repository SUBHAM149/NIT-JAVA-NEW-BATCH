About the stereoType Annotations
package com.sub.day22;

import org.springframework.stereotype.Component;

@Component
public class A {

    public A() {
        System.out.println("A class object created");
    }

    public void m1() {
        System.out.println("A class m1() method");
    }
}
package com.sub.day22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("application22-context.xml");

		A bean = context.getBean("a", A.class);

		bean.m1();
	}
}


application.properties
---------------------------
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans
           https://www.springframework.org/schema/beans/spring-beans.xsd
           http://www.springframework.org/schema/context
           https://www.springframework.org/schema/context/spring-context.xsd">

    <!-- Scan the package for @Component classes -->
    <context:component-scan base-package="com.sub.day22"/>

</beans>
