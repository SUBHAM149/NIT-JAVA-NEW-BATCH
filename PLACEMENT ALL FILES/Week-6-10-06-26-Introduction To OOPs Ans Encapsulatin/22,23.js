Week-6-(22,23)                                        22.INTRODUCTION TO OOP'S
                                                     --------------------------
Interview Questions
-------------------
1.What is Object-Oriented Programming(OOP)?
Ans-Object-Oriented Programming (OOP) is a programming method that uses objects and classes to create programs.
It helps organize code and makes it easy to reuse, understand, and maintain.

Key Features of OOP:
Class – A blueprint for creating objects.
Object – An instance of a class.
Inheritance – Acquiring properties and methods from another class.
Polymorphism – One action can perform different tasks.
Encapsulation – Wrapping data and methods into a single unit.
Abstraction – Hiding implementation details and showing only essential features.
Example:
class Student {
    String name;

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Subham";
        s.display();
    }
}

Output:

Student Name: Subham

2.What are the main principals/features OOP?Explain each briefly?
Ans-
The four main principles of Object-Oriented Programming (OOP) are:

1. Encapsulation
Encapsulation means wrapping data and methods into a single unit (class) and protecting the data from direct access.
Example: Using private variables and public getter/setter methods.

2. Inheritance
Inheritance means one class can acquire the properties and methods of another class.
Example: A Dog class can inherit features from an Animal class.

3. Polymorphism
Polymorphism means one method can perform different tasks in different situations.
Example: A method named draw() can draw a circle, rectangle, or triangle.

4. Abstraction
Abstraction means hiding unnecessary details and showing only essential information.
Example: When driving a car, you use the steering wheel and pedals without knowing the internal engine details.

Short Answer:
Encapsulation → Data hiding.
Inheritance → Reusing code from another class.
Polymorphism → One action, many forms.
Abstraction → Hiding implementation details
| OOP Concept       | Meaning                | Real-Time Example   |
| ----------------- | ---------------------- | ------------------- |
| **Encapsulation** | Data Hiding            | **ATM Machine**     |
| **Inheritance**   | Reusing Code           | **Vehicle → Car**   |
| **Polymorphism**  | One Action, Many Forms | **Payment Methods** |
| **Abstraction**   | Hiding Implementation  | **Car Driving**     |

3.W hat is an Object in Java?
Ans-
An Object is an instance of a class. It represents a real-world entity and contains data (variables) and behavior (methods).

Example:
Class → Student
Object → Subham, Rahul, Priya

4.What is Class in Java?How is it different from an Object?
Ans-A Class is a blueprint or template used to create objects. It defines the properties (variables) and behaviors (methods) that objects will have.
 
An Object is a real instance of a class. It occupies memory and can access the variables and methods defined in the class.
| Class                               | Object                       |
| ----------------------------------- | ---------------------------- |
| Blueprint or template               | Instance of a class          |
| Does not occupy memory when defined | Occupies memory when created |
| Used to create objects              | Created from a class         |
| Logical entity                      | Physical entity              |


5.What is difference between Procedural(function) programming and Object-Oriented Programming?
Ans-
| Procedural Programming                           | Object-Oriented Programming                     |
| ------------------------------------------------ | ----------------------------------------------- |
| Program is divided into functions.               | Program is divided into objects.                |
| Follows a top-down approach.                     | Follows a bottom-up approach.                   |
| Data and functions are separate.                 | Data and methods are combined into objects.     |
| Less secure because data is globally accessible. | More secure due to data hiding (Encapsulation). |
| Suitable for small programs.                     | Suitable for large and complex programs.        |
| Examples: C, Pascal                              | Examples: Java, C++, Python                     |

6.Why is OOP support security in applications?
Ans-Object-Oriented Programming (OOP) supports security through Encapsulation and Data Hiding.

-->Encapsulation binds data and methods into a single unit (class).
-->Data Hiding restricts direct access to data using access modifiers such as private, protected, and public.
-->Sensitive data cannot be modified directly from outside the class.
-->Data can be accessed only through controlled methods (getters and setters).
Example:
class BankAccount {
    private double balance; // hidden data

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());

        // acc.balance = 10000; // Error: balance is private
    }
}
Output:
Balance: 5000.0

