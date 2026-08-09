Java Configuration Approach with @Bean ,@Lazy,@scope , @DependsOn , @Bean(autowire) , @Primary
Day 27 – Annotation Day 10 notes. This page continues the Java Configuration approach and focuses on dependency injection by type/name, @Primary, @Bean, @Autowired, and bean scope/lifecycle-related annotations such as @Scope, @Lazy, and @DependsOn.

I’ll again put all Java classes in ONE PACKAGE: com.sub.day27, so you can practice everything together.

Spring Day 27 — Annotation Day 10
-------------------------------------------------------
Day 27 — Annotation / Java Configuration Programs
Spring_Day27
│
├── src/main/java
│   └── com.sub.day27
│       ├── A.java
│       ├── B.java
│       ├── Rocket.java
│       ├── Launcher.java
│       ├── Student.java
│       ├── University.java
│       └── JavaConfig.java
│
└── src/main/resources
    └── application-context.xml

All Programs in One Package
1. Basic Dependency Injection — Setter Injection
-----------------------------------------------------------------------
The basic example in the notes has class A depending on class B.

B.java
package com.sub.day27;

public class B {

    public void display() {

        System.out.println("B class method");
    }
}
A.java
package com.sub.day27;

public class A {

    private B b;

    public void setB(B b) {

        this.b = b;
    }

    public void display() {

        System.out.println("A class method");

        b.display();
    }
}

2. XML Approach
-----------------------------------------------------------------------
The notes compare the Java Configuration approach with the traditional XML approach.

application-context.xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="b"
          class="com.sub.day27.B"/>

    <bean id="a"
          class="com.sub.day27.A">

        <property name="b" ref="b"/>

    </bean>

</beans>
Main.java
package com.sub.day27;

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

3. Annotation Approach
-----------------------------------------------------------------------
Instead of defining beans in XML, we can use @Component.

B.java
package com.sub.day27;

import org.springframework.stereotype.Component;

@Component
public class B {

    public void display() {

        System.out.println("B class method");
    }
}
A.java
package com.sub.day27;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    private B b;

    @Autowired
    public void setB(B b) {

        this.b = b;
    }

    public void display() {

        System.out.println("A class method");

        b.display();
    }
}
Main.java
package com.sub.day27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        "com.sub.day27");

        A a = context.getBean(A.class);

        a.display();
    }
}

4. Java Configuration Approach
-----------------------------------------------------------------------
Now the important part of Day 27.

Instead of:

application-context.xml
        ↓
<bean>
        ↓
ClassPathXmlApplicationContext

we use:

JavaConfig.java
        ↓
@Configuration
@Bean
        ↓
AnnotationConfigApplicationContext
B.java
package com.sub.day27;

public class B {

    public void display() {

        System.out.println("B class method");
    }
}
A.java
package com.sub.day27;

public class A {

    private B b;

    public void setB(B b) {

        this.b = b;
    }

    public void display() {

        System.out.println("A class method");

        b.display();
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public B b() {

        return new B();
    }

    @Bean
    public A a() {

        A obj = new A();

        obj.setB(b());

        return obj;
    }
}
Main.java
package com.sub.day27;

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
A class method
B class method

5. Rocket Launcher Example — Without Java Configuration
-----------------------------------------------------------------------
The notes use a Rocket / Launcher example to explain dependency injection.

Rocket.java
package com.sub.day27;

public class Rocket {

    private Launcher launcher;

    public void setLauncher(Launcher launcher) {

        this.launcher = launcher;
    }

    public void ignite() {

        launcher.powerSupplied();

        System.out.println(
                "Rocket is set to go");
    }
}
Launcher.java
package com.sub.day27;

public class Launcher {

    public void powerSupplied() {

        System.out.println(
                "Rocket fuel & all setup done");
    }
}

6. Rocket Launcher Using Java Configuration
-----------------------------------------------------------------------
This is one of the main programs from the notes.

Rocket.java
package com.sub.day27;

public class Rocket {

    private Launcher launcher;

    public void setLauncher(Launcher launcher) {

        this.launcher = launcher;
    }

    public void ignite() {

        launcher.powerSupplied();

        System.out.println(
                "Rocket is set to go");
    }
}
Launcher.java
package com.sub.day27;

public class Launcher {

    public void powerSupplied() {

        System.out.println(
                "Rocket fuel & all setup done");
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Rocket rocket() {

        Rocket rocket = new Rocket();

        rocket.setLauncher(launcher());

        return rocket;
    }

    @Bean
    public Launcher launcher() {

        return new Launcher();
    }
}
Main.java
package com.sub.day27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Rocket rocket =
                context.getBean(
                        "rocket",
                        Rocket.class);

        rocket.ignite();
    }
}
Output
Rocket fuel & all setup done
Rocket is set to go

7. Java Configuration + @Autowired
-----------------------------------------------------------------------
The notes then demonstrate using @Autowired together with Java Configuration.

