# SPRING FRAMEWORK – COMPLETE NOTES (ONE FILE)

## 1. Introduction to Spring Framework

### What is Spring Framework?

Spring Framework is a lightweight, open-source Java framework used for developing enterprise applications. It provides support for Dependency Injection (DI), Inversion of Control (IoC), transaction management, security, and web application development.

### Features of Spring

1. Lightweight Framework
2. Dependency Injection (DI)
3. Inversion of Control (IoC)
4. Aspect-Oriented Programming (AOP)
5. Transaction Management
6. MVC Architecture
7. Easy Integration with Hibernate, JPA, JDBC, etc.
8. Easy Testing Support

### Advantages of Spring

* Loose Coupling
* Better Code Reusability
* Easy Maintenance
* Easy Unit Testing
* Reduced Boilerplate Code
* Enterprise-Level Development Support

---

# SESSION 1 : INTRODUCTION TO SPRING

## Evolution of Java EE to Spring

### Theory

Earlier enterprise applications were developed using Servlets, JSP, and EJB. EJB applications required heavy configuration, complex coding, and difficult deployment. Spring was introduced to simplify enterprise application development using POJO classes and Dependency Injection.

### Real-World Example

Many banking and e-commerce applications migrated from EJB architecture to Spring Boot microservices.

### Advantages

* Lightweight
* Less Configuration
* Easy Testing
* Better Performance

### Interview Questions

1. What is Java EE?
2. Why was Spring introduced?
3. What are the limitations of EJB?
4. How is Spring better than Java EE?

---

## Problems with Traditional Java

### Theory

Traditional Java applications suffered from:

* Tight Coupling
* Complex Object Creation
* Difficult Testing
* Large Amount of Boilerplate Code
* Poor Scalability

### Real-World Example

Large organizations faced difficulties maintaining huge Java applications due to tightly coupled classes.

### Solution by Spring

Spring introduces IoC and DI to solve these problems.

### Interview Questions

1. What is tight coupling?
2. What problems exist in traditional Java applications?
3. How does Spring solve these issues?

---

## Why Enterprises Use Spring

### Theory

Enterprises use Spring because it provides:

* Loose Coupling
* Dependency Injection
* Transaction Management
* Security
* Easy Testing
* Integration Support

### Real-World Example

Companies such as Amazon and Netflix use Spring-based architectures for scalable applications.

### Advantages

* Faster Development
* Better Maintenance
* Production Ready Features

### Interview Questions

1. Why is Spring popular?
2. Why do enterprises prefer Spring?
3. What are the benefits of Spring?

---

# SESSION 2 : DESIGN PATTERNS

## Strategy Design Pattern

### Definition

Strategy Pattern allows selecting an algorithm at runtime.

### Real-World Example

Google Pay allows users to pay using:

* UPI
* Credit Card
* Wallet

### Program

```java
interface PaymentStrategy{
    void pay(int amount);
}

class UpiPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid using UPI: " + amount);
    }
}

class CreditCardPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid using Credit Card: " + amount);
    }
}
```

### Advantages

* Flexible
* Reusable
* Easy to Extend

### Interview Questions

1. What is Strategy Pattern?
2. Where is Strategy Pattern used?
3. What are its advantages?

---

## Factory Design Pattern

### Definition

Factory Pattern creates objects without exposing object creation logic.

### Real-World Example

Vehicle showroom creates Car or Bike objects depending on customer choice.

### Program

```java
interface Employee{
    void work();
}

class Developer implements Employee{
    public void work(){
        System.out.println("Developer is coding");
    }
}

class EmployeeFactory{
    public static Employee getEmployee(String type){
        if(type.equals("developer")){
            return new Developer();
        }
        return null;
    }
}
```

### Advantages

* Loose Coupling
* Easy Object Creation
* Better Maintainability

### Interview Questions

1. What is Factory Pattern?
2. Why do we use Factory Pattern?
3. Difference between Factory and Constructor?

---

# SESSION 3 : IOC & DEPENDENCY INJECTION

## Inversion of Control (IoC)

### Definition

IoC means control of object creation is transferred from programmer to Spring Container.

### Without IoC

```java
Engine engine = new Engine();
Car car = new Car(engine);
```

### With IoC

```java
ApplicationContext context =
new ClassPathXmlApplicationContext("config.xml");

Car car = context.getBean("car",Car.class);
```

### Real-World Example

Spring automatically creates EmployeeService and EmployeeRepository objects.

### Advantages

* Loose Coupling
* Better Testing
* Centralized Object Management

### Interview Questions

1. What is IoC?
2. What is IoC Container?
3. Advantages of IoC?

---

## Dependency Injection (DI)

### Definition

Dependency Injection is the process of injecting dependent objects into another object.

### Types

1. Setter Injection
2. Constructor Injection

### Advantages

* Loose Coupling
* Easy Testing
* Better Maintainability

### Interview Questions

1. What is Dependency Injection?
2. Types of DI?
3. Benefits of DI?

---

## BeanFactory vs ApplicationContext

| BeanFactory      | ApplicationContext      |
| ---------------- | ----------------------- |
| Basic Container  | Advanced Container      |
| Lazy Loading     | Eager Loading           |
| Less Features    | More Features           |
| No Event Support | Event Support Available |

### Real-World Usage

ApplicationContext is used in most modern Spring applications.

### Interview Questions

1. Difference between BeanFactory and ApplicationContext?
2. Which container is commonly used?

---

## Advantages of Loose Coupling

### Definition

Loose coupling means classes are independent of each other.

### Example

```java
interface Engine{}
class PetrolEngine implements Engine{}
class DieselEngine implements Engine{}
```

### Benefits