7.Why is java considered a pure Object-Oriented languages?
Ans-Java is considered an Object-Oriented Programming (OOP) language because it is based on the concepts of Classes and Objects and supports the main features of OOP:
Encapsulation – Wrapping data and methods into a single unit (class).
Inheritance – One class can inherit properties from another class.
Polymorphism – One method can perform different tasks.
Abstraction – Hiding implementation details and showing only essential features.
Example:
class Student {
    String name = "Subham";

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(); // Object creation
        s.display();
    }
}
Output:
Name: Subham

8.How does OOP support security in Applications?
Ans-Object-Oriented Programming (OOP) supports security through Encapsulation and Data Hiding.
Data is kept private inside a class using the private keyword.
Direct access to sensitive data is restricted.
Data can be accessed or modified only through public methods.
This prevents unauthorized access and protects data from accidental changes.
Example:
class Employee {
    private double salary; // hidden data

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setSalary(50000);
        System.out.println("Salary: " + emp.getSalary());
    }
}
Output:
Salary: 50000.0

9.What happens in memory when an object is Created?
Ans-When an object is created using the new keyword, memory is allocated in the Heap Memory. The object stores its instance variables in the heap, and a reference variable is created in the stack memory to point to that object.
Steps:
JVM allocates memory in the Heap Area.
Instance variables are initialized with default values.
Constructor is executed.
A reference variable stores the address of the object.
Example:
class Student {
    int id;
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
Memory Representation:
Stack Memory               Heap Memory
------------              -------------
s  -----------►          Student Object
                          id = 0
Explanation:
Student s → Reference variable stored in Stack Memory.
new Student() → Creates an object in Heap Memory.
s holds the reference (address) of the object.
The variable id gets the default value 0.

10.Can a class exist without objects?Explain with example?
Ans-Yes, a class can exist without creating any objects.
A class is just a blueprint or template. It can be defined in a program even if no object is created from it.
However, to access non-static variables and methods, we need to create an object of the class.
Example:
class Student {
    void display() {
        System.out.println("Welcome to Java");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Executed");
    }
}
Output:
Program Executed

Explanation:
The Student class exists in the program.
No object of Student is created.
Therefore, the display() method is not executed.
The program runs successfully.
Example with Object Creation:
class Student {
    void display() {
        System.out.println("Welcome to Java");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(); // Object created
        s.display();
    }
}
Output:
Welcome to Java

11.What is an Immutable object?How to create one in Java?
Ans-An Immutable Object is an object whose state (data) cannot be changed after it is created.
Once the object is initialized, its values remain constant throughout its lifetime.
Rules to Create an Immutable Class:
Declare the class as final.
Make all data members private and final.
Do not provide setter methods.
Initialize data through a constructor.
Provide only getter methods to read data.
Example:
--------
final class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(101, "Subham");

        System.out.println("Id: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}
Output:
Id: 101
Name: Subham

12.What are the advantages of using OOP?
Ans-
12. What are the Advantages of using OOP?

Ans:

Object-Oriented Programming (OOP) provides several advantages that make software development easier, more secure, and more efficient.

Advantages of OOP:
1.Code Reusability
  Reuse existing code through Inheritance.
  Reduces duplication of code.
2.Data Security
  Protects data using Encapsulation and Data Hiding.
  Restricts unauthorized access.
3.Easy Maintenance
  Programs are organized into classes and objects.
  Easier to update and maintain.
4.Modularity
  Large programs can be divided into smaller, manageable classes.
5.Flexibility
  Polymorphism allows one interface to perform multiple tasks.
6.Abstraction
  Hides unnecessary implementation details.
  Shows only essential features to the user.
7.Better Problem Solving
  Models real-world entities as objects.
  Makes programs easier to understand.
Example:
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}
Output:
Animal makes sound
Dog barks

13.What is the SOLID principal in OOP?
Ans-
SOLID is a set of five design principles used in Object-Oriented Programming to create software that is easy to understand, maintain, and extend.

SOLID Principles:
S - Single Responsibility Principle (SRP)
-->A class should have only one responsibility or one reason to change.

Example:
class Employee {
    void calculateSalary() {
        System.out.println("Calculating Salary");
    }
}
O - Open/Closed Principle (OCP)
-->A class should be open for extension but closed for modification.

Example:
Add new features by creating new classes instead of changing existing code.

L - Liskov Substitution Principle (LSP)
-->A child class should be able to replace its parent class without affecting the program.

Example:
class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}
I - Interface Segregation Principle (ISP)
-->A class should not be forced to implement methods it does not need.