Rocket.java
package com.sub.day27;

import org.springframework.beans.factory.annotation.Autowired;

public class Rocket {

    private Launcher launcher;

    @Autowired
    public void setLauncher(Launcher launcher) {

        this.launcher = launcher;
    }

    public void ignite() {

        launcher.powerSupplied();

        System.out.println(
                "Rocket is set to go");
    }
}
Launcher.java
package com.sub.day27;

public class Launcher {

    public void powerSupplied() {

        System.out.println(
                "Rocket fuel & all setup done");
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Rocket rocket() {

        return new Rocket();
    }

    @Bean
    public Launcher launcher() {

        return new Launcher();
    }
}
Main.java
package com.sub.day27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Rocket rocket =
                context.getBean(Rocket.class);

        rocket.ignite();
    }
}

8. Multiple Beans — @Autowired By Type
-----------------------------------------------------------------------
This is an important concept in the Day 27 notes.

Suppose we have:

Launcher
   ↑
   |
Launcher1
Launcher2

Spring sees more than one bean of the same type.

That can create an ambiguity.

Launcher.java
package com.sub.day27;

public class Launcher {

    public void start() {

        System.out.println(
                "Launcher started");
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Launcher launcher1() {

        return new Launcher();
    }

    @Bean
    public Launcher launcher2() {

        return new Launcher();
    }
}

Now Spring has:

launcher1 → Launcher
launcher2 → Launcher

If a class simply asks:

@Autowired
private Launcher launcher;

Spring cannot determine which bean should be injected.

9. @Primary
-----------------------------------------------------------------------
The notes show @Primary as one solution when multiple beans of the same type exist.

Launcher.java
package com.sub.day27;

public class Launcher {

    private String name;

    public Launcher(String name) {

        this.name = name;
    }

    public void start() {

        System.out.println(
                name + " started");
    }
}
Rocket.java
package com.sub.day27;

import org.springframework.beans.factory.annotation.Autowired;

public class Rocket {

    private Launcher launcher;

    @Autowired
    public void setLauncher(Launcher launcher) {

        this.launcher = launcher;
    }

    public void ignite() {

        launcher.start();

        System.out.println(
                "Rocket launched");
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {

    @Bean
    @Primary
    public Launcher launcher1() {

        return new Launcher("Launcher 1");
    }

    @Bean
    public Launcher launcher2() {

        return new Launcher("Launcher 2");
    }

    @Bean
    public Rocket rocket() {

        return new Rocket();
    }
}
Main.java
package com.sub.day27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Rocket rocket =
                context.getBean(Rocket.class);

        rocket.ignite();
    }
}
Output
Launcher 1 started
Rocket launched
Important
@Primary

means:

If multiple beans of the same type are available, prefer this bean by default.

10. @Qualifier
-----------------------------------------------------------------------
Another way to solve the multiple-bean problem is @Qualifier.

Rocket.java
package com.sub.day27;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Rocket {

    private Launcher launcher;

    @Autowired
    public void setLauncher(
            @Qualifier("launcher2")
            Launcher launcher) {

        this.launcher = launcher;
    }

    public void ignite() {

        launcher.start();

        System.out.println(
                "Rocket launched");
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Launcher launcher1() {

        return new Launcher("Launcher 1");
    }

    @Bean
    public Launcher launcher2() {

        return new Launcher("Launcher 2");
    }

    @Bean
    public Rocket rocket() {

        return new Rocket();
    }
}
Output
Launcher 2 started
Rocket launched
Difference
@Primary
    ↓
Default preferred bean
@Qualifier
    ↓
Explicitly select a particular bean

11. @Bean Default Scope — Singleton
-----------------------------------------------------------------------
The Day 27 notes explain that the default bean scope is singleton.

Student.java
package com.sub.day27;

public class Student {

    public Student() {

        System.out.println(
                "Student object created");
    }
}
JavaConfig.java
package com.sub.day27;

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
package com.sub.day27;

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
true

Only one object is created.

12. @Scope("prototype")
-----------------------------------------------------------------------
Now we create a new object whenever we request the bean.

Student.java
package com.sub.day27;

public class Student {

    public Student() {

        System.out.println(
                "Student object created");
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean
    @Scope("prototype")
    public Student student() {

        return new Student();
    }
}
Main.java
package com.sub.day27;

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
13. @Lazy
-----------------------------------------------------------------------
The notes also demonstrate @Lazy with Java Configuration.

Student.java
package com.sub.day27;

public class Student {

    public Student() {

        System.out.println(
                "Student object created");
    }

    public void work() {

        System.out.println(
                "Working");
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class JavaConfig {

    @Bean
    @Lazy
    public Student student() {

        return new Student();
    }
}
Main.java
package com.sub.day27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        System.out.println(
                "Container created");

        Student student =
                context.getBean(Student.class);

        student.work();
    }
}
Output
Container created
Student object created
Working

The object is created only when getBean() requests it.

14. @DependsOn
-----------------------------------------------------------------------
The notes show @DependsOn together with Java Configuration.

Student.java
package com.sub.day27;

public class Student {

    public Student() {

        System.out.println(
                "Student object created");
    }
}
University.java
package com.sub.day27;

public class University {

    public University() {

        System.out.println(
                "University object created");
    }

    public void verify() {

        System.out.println(
                "Student Verification");
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class JavaConfig {

    @Bean
    @DependsOn("university")
    public Student student() {

        return new Student();
    }

    @Bean
    public University university() {

        return new University();
    }
}
Main.java
package com.sub.day27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Student student =
                context.getBean(Student.class);

        University university =
                context.getBean(University.class);

        university.verify();
    }
}
15. @Bean + @Scope + @Lazy + @DependsOn
-----------------------------------------------------------------------
This combines the annotations shown together in the final section of your notes.

Student.java
package com.sub.day27;

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
University.java
package com.sub.day27;

public class University {

    public University() {

        System.out.println(
                "University object created");
    }

    public void verify() {

        System.out.println(
                "Student Verification");
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean
    @Scope("prototype")
    @Lazy
    @DependsOn("university")
    public Student student() {

        return new Student();
    }

    @Bean
    public University university() {

        return new University();
    }
}
Main.java
package com.sub.day27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Student student1 =
                context.getBean(Student.class);

        Student student2 =
                context.getBean(Student.class);

        System.out.println(
                student1 == student2);
    }
}
Output
University object created
Student object created
Student object created
false
16. @Component + Java Configuration
-----------------------------------------------------------------------
The notes also show a Student component example.

Student.java
package com.sub.day27;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student() {

        System.out.println(
                "Student joined");
    }

    public void work() {

        System.out.println(
                "Working");
    }
}
University.java
package com.sub.day27;

public class University {

