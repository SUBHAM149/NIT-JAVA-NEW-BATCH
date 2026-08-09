|- All About Java configuration approach 
 |-   Image Type notes (raw one)
 |-   PDF Notes ( structure one)
Both provided here read it as per you  Comfortability


Day 26 – Annotation Day 09: All About Java Configuration Approach notes. The main topic is moving from XML configuration to Java Configuration using @Configuration and @Bean, while also covering XML + annotation, stereotype annotations, @Autowired, @Qualifier, @Value, @Lazy, @Scope, and @DependsOn.

I'll keep all Java classes in ONE package: com.sub.day26, as you requested.

Spring Day 26 — All Programs in One Package
---------------------------------------------
1. Project Structure
Spring_Day26
│
├── src/main/java
│   └── com.sub.day26
│       ├── File.java
│       ├── A.java
│       ├── B.java
│       ├── Toy.java
│       ├── Student.java
│       ├── JavaConfig.java
│       └── Main.java
│
└── src/main/resources
    ├── application-context.xml
    └── application.properties

PROGRAM 1 — XML Configuration
------------------------------------------------------------------------------------------------------------
The notes first show the traditional XML approach where the IOC container is told about the class and its dependencies through application-context.xml.

File.java
package com.sub.day26;

public class File {

    private String location;

    public File(String location) {
        this.location = location;
    }

    public void readFile() {
        System.out.println("Reading file from : " + location);
    }
}
A.java
package com.sub.day26;

public class A {

    private File file;

    public void setFile(File file) {
        this.file = file;
    }

    public void display() {

        System.out.println("A class");

        file.readFile();
    }
}
application-context.xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="file"
          class="com.sub.day26.File">

        <constructor-arg value="E:/download/read.txt"/>

    </bean>

    <bean id="a"
          class="com.sub.day26.A">

        <property name="file" ref="file"/>

    </bean>

</beans>
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "application-context.xml");

        A a = context.getBean("a", A.class);

        a.display();
    }
}
Output
A class
Reading file from : E:/download/read.txt


PROGRAM 2 — Annotation Approach
------------------------------------------------------------------------------------------------------------
The notes then replace the XML bean definitions with stereotype annotations such as @Component and dependency injection using @Autowired.

File.java
package com.sub.day26;

import org.springframework.stereotype.Component;

@Component
public class File {

    public void readFile() {

        System.out.println("Reading file...");
    }
}
A.java
package com.sub.day26;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    private File file;

    public void display() {

        System.out.println("A class");

        file.readFile();
    }
}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        "com.sub.day26");

        A a = context.getBean(A.class);

        a.display();
    }
}
Output
A class
Reading file...

PROGRAM 3 — Annotation + XML Combination
------------------------------------------------------------------------------------------------------------
The notes specifically discuss combining annotation configuration with XML. XML can still define some beans while component-scan finds annotation-based beans.

File.java
package com.sub.day26;

public class File {

    private String location;

    public File(String location) {
        this.location = location;
    }

    public void readFile() {

        System.out.println(
                "Reading file from : " + location);
    }
}
A.java
package com.sub.day26;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    private File file;

    public void display() {

        System.out.println("A class");

        file.readFile();
    }
}
application-context.xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd

       http://www.springframework.org/schema/context
       https://www.springframework.org/schema/context/spring-context.xsd">

    <bean id="file"
          class="com.sub.day26.File">

        <constructor-arg value="E:/download/read.txt"/>

    </bean>

    <context:component-scan
            base-package="com.sub.day26"/>

</beans>
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "application-context.xml");

        A a = context.getBean(A.class);

        a.display();
    }
}

PROGRAM 4 — @Value
------------------------------------------------------------------------------------------------------------
The notes use a Toy example to show primitive/String value injection.

Toy.java
package com.sub.day26;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Toy {

    @Value("IronMan")
    private String toyName;

    @Value("10000")
    private int priceOfToy;

    public void display() {

        System.out.println("Toy Name  : " + toyName);
        System.out.println("Toy Price : " + priceOfToy);
    }
}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        "com.sub.day26");

        Toy toy = context.getBean(Toy.class);

        toy.display();
    }
}
Output
Toy Name  : IronMan
Toy Price : 10000
PROGRAM 5 — Multiple Beans With Different Values Using XML

This is an important point from the notes.

With XML, we can easily create multiple objects of the same class with different values.

Toy.java
package com.sub.day26;

public class Toy {

    private String toyName;
    private int priceOfToy;

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public void setPriceOfToy(int priceOfToy) {
        this.priceOfToy = priceOfToy;
    }