Example:
Create small and specific interfaces instead of one large interface.
-->D - Dependency Inversion Principle (DIP)
High-level modules should depend on abstractions, not concrete classes.

Example:
Use interfaces instead of directly depending on implementation classes.

Simple Memory Trick:
S O L I D
----------
S → Single Responsibility
O → Open/Closed
L → Liskov Substitution
I → Interface Segregation
D → Dependency Inversion

                                                            23.ENCAPSULAATION
                                                           -------------------
Interview Questions
-------------------
1.What is Encapsulation?
Ans-Encapsulation is the process of wrapping data (variables) and methods (functions) into a single unit called a class and restricting direct access to the data using access modifiers like private.
Example:
class Student {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
Here, age is private and can only be accessed through setAge() and getAge() methods.

2.How is encapsulation different from abstraction?
Ans-
| Encapsulation                                | Abstraction                                                         |
| -------------------------------------------- | ------------------------------------------------------------------- |
| Hides the data by making variables private.  | Hides the implementation details and shows only essential features. |
| Achieved using classes and access modifiers. | Achieved using abstract classes and interfaces.                     |
| Focuses on data security.                    | Focuses on reducing complexity.                                     |

3.Why is encapsulation important in object-oriented programming?
Ans-Encapsulation is important because it binds data and methods into a single unit (class) and protects data from unauthorized access.
Importance of Encapsulation:
----------------------------
Provides data security by hiding data.
Prevents direct access to sensitive information.
Improves code maintainability and reusability.
Makes the program more flexible and easier to modify.
Reduces the chances of data corruption.

4.How do you achieve encapsulation in object-oriented programming?
Ans-ns- Encapsulation is achieved by declaring class variables as private and providing public getter and setter methods to access and modify those variables.
Steps to achieve Encapsulation:
--------------------------------
Declare data members as private.
Create public getter methods to read data.
Create public setter methods to update data.
Example:
class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

5.What are the benefits of using private variable in a class?
Ans-Private variables help protect the data of a class by restricting direct access from outside the class.
Benefits of Private Variables:
------------------------------
Data Security – Prevents unauthorized access to data.
Data Hiding – Internal details of a class remain hidden.
Controlled Access – Data can be accessed only through getter and setter methods.
Prevents Invalid Data – Validation can be applied before modifying data.
Improves Maintainability – Makes the code easier to manage and update.

6.Can you give a real time example of encapsulation in Java?
Ans-A real-time example of encapsulation is a Bank Account. The account balance is kept private and cannot be accessed directly from outside the class. Users can access or modify the balance only through public methods like deposit() and withdraw().
class BankAccount {
    private double balance = 1000;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());
    }
}

7.What is the role of getters and setters in encapsulation?
Ans-Getters and setters are public methods used to access and modify private variables in a class. They help achieve encapsulation by controlling how data is read and updated. Getters return the value of a variable, while setters assign a new value after validation if required. This ensures data security and maintains the integrity of the object.

8.Is encapsulation possible without improve code maintainability?
Ans-Yes, encapsulation is possible without directly improving code maintainability, but one of its major advantages is that it usually helps maintainability. Encapsulation hides internal implementation details and provides controlled access to data. This makes the code easier to modify, debug, and manage. Even if maintainability is not the primary goal, encapsulation can still be implemented to achieve data security and controlled access.

9.What happens if you make all fields public? Is it still encapsulation?
Ans-If all fields are made public, any class can directly access and modify the data. This removes data hiding and reduces security, as there is no control over how the data is changed. In this case, it is not considered proper encapsulation because encapsulation requires restricting direct access to data and providing controlled access through methods like getters and setters.

10.How does encapsulation improve code maintainability?
Ans-Encapsulation improves code maintainability by hiding internal implementation details and providing controlled access to data. Changes made inside a class do not affect other parts of the program as long as the public methods remain the same. This makes the code easier to update, debug, test, and manage, resulting in better software maintenance and reliability.

