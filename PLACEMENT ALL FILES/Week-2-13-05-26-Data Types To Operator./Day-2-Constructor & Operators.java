                                                 9.CONSTRUCTOR
                                                ----------------
Interview Questions
-------------------
1.What is Constructor in Java? What is the use of constructor?
Ans-Constructor is a special method used to initialize objects.
A() {
    System.out.println("Constructor");
}

2.What are the different type of constructor?
Ans-Default constructor and Parameterized constructor.
A() { }

A(int x) { }

3.When a constructor is executed?
Ans-Constructor executes when an object is created.
A a = new A();

4.What happens when we did not provide any constructor? How object is created?
Ans-Java provides a default constructor automatically.
class A { }

5.What is the use of this() keyword in a constructor?
Ans-It calls another constructor of the same class.
A() {
    this(10);
}

6.What is the use of super() keyword in a constructor?
Ans-Calls parent constructor.
super();

7.What is constructor overloading? Can we overloaded constructor?
Ans-Multiple constructors with different parameters.
A() { }
A(int x) { }

8.Is it possible to override a constructor? What happens when we override a constructor?
Ans-No, constructors cannot be overridden.

9.What is constructor chaining?
Ans-Calling one constructor from another.
A() {
    this(10);
}

10.Can a constructor be private? if yes, why do we use it?
Ans-Yes, to restrict object creation.
private A() { }

11.Can an abstract class have a constructor?
Ans-Yes.
abstract class A {
    A() { }
}

12.Can an interface have a constructor?
Ans-No
13.Can a constructor be static or abstract? Why or why not?
Ans-No, constructors cannot be static or abstract because they belong to objects.

14.Can a constructor be final?
Ans-No, constructors cannot be final.

15.What is a copy constructor in Java?
Ans-Copies another object values.
A(A obj) { }

16.What is the difference between a method and constructor?
Ans-
| Method              | Constructor          |
| ------------------- | -------------------- |
| Performs operations | Initializes objects  |
| Has return type     | No return type       |
| Called manually     | Called automatically |

17.Can we use final variable in constructor?
Ans-Yes, final variables can be initialized inside constructors.
final int x;
A() {
    x = 10;
}

18.What is the use of exception handling inside constructor?
Ans-Used to handle errors during object creation.
try { }
catch(Exception e) { }

19.Why is super() called automatically if we don't write any constructor?
Ans-Because Java automatically calls the parent class constructor first.
