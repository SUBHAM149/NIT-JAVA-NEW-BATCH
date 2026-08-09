|- The issue with only xml type configuration approach 
|- The issue with only Annotation type configuration approach 
[ All Theory ]



Spring Annotation — All Programs in One Package
-----------------------------------------------
1. Project Structure
Spring_Annotation_Day08
│
├── src/main/java
│   └── com.sub.day25
│       ├── A.java
│       ├── B.java
│       ├── FileReader.java
│       ├── Student.java
│       ├── AppConfig.java
│       └── Main.java
│
└── src/main/resources
    ├── application-context.xml
    └── application.properties

Package for every Java class:

package com.sub.day25;
PROGRAM 1 — XML Configuration Approach
-----------------------------------------------
This is the basic XML approach from the notes.

FileReader.java
package com.sub.day25;

public class FileReader {

    public void readFile() {
        System.out.println("Reading file...");
    }
}
application-context.xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="fileReader" class="com.sub.day25.FileReader"/>

</beans>
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        FileReader fileReader = context.getBean(FileReader.class);

        fileReader.readFile();
    }
}
Output
Reading file...

PROGRAM 2 — Annotation Approach
-----------------------------------------------
The notes show that instead of XML bean declaration, we can use annotations such as @Component.

FileReader.java
package com.sub.day25;

import org.springframework.stereotype.Component;

@Component
public class FileReader {

    public void readFile() {
        System.out.println("Reading file using Annotation...");
    }
}
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.sub.day25");

        FileReader fileReader = context.getBean(FileReader.class);

        fileReader.readFile();
    }
}
Output
Reading file using Annotation...

PROGRAM 3 — @Component + @Autowired
-----------------------------------------------
This is one of the main annotation examples from your notes.

FileReader.java
package com.sub.day25;

import org.springframework.stereotype.Component;

@Component
public class FileReader {

    public void readFile() {
        System.out.println("File is reading...");
    }
}
A.java
package com.sub.day25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    private FileReader fileReader;

    public void display() {

        System.out.println("A class method");

        fileReader.readFile();
    }
}
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.sub.day25");

        A obj = context.getBean(A.class);

        obj.display();
    }
}
Output
A class method
File is reading...

PROGRAM 4 — @Autowired Setter Injection
-----------------------------------------------
The notes also show setter-based injection.

FileReader.java
package com.sub.day25;

import org.springframework.stereotype.Component;

@Component
public class FileReader {

    public void readFile() {
        System.out.println("Reading file...");
    }
}
A.java
package com.sub.day25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    private FileReader fileReader;

    @Autowired
    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void display() {

        System.out.println("Setter Injection");

        fileReader.readFile();
    }
}
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.sub.day25");

        A a = context.getBean(A.class);

        a.display();
    }
}

PROGRAM 5 — @Qualifier
-----------------------------------------------
Suppose there are two beans of the same type.

FileReader.java
package com.sub.day25;

public interface FileReader {

    void read();
}
TextFileReader.java
package com.sub.day25;

import org.springframework.stereotype.Component;

@Component("textFileReader")
public class TextFileReader implements FileReader {

    @Override
    public void read() {
        System.out.println("Reading Text File");
    }
}
PdfFileReader.java
package com.sub.day25;

import org.springframework.stereotype.Component;

@Component("pdfFileReader")
public class PdfFileReader implements FileReader {

    @Override
    public void read() {
        System.out.println("Reading PDF File");
    }
}
A.java
package com.sub.day25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    @Qualifier("pdfFileReader")
    private FileReader fileReader;

    public void display() {

        fileReader.read();
    }
}
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.sub.day25");

        A a = context.getBean(A.class);

        a.display();
    }
}
Output
Reading PDF File

PROGRAM 6 — @Scope
-----------------------------------------------
Create a bean with different scopes.

Student.java
package com.sub.day25;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

    public Student() {
        System.out.println("Student Object Created");
    }
}
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.sub.day25");

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);

        System.out.println(s1 == s2);
    }
}
Output
Student Object Created
Student Object Created
false

Because prototype creates a new object each time.

PROGRAM 7 — @Lazy
-----------------------------------------------
@Lazy delays bean creation until the bean is actually requested.

Student.java
package com.sub.day25;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Student {

    public Student() {
        System.out.println("Student Object Created");
    }

    public void display() {
        System.out.println("Student Display Method");
    }
}
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.sub.day25");

        System.out.println("Container Created");

        Student student = context.getBean(Student.class);

        student.display();
    }
}
Output
Container Created
Student Object Created
Student Display Method

PROGRAM 8 — @DependsOn
-----------------------------------------------
This makes one bean depend on another bean's creation.

A.java
package com.sub.day25;

import org.springframework.stereotype.Component;

@Component
public class A {

    public A() {
        System.out.println("A Object Created");
    }
}
B.java
package com.sub.day25;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("a")
public class B {