11.Can you explain how encapsulation helps in securing data?
Ans-Encapsulation helps in securing data by hiding variables using the private access modifier and allowing access only through controlled methods such as getters and setters. This prevents unauthorized or accidental modification of data and allows validation before updating values. As a result, the data remains safe, consistent, and protected from misuse.

12.Why should we avoid exposing too many getters and setters?
Ans-We should avoid exposing too many getters and setters because they can allow unrestricted access to an object's internal data. This reduces data security and weakens encapsulation. Excessive getters and setters may also make the code harder to maintain and increase the risk of unintended modifications. It is better to provide only the methods that are truly necessary for controlling access to the data.

13.How does encapsulation relate to the concept of immutability?
Ans-Encapsulation and immutability are closely related concepts. Encapsulation hides an object's data and controls access to it, while immutability ensures that an object's state cannot be changed after it is created. By making fields private and not providing setters, encapsulation helps create immutable classes. This improves data security, consistency, and thread safety in applications.

14.Can you encapsulate a class that has static fields?
Ans-Yes, a class with static fields can also be encapsulated. Static fields should be declared as private and accessed or modified through public static getter and setter methods. This maintains data hiding and controlled access, which are the key principles of encapsulation.
class Company {
    private static String companyName = "ABC Ltd";

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }
}

15.What is the difference between encapsulation and information hiding?
Ans-
| Encapsulation                                                                         | Information Hiding                                                                        |
| ------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| Encapsulation is the process of wrapping data and methods into a single unit (class). | Information hiding is the process of restricting access to internal details of an object. |
| It focuses on how data and methods are organized.                                     | It focuses on protecting data from unauthorized access.                                   |
| Achieved using classes and access modifiers.                                          | Achieved mainly using access modifiers like `private`, `protected`, and `public`.         |
| It is a mechanism.                                                                    | It is a principle or concept.                                                             |

16.Can you achieve encapsulation without using setter methods?
Ans-Yes, encapsulation can be achieved without using setter methods. A class can keep its fields private and provide only getter methods or other controlled methods to access the data. This is often used in immutable classes where the object's state should not change after creation. By restricting direct modification of data, encapsulation and data security are maintained.

17.How does encapsulation interact with inheritance and polymorphism?
Ans-Encapsulation, inheritance, and polymorphism work together to support object-oriented programming. Encapsulation protects an object's data by restricting direct access through private fields and controlled methods. Inheritance allows a child class to reuse and extend the features of a parent class while respecting access rules. Polymorphism enables objects of different classes to be treated as objects of a common parent class, allowing method overriding and dynamic behavior. Together, these concepts help create secure, reusable, and flexible applications.

18.Can encapsulation be broken using reflection? How would you prevent it?
Ans-Yes, encapsulation can be broken using Java Reflection. Reflection allows access to private fields and methods by overriding normal access controls using setAccessible(true). This can expose or modify private data.

To reduce this risk:

Avoid unnecessary use of reflection.
Use strong security policies and access controls.
Use immutable classes where possible.
In modern Java versions, use the Java Module System to restrict reflective access.

19.How would you design a class that exposes only read-only access to its internal state?
Ans-A class can provide read-only access by making its fields private, initializing them through a constructor, and providing only getter methods without any setter methods. This prevents external code from modifying the object's state after it is created.
class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
In this example, the fields are private and can only be read through getter methods. Since there are no setter methods, the object's state remains unchanged, providing read-only access.

20.What are some anti-patterns that violate encapsulation?
Ans-Some common anti-patterns that violate encapsulation are:

1.Public Fields – Making variables public allows direct access and modification from outside the class.
2.Excessive Getters and Setters – Providing unrestricted access to all fields reduces data protection.
3.Exposing Internal Objects – Returning mutable objects directly allows external code to modify internal state.
4.Using Reflection Improperly – Reflection can bypass access modifiers and access private data.
5.God Object – A class that exposes too much data and functionality, making it difficult to control access.
6.Breaking Access Modifiers – Using public where private or protected would be more appropriate.

21.Demonstarate encapsulation using interface and abstract classes?
Ans-Encapsulation can be demonstrated using interfaces and abstract classes by hiding implementation details and exposing only the required methods to the user. The interface or abstract class defines what operations can be performed, while the actual data remains private in the implementing class.

 