    public University() {

        System.out.println(
                "University created");
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sub.day27")
public class JavaConfig {

}
Main.java
package com.sub.day27;

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
17. Important Program From the Notes — Two Student Objects
-----------------------------------------------------------------------
The lower-left portion of the notes demonstrates retrieving Student beans from the application context and checking whether they are the same object.

Student.java
package com.sub.day27;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student() {

        System.out.println(
                "Student joined");
    }

    public void work() {

        System.out.println(
                "Working");
    }
}
JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sub.day27")
public class JavaConfig {

}
Main.java
package com.sub.day27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class);

        Student student1 =
                context.getBean("student", Student.class);

        Student student2 =
                context.getBean("student", Student.class);

        student1.work();

        System.out.println(
                student1 == student2);
    }
}
Output
Student joined
Working
true

Because @Component beans are singleton by default.

18. Change Student to Prototype
-----------------------------------------------------------------------
Now change only the configuration.

JavaConfig.java
package com.sub.day27;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean
    @Scope("prototype")
    public Student student() {

        return new Student();
    }
}

Now:

Student student1 =
        context.getBean(Student.class);

Student student2 =
        context.getBean(Student.class);

gives:

student1 == student2

as:

false
19. Complete Day 27 Annotation List
-----------------------------------------------------------------------
| Annotation       | Purpose                           |
| ---------------- | --------------------------------- |
| `@Configuration` | Marks Java configuration class    |
| `@Bean`          | Creates/registers a Spring bean   |
| `@Autowired`     | Performs dependency injection     |
| `@Primary`       | Gives preference to one bean      |
| `@Qualifier`     | Selects a specific bean           |
| `@Scope`         | Changes bean scope                |
| `@Lazy`          | Delays bean creation              |
| `@DependsOn`     | Controls bean creation dependency |
| `@Component`     | Registers class as Spring bean    |
| `@ComponentScan` | Scans package for components      |

--------------------------------------------------------
@Bean
@Bean
public Student student() {

    return new Student();
}

Spring registers the returned object as a bean.

@Configuration
@Configuration
public class JavaConfig {

}

This class contains Spring Java-based configuration.

@Autowired
@Autowired
public void setLauncher(Launcher launcher) {

    this.launcher = launcher;
}

Spring automatically injects the matching dependency.

Multiple beans problem
Launcher
   |
   +---- launcher1
   |
   +---- launcher2

@Autowired alone can become ambiguous.

Solutions:

@Primary

or

@Qualifier
@Primary
@Bean
@Primary
public Launcher launcher1() {

    return new Launcher();
}

Spring prefers launcher1.

@Qualifier
@Autowired
@Qualifier("launcher2")
private Launcher launcher;

Spring specifically selects launcher2.

Default scope
@Bean
     ↓
singleton
     ↓
one object
Prototype
@Bean
@Scope("prototype")
public Student student() {

    return new Student();
}

Each getBean() can return a new object.

Lazy
@Bean
@Lazy
public Student student() {

    return new Student();
}

Bean creation is delayed until needed.

DependsOn
@Bean
@DependsOn("university")
public Student student() {

    return new Student();
}

university is created before student.