    public void display() {

        System.out.println("Toy Name  : " + toyName);
        System.out.println("Toy Price : " + priceOfToy);
    }
}
application-context.xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="toy1"
          class="com.sub.day26.Toy">

        <property name="toyName"
                  value="IronMan"/>

        <property name="priceOfToy"
                  value="10000"/>

    </bean>


    <bean id="toy2"
          class="com.sub.day26.Toy">

        <property name="toyName"
                  value="CaptainAmerica"/>

        <property name="priceOfToy"
                  value="15000"/>

    </bean>

</beans>
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "application-context.xml");

        Toy toy1 = context.getBean("toy1", Toy.class);

        Toy toy2 = context.getBean("toy2", Toy.class);

        toy1.display();

        System.out.println("----------------");

        toy2.display();
    }
}
Output
Toy Name  : IronMan
Toy Price : 10000
----------------
Toy Name  : CaptainAmerica
Toy Price : 15000

PROGRAM 6 — @Configuration + @Bean
------------------------------------------------------------------------------------------------------------
This is the main Java Configuration program from Day 26.

The notes explain that Java Configuration performs the same IOC configuration work inside a Java class that XML performs inside application-context.xml.

Student.java
package com.sub.day26;

public class Student {

    public void work() {

        System.out.println(
                "Students are in proper track");
    }
}
JavaConfig.java
package com.sub.day26;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Student student() {

        return new Student();
    }
}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Student student =
                context.getBean("student", Student.class);

        student.work();
    }
}
Output
Students are in proper track

PROGRAM 7 — Java Configuration With Constructor Values
------------------------------------------------------------------------------------------------------------
This is the Java equivalent of an XML bean with properties/constructor values.

Toy.java
package com.sub.day26;

public class Toy {

    private String toyName;
    private int priceOfToy;

    public Toy(String toyName, int priceOfToy) {
        this.toyName = toyName;
        this.priceOfToy = priceOfToy;
    }

    public void display() {

        System.out.println("Toy Name  : " + toyName);
        System.out.println("Toy Price : " + priceOfToy);
    }
}
JavaConfig.java
package com.sub.day26;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Toy toy() {

        return new Toy("IronMan", 10000);
    }
}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Toy toy = context.getBean(Toy.class);

        toy.display();
    }
}

PROGRAM 8 — Multiple Beans With Different Values Using Java Configuration
------------------------------------------------------------------------------------------------------------
This is the better Java Configuration solution for the multiple-object problem discussed in the notes.

Toy.java
package com.sub.day26;

public class Toy {

    private String toyName;
    private int priceOfToy;

    public Toy(String toyName, int priceOfToy) {

        this.toyName = toyName;
        this.priceOfToy = priceOfToy;
    }

    public void display() {

        System.out.println("Toy Name  : " + toyName);
        System.out.println("Toy Price : " + priceOfToy);
    }
}
JavaConfig.java
package com.sub.day26;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Toy toy1() {

        return new Toy("IronMan", 10000);
    }

    @Bean
    public Toy toy2() {

        return new Toy("CaptainAmerica", 15000);
    }
}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Toy toy1 =
                context.getBean("toy1", Toy.class);

        Toy toy2 =
                context.getBean("toy2", Toy.class);

        toy1.display();

        System.out.println("----------------");

        toy2.display();
    }
}
Output
Toy Name  : IronMan
Toy Price : 10000
----------------
Toy Name  : CaptainAmerica
Toy Price : 15000

PROGRAM 9 — @Bean With Dependency
------------------------------------------------------------------------------------------------------------
Java Configuration can also create one bean and inject another bean into it.

File.java
package com.sub.day26;

public class File {

    public void read() {

        System.out.println("Reading file...");
    }
}
A.java
package com.sub.day26;

public class A {

    private File file;

    public A(File file) {
        this.file = file;
    }

    public void display() {

        System.out.println("A class");

        file.read();
    }
}
JavaConfig.java
package com.sub.day26;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public File file() {

        return new File();
    }

    @Bean
    public A a() {

        return new A(file());
    }
}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        A a = context.getBean(A.class);

        a.display();
    }
}
Output
A class
Reading file...

PROGRAM 10 — @Configuration + Component Scanning
------------------------------------------------------------------------------------------------------------
Java Configuration can also tell Spring to scan a package for stereotype annotations.

Student.java
package com.sub.day26;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public void work() {

        System.out.println(
                "Student is working...");
    }
}
JavaConfig.java
package com.sub.day26;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sub.day26")
public class JavaConfig {

}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Student student =
                context.getBean(Student.class);

        student.work();
    }
}

PROGRAM 11 — Java Configuration + @Value
------------------------------------------------------------------------------------------------------------
We can combine @Configuration, @Bean, and values.