* Easy Maintenance
* Better Testing
* Easy Modification
* Better Scalability

### Real-World Example

Changing MySQL database to PostgreSQL becomes easier.

---

# SESSION 4 : SETTER & CONSTRUCTOR INJECTION

## Setter Injection

### Definition

Dependencies are injected using setter methods.

### Program

```java
public class Student{

    private String name;

    public void setName(String name){
        this.name=name;
    }
}
```

### Advantages

* Flexible
* Optional Dependencies

---

## Constructor Injection

### Definition

Dependencies are injected through constructor.

### Program

```java
public class Employee{

    private String name;

    public Employee(String name){
        this.name=name;
    }
}
```

### Advantages

* Mandatory Dependencies
* Immutable Objects

---

## XML vs Annotation Configuration

| XML Configuration | Annotation Configuration |
| ----------------- | ------------------------ |
| More XML Code     | Less Code                |
| Hard to Maintain  | Easy to Maintain         |
| Older Approach    | Modern Approach          |

### Example

```java
@Component
public class Student{
}
```

### Interview Questions

1. XML vs Annotation?
2. Which approach is preferred?

---

## @Autowired and @Qualifier

### @Autowired

Automatically injects dependencies.

### @Qualifier

Used when multiple beans of the same type exist.

### Program

```java
@Component
class Bike{
}

@Component
class Student{

    @Autowired
    @Qualifier("bike")
    private Bike bike;
}
```

### Real-World Example

Selecting a specific payment service among multiple payment options.

---

# SESSION 5 : STEREOTYPE ANNOTATIONS

## @Component

### Definition

General-purpose Spring Bean.

```java
@Component
public class Student{
}
```

---

## @Service

### Definition

Represents Business Logic Layer.

```java
@Service
public class StudentService{
}
```

---

## @Repository

### Definition

Represents Data Access Layer.

```java
@Repository
public class StudentRepository{
}
```

---

## @Controller

### Definition

Handles Client Requests.

```java
@Controller
public class StudentController{
}
```

---

## Stereotype Annotation Architecture

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

### Real-World Example

Food Delivery Application:

Controller → Receives Order Request

Service → Processes Order

Repository → Stores Order in Database

---

## Component Scanning

### Definition

Spring automatically scans packages and creates bean objects.

### Configuration

```java
@Configuration
@ComponentScan("com.nit")
public class AppConfig{
}
```

### Advantages

* Automatic Bean Creation
* Less Configuration
* Easy Maintenance

---

# SESSION 6 : JAVA CONFIGURATION

## @Configuration

### Definition

Marks a class as Spring Configuration Class.

```java
@Configuration
public class AppConfig{
}
```

---

## @Bean

### Definition

Creates and registers Spring Beans.

### Program

```java
@Configuration
public class AppConfig{

    @Bean
    public Student student(){
        return new Student();
    }
}
```

### Advantages

* Replaces XML
* Easy Configuration
* Java-Based Configuration

---

## Bean Lifecycle

### Lifecycle Steps

```text
Bean Instantiation
      ↓
Dependency Injection
      ↓
Initialization
      ↓
Ready for Use
      ↓
Destroy
```

---

## @PostConstruct

Executed after bean creation.

```java
@PostConstruct
public void init(){
    System.out.println("Bean Initialized");
}
```

---

## @PreDestroy

Executed before bean destruction.

```java
@PreDestroy
public void destroy(){
    System.out.println("Bean Destroyed");
}
```

---

# SESSION 7 : BEAN SCOPES & LIFECYCLE

## Singleton Scope

### Definition

Only one object is created for the entire container.

```java
@Component
@Scope("singleton")
public class Student{
}
```

### Real-World Example

Database Configuration

---

## Prototype Scope

### Definition

New object created every time.

```java
@Component
@Scope("prototype")
public class Student{
}
```

### Real-World Example

Shopping Cart

---

## Singleton vs Prototype

| Singleton     | Prototype                |
| ------------- | ------------------------ |
| One Object    | Multiple Objects         |
| Default Scope | Explicitly Defined       |
| Shared Object | New Object Every Request |

---

## Init and Destroy Methods

### Program

```java
@Component
public class ProductService{

    @PostConstruct
    public void init(){
        System.out.println("Resources Allocated");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Resources Released");
    }
}
```

### Real-World Example

Database connections are initialized during startup and released during shutdown.

---

# IMPORTANT SPRING ANNOTATIONS

## Core Annotations

```java
@Component
@Service
@Repository
@Controller
@Autowired
@Qualifier
@Value
@Scope
@Configuration
@Bean
@ComponentScan
@PostConstruct
@PreDestroy
```

---

# SPRING APPLICATION ARCHITECTURE

```text
Client Request
      ↓
Controller
      ↓
Service
      ↓
Repository
      ↓
Database
      ↓
Response
```

---

# PRACTICE PROGRAMS

1. Student & Address using Setter Injection
2. Employee & Department using Constructor Injection
3. Payment Gateway using Strategy Pattern
4. Employee Factory using Factory Pattern
5. Java Config using @Configuration and @Bean
6. Component Scanning Example
7. Bean Scope Example
8. @Autowired and @Qualifier Example
9. Bean Lifecycle Example
10. CRUD Architecture using Controller, Service, Repository

---

# CONCLUSION

Spring Framework is one of the most popular Java frameworks used for enterprise application development. It provides IoC, Dependency Injection, Bean Management, Stereotype Annotations, Java Configuration, Bean Scopes, and Lifecycle Management. By learning Spring concepts such as IoC, DI, Design Patterns, Bean Scopes, and Stereotype Annotations, developers can build scalable, maintainable, and enterprise-level applications efficiently.
