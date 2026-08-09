|- About the deployment flow 
|- About the circular dependency 
|- @Required annotation
|- BeanPostProccessor
package com.sub.day19;

public class A {

    private B b;

    public A() {
        System.out.println("A Object Created");
    }

    public void setB(B b) {
        this.b = b;
    }
}
package com.sub.day19;

public class B {

    private C c;

    public B() {
        System.out.println("B Object Created");
    }

    public void setC(C c) {
        this.c = c;
    }
}
package com.sub.day19;

public class C {

    private A a;

    public C() {
        System.out.println("C Object Created");
    }

    public void setA(A a) {
        this.a = a;
    }
}
application.properties
---------------------
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="a" class="com.sub.day19.A">
        <property name="b" ref="b"/>
    </bean>

    <bean id="b" class="com.sub.day19.B">
        <property name="c" ref="c"/>
    </bean>

    <bean id="c" class="com.sub.day19.C">
        <property name="a" ref="a"/>
    </bean>

</beans>
-------------------------
package com.sub.day19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		context.getBean("a");

		System.out.println("Setter Injection Completed");
	}
}