Toy.java
package com.sub.day26;

public class Toy {

    private String toyName;
    private int price;

    public Toy(String toyName, int price) {

        this.toyName = toyName;
        this.price = price;
    }

    public void display() {

        System.out.println("Toy Name : " + toyName);
        System.out.println("Price    : " + price);
    }
}
JavaConfig.java
package com.sub.day26;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Toy toy() {

        return new Toy("IronMan", 10000);
    }
}

PROGRAM 12 — @Lazy
------------------------------------------------------------------------------------------------------------
The notes list @Lazy as the annotation used when we want to stop the object from being created immediately when the IOC container is created.

Student.java
package com.sub.day26;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Student {

    public Student() {

        System.out.println(
                "Student object created");
    }

    public void work() {

        System.out.println(
                "Student is working");
    }
}
JavaConfig.java
package com.sub.day26;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sub.day26")
public class JavaConfig {

}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        System.out.println("IOC Container Created");

        Student student =
                context.getBean(Student.class);

        student.work();
    }
}

PROGRAM 13 — @Scope
------------------------------------------------------------------------------------------------------------
The notes also cover managing whether Spring creates a singleton or different objects using @Scope.

Student.java
package com.sub.day26;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

    public Student() {

        System.out.println(
                "Student object created");
    }
}
JavaConfig.java
package com.sub.day26;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sub.day26")
public class JavaConfig {

}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Student s1 =
                context.getBean(Student.class);

        Student s2 =
                context.getBean(Student.class);

        System.out.println(s1 == s2);
    }
}
Output
Student object created
Student object created
false

PROGRAM 14 — @DependsOn
------------------------------------------------------------------------------------------------------------
The notes list @DependsOn for controlling bean creation dependency/order.

A.java
package com.sub.day26;

import org.springframework.stereotype.Component;

@Component
public class A {

    public A() {

        System.out.println("A object created");
    }
}
B.java
package com.sub.day26;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("a")
public class B {

    public B() {

        System.out.println("B object created");
    }
}
JavaConfig.java
package com.sub.day26;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sub.day26")
public class JavaConfig {

}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        context.getBean(B.class);
    }
}

PROGRAM 15 — @Qualifier With Java Configuration
------------------------------------------------------------------------------------------------------------
When multiple beans of the same type exist, @Qualifier can select the required one. This is the multiple-bean dependency concept listed in the notes.

File.java
package com.sub.day26;

public interface File {

    void read();
}
TextFile.java
package com.sub.day26;

public class TextFile implements File {

    @Override
    public void read() {

        System.out.println(
                "Reading Text File");
    }
}
PdfFile.java
package com.sub.day26;

public class PdfFile implements File {

    @Override
    public void read() {

        System.out.println(
                "Reading PDF File");
    }
}
A.java
package com.sub.day26;

import org.springframework.beans.factory.annotation.Qualifier;

public class A {

    private File file;

    public A(@Qualifier("pdfFile") File file) {

        this.file = file;
    }

    public void display() {

        file.read();
    }
}
JavaConfig.java
package com.sub.day26;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public File textFile() {

        return new TextFile();
    }

    @Bean
    public File pdfFile() {

        return new PdfFile();
    }

    @Bean
    public A a() {

        return new A(pdfFile());
    }
}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        A a = context.getBean(A.class);

        a.display();
    }
}
Output
Reading PDF File
Most Important Program — Java Configuration

For your Day 26 interview/practice, remember this program very well:
------------------------------------------------------------------------------------------------------------
Student.java
package com.sub.day26;

public class Student {

    public void work() {

        System.out.println(
                "Students are in proper track");
    }
}
JavaConfig.java
package com.sub.day26;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Student student() {

        return new Student();
    }
}
Main.java
package com.sub.day26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Student student =
                context.getBean("student", Student.class);

        student.work();
    }
}
Remember the 3 steps
1. @Configuration
       ↓
2. @Bean
       ↓
3. AnnotationConfigApplicationContext
XML vs Java Configuration
XML
--------------------------------
<bean id="student"
      class="com.sub.day26.Student"/>

        ↓

ClassPathXmlApplicationContext
JAVA CONFIGURATION
--------------------------------
@Configuration

@Bean
public Student student() {
    return new Student();
}

        ↓

AnnotationConfigApplicationContext

So the main conversion from your Day 26 notes is:

XML CONFIGURATION
        ↓
application-context.xml
        ↓
ClassPathXmlApplicationContext

becomes

JAVA CONFIGURATION
        ↓
@Configuration
@Bean
        ↓
AnnotationConfigApplicationContext