    public B() {
        System.out.println("B Object Created");
    }
}
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.sub.day25");

        context.getBean(B.class);
    }
}

PROGRAM 9 — @Value
-----------------------------------------------
Your notes specifically show using @Value to inject values into fields such as toyName and priceOfToy.

Student.java
package com.sub.day25;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("IronMan")
    private String toyName;

    @Value("10000")
    private int priceOfToy;

    public void display() {

        System.out.println("Toy Name : " + toyName);
        System.out.println("Toy Price : " + priceOfToy);
    }
}
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.sub.day25");

        Student student = context.getBean(Student.class);

        student.display();
    }
}
Output
Toy Name : IronMan
Toy Price : 10000

PROGRAM 10 — @Value From application.properties
--------------------------------------------------------------------------------
This is better when values need to be changed without changing Java source code.

application.properties
toy.name=IronMan
toy.price=10000
Student.java
package com.sub.day25;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${toy.name}")
    private String toyName;

    @Value("${toy.price}")
    private int priceOfToy;

    public void display() {

        System.out.println("Toy Name : " + toyName);
        System.out.println("Toy Price : " + priceOfToy);
    }
}
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.sub.day25");

        Student student = context.getBean(Student.class);

        student.display();
    }
}

PROGRAM 11 — Multiple Objects With Different Values
--------------------------------------------------------------
Your notes point out an important limitation: with annotation-based component scanning, creating multiple objects of the same component with different values is not as straightforward as defining multiple XML beans.

XML can do this easily:

<bean id="toy1" class="com.sub.day25.Student">
    <property name="toyName" value="IronMan"/>
    <property name="priceOfToy" value="10000"/>
</bean>

<bean id="toy2" class="com.sub.day25.Student">
    <property name="toyName" value="CaptainAmerica"/>
    <property name="priceOfToy" value="15000"/>
</bean>

This creates:

toy1 → IronMan → 10000
toy2 → CaptainAmerica → 15000

PROGRAM 12 — Combination of XML + Annotation
-----------------------------------------------------
This is another important section in your notes.

The idea is:

Annotation
   +
XML
   ↓
ApplicationContext
FileReader.java
package com.sub.day25;

import org.springframework.stereotype.Component;

@Component
public class FileReader {

    public void read() {
        System.out.println("Reading file...");
    }
}
A.java
package com.sub.day25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    private FileReader fileReader;

    @Autowired
    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void display() {

        System.out.println("A class");
        fileReader.read();
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

    <context:component-scan base-package="com.sub.day25"/>

</beans>
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        A a = context.getBean(A.class);

        a.display();
    }
}
PROGRAM 13 — Java Configuration Approach
-----------------------------------------------
The notes also mention that Spring provides Java Configuration as an alternative to XML.

Student.java
package com.sub.day25;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
AppConfig.java
package com.sub.day25;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {

        return new Student("Subham", 22);
    }
}
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);

        student.display();
    }
}
Output
Name : Subham
Age  : 22

PROGRAM 14 — Java Configuration With Multiple Beans
----------------------------------------------------------
This solves the problem of creating multiple objects with different values.

Student.java
package com.sub.day25;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
AppConfig.java
package com.sub.day25;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student1() {

        return new Student("Subham", 22);
    }

    @Bean
    public Student student2() {

        return new Student("Rahul", 25);
    }
}
Main.java
package com.sub.day25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student s1 = context.getBean("student1", Student.class);
        Student s2 = context.getBean("student2", Student.class);

        s1.display();

        System.out.println("----------------");

        s2.display();
    }
}

Important Annotations From Your Notes
----------------------------------------------------------------------
The notes list the main stereotype and dependency-related annotations.

| Annotation        | Purpose                          |
| ----------------- | -------------------------------- |
| `@Component`      | Creates Spring bean              |
| `@Service`        | Marks service class              |
| `@Controller`     | Marks MVC controller             |
| `@RestController` | REST controller                  |
| `@Repository`     | Repository/DAO class             |
| `@Autowired`      | Dependency injection             |
| `@Qualifier`      | Selects a particular bean        |
| `@Scope`          | Defines bean scope               |
| `@Lazy`           | Lazy bean creation               |
| `@DependsOn`      | Defines bean creation dependency |
| `@Value`          | Injects values                   |
| `@PropertySource` | Loads properties file            |
| `@Configuration`  | Java configuration class         |
| `@Bean`           | Creates bean manually            |




                 SPRING CONFIGURATION
                        |
          +-------------+-------------+
          |                           |
      XML Approach              Annotation Approach
          |                           |
 application-context.xml       @Component
          |                    @Autowired
 ClassPathXmlApplicationContext @Qualifier
          |                    @Scope
          |                    @Lazy
          |                    @DependsOn
          |                    @Value
          |                           |
          +-------------+-------------+
                        |
                  ApplicationContext
                        |
                    Spring Bean
                        |
                Dependency Injection
