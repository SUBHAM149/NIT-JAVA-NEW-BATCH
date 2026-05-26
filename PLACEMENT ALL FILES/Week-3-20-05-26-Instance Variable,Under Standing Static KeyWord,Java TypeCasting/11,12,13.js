Mock-3&4
======

				                                         	11. INSTANCE MEMBERS
				                                              --------------------------

1.In Java, the members that belong to an object are called Instance Members.

					                                        1)non-static variable
					                                      -------------------------

Interview Questions
--------------------
1) What is a non-static variable in Java?
Ans- A variable declared inside a class but outside methods, without static, is called a non-static variable or instance variable.

2) Where are non-static variables stored in memory?
Ans- Non-static variables are stored inside the Heap memory area.
Because they belong to an instance of a class, they live inside the specific object memory space allocated on the heap.

3) When are non-static variables created and destroyed?
Ans- They are created when an object is created using new keyword.
They are destroyed when the object becomes unused and is removed by Garbage Collector.


4) Can non-static variables be accessed without creating an object? Why or why not?
Ans- No. Because non-static variables belong to an object, not to the class.


5) Can we use 'this' keyword with static variables? Why or why not?
Ans- Technically possible inside a non-static method, but not recommended. this refers to current object, while static variables belong to the class. Use ClassName.variableName.

6) What is the default value of a non-static variable if not initialized?
Ans- Unlike local variables, instance variables are automatically given default values by the JVM if you don't initialize them:

int, byte, short: 0

long: 0L

float: 0.0f
	
double: 0.0d

boolean: false

char: '\u0000' (null character)

Object References (e.g., String, Integer, custom objects): null


7) If we modify a non-static variable using one object, will that affect another object?
Ans- No. Each object has its own separate copy of non-static variables.


8) What is java.lang.NullPointerException, and how can we handle it?
Ans- It occurs when we try to access a method/variable using a reference variable that contains null. Handle it by checking if(obj != null), using proper object creation, or try-catch.


9) Can we print an object directly? Explain toString() method.
Ans- Yes, you can. When you pass an object directly to System.out.println(obj);, Java automatically invokes the object's toString() method.

The toString() method: By default, the Object class implementation prints ClassName@HashCode. To see meaningful details, you must override the toString() method in your class to return a custom string representing the object's data.


10) Difference between memory locations of static and non-static variables.
Ans-

| Feature           | Static Variables                             | Non-Static / Instance Variables              |
| ----------------- | -------------------------------------------- | -------------------------------------------- |
| Memory Location   | Stored in Method Area / Metaspace            | Stored in Heap Area, inside the object       |
| Memory Allocation | Allocated only once when the class is loaded | Allocated every time a new object is created |
| Sharing           | Shared by all objects of the class           | Separate copy for each object                |
| Access            | Accessed using class name                    | Accessed using object reference              |
| Example           | `static int count;`                          | `int id;`                                    |

Programs :
1) Can a static method directly access a non-static variable? Explain with an example.
2) Create a class with one static and one non-static variable. Print their values after creating multiple objects
to show the difference in behavior.
3) Demonstrate the use of the this keyword to initialize non-static variables through a constructor.
4) What happens if you try to use the this keyword inside a static method? Explain with code.
5) Create a program where both static and non-static variables are incremented in a method, and analyze the
final values.

                                                                                2) non-static Method
                                                                               -----------------------

Interview Questions
1) What is a non-static method in Java, and how is it different from a static method?
Ans- A non-static method belongs to an object of a class. A static method belongs to the class itself.


2) When and how can a non-static method be invoked?
Ans- A non-static method can only be invoked after an object of the class has been instantiated.
It is invoked using the object reference followed by the dot (.) operator.


3) Can a non-static method access static variables and methods? Why or why not?
Ans- Yes. A non-static method can access static variables and static methods because static members are loaded at class level and available to all objects.


4) Can a static method call a non-static method directly? Explain with reason.
Ans- No. A static method cannot call a non-static method directly because non-static methods require an object.


5) How does memory allocation differ for static and non-static methods in the JVM?
Ans- Static and non-static method code is loaded in the method area. Static methods can be called using class name, but non-static methods need an object reference to execute.


6) Can we use the this keyword inside a non-static method? Why?
Ans- Yes. this refers to the current object, and non-static methods are called using objects.


7) When are non-static methods loaded into memory?
Ans- Yes. this refers to the current object, and non-static methods are called using objects.


8) Can a non-static method be overridden in a subclass? Explain with an example.
Ans- Yes. Non-static methods support runtime polymorphism and can be overridden by a subclass.


9) What happens if we try to call a non-static method using a null object reference?
Ans- It will throw NullPointerException.
Reason: A non-static method requires a valid object memory address on the heap to access its internal instance variables and logic. If the reference variable points to null, there is no object to bind to, causing the JVM to fail immediately.

10) Can a non-static method be declared as final, abstract, or synchronized? What are the implications?
Ans- Yes.
final method: cannot be overridden.
abstract method: has no body and must be overridden by subclass.
synchronized method: allows only one thread at a time to execute it on the same object.



Programs :
1) Write a program to show that a static method cannot call a non-static method directly (and how to fix it).
2) Create a class with both static and non-static methods. Access both using an object reference and observe
the behavior.
3) Write a program to demonstrate the use of the this keyword inside a non-static method.
4) Create a parent and child class where the child overrides a non-static method from the parent. Show
method overriding in action.
5) Write a program that tries to call a non-static method using a null reference and observe what happens.

				3) non-static Block
				--------------------

Interview Questions
1) What is a non-static (instance) block in Java, and when is it executed?
Ans- A non-static block is a block without static keyword. It is executed every time an object is created.


2) How is a non-static block different from a static block?
Ans-
| Static Block                  | Non-static Block                |
| ----------------------------- | ------------------------------- |
| Executes when class is loaded | Executes when object is created |
| Runs only once                | Runs for every object           |
| Uses `static` keyword         | No `static` keyword             |


3) When is a non-static block executed in relation to the constructor?
Ans- Non-static block executes before the constructor body.

Order:

Object creation → Non-static block → Constructor


4) Can we have multiple non-static blocks in the same class? If yes, in what order do they execute?
Ans- Yes. Multiple non-static blocks execute in the same order in which they are written.
class Demo {
    { System.out.println("Block 1"); }
    { System.out.println("Block 2"); }
}


5) Can a non-static block access static and non-static variables? Explain.
Ans- Yes. A non-static block can access both static and non-static variables because it runs during object creation.


6) Can a non-static block call methods (both static and non-static)?
Ans- Yes. It can call both static and non-static methods.

class Demo {
    static void m1() {
        System.out.println("Static method");
    }

    void m2() {
        System.out.println("Non-static method");
    }

    {
        m1();
        m2();
    }
}

7) What happens if both a parent and child class have non-static blocks? In which order are they executed
during object creation?
Ans- Parent class non-static block executes first, then parent constructor, then child non-static block, then child constructor.


8) Can we use the this keyword inside a non-static block? Why or why not?
Ans- Yes. We can use this because non-static block belongs to the current object.


9) Can a non-static block throw exceptions or use try-catch?
Ans- Yes. It can use try-catch. If it throws a checked exception, the constructor must handle or declare it.
class Demo {
    {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}

10) What is the real purpose of using non-static blocks in Java programs (practical use cases)?
Ans- Non-static blocks are used to write common initialization logic for every object before constructor execution.

Practical uses:
Initialize instance variables
Execute common code for all constructors
Validate object creation logic
Write setup code before constructor body


Programs:
1) Write a simple program with one non-static block and a constructor to show the order of execution.
2) Write a program that shows the difference between static and non-static blocks during class loading and
object creation.
3) Create a non-static block that initializes instance variables before the constructor executes.
4) Demonstrate how non-static blocks are executed in an inheritance hierarchy (both parent and child having
blocks).
5) Write a program combining static blocks, non-static blocks, constructors, and methods to show their
complete execution flow.

                                                                            12(A). UNDERSTANDING STATIC KEYWORD
                                                                           --------------------------------------
                                                                                      1. Static Variable
                                                                                     --------------------

Interview Questions
-------------------

1. What is a static variable?
Ans-


2. How does a static variable differ from an instance variable?
Ans-


3. When and why do we use static variables?
Ans- We use static variables (also known as class variables) in Java when we want a variable to belong to the class itself rather than to any specific object instance.
Or
To Share Common Data: When all objects of a class
To Define Constants: When a value remains fixed throughout the application execution
To Track Global States: When you need a counter or a flag that tracks behavior across all instances of a class.

Why: 	A. Memory Efficiency
	B. Global Access Without Object Creation

4. How many copies of a static variable exist in memory?
Ans- Only one copy of a static variable exists in memory per class.


5. Can a static variable be local to a method?
Ans- No. Static variables cannot be declared inside a method.


6. Can we access static variables without creating an object?
Ans- Yes. Static variables can be accessed using the class name.


7. What are some real-world examples of using static variables?
Ans-
College name for all students
Company name for all employees
Counter to count number of objects
Bank interest rate common for all accounts


8. What happens if two classes have static variables with the same name?
Ans-  No problem. Each static variable belongs to its own class.


9. Can we change the value of a static variable in another class?
Ans- Yes, if it is accessible using access modifiers.
class A {
    static int x = 10;
}

class B {
    void change() {
        A.x = 50;
    }
}

10. Is it possible to make a static variable final?
Ans- Yes. A static final variable becomes a constant.
class Demo {
    static final double PI = 3.14159;
}


Programs

1. Count the number of objects created using a static variable
2. Demonstrate that static variables are shared between all objects.
3. Use a static variable for generating a unique ID for every object.

			                                                              2. Static Method
			                                                            ---------------------
Interview Questions
-------------------

1. What is a static method in Java?
Ans- A static method is a method declared using the static keyword. It belongs to the class, not to an object.

2. Can a static method access instance variables? Why or why not?
Ans- No. A static method cannot access instance variables directly because instance variables belong to an object.
It can access them by creating an object.
class Demo {
    int x = 10;

    static void show() {
        // System.out.println(x); // error
    }
}

3. Can we call a static method using an object?
Ans- Yes, but it is not recommended. Static methods should be called using the class name.


4. What happens if we declare a static method with the same signature in a subclass?
Ans- It is called method hiding, not overriding.
class Parent {
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child");
    }
}


5. Why can't we use this keyword inside a static method?
Ans- Because this refers to the current object, but static methods belong to the class and can run without creating an object.


6. Can we overload static methods?
Ans- Yes. Static methods can be overloaded.
class Demo {
    static void add(int a) { }

    static void add(int a, int b) { }
}


7. Can we override static methods? Explain with example.
Ans- No. Static methods cannot be overridden. They are hidden.

class Parent {
    static void show() {
        System.out.println("Parent static");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static");
    }
}



8. What is the difference between a static method and an instance method?
Ans-
| Static Method                           | Instance Method                        |
| --------------------------------------- | -------------------------------------- |
| Belongs to class                        | Belongs to object                      |
| Called using class name                 | Called using object                    |
| Cannot directly access instance members | Can access static and instance members |
| `this` cannot be used                   | `this` can be used                     |


9. When should you make a method static?
Ans- Make a method static when it does not depend on object data.

Examples:

Utility methods
Helper methods
Common calculations
main() method


10. Can a static method call another static method?
Ans- Yes. A static method can directly call another static method.
class Demo {
    static void m1() {
        System.out.println("m1");
    }

    static void m2() {
        m1();
    }
}


Programs

1. Create a static method to find factorial of a number.
2. Demonstrate static method calling another static method
3. Check whether a number is even or odd using static method
4. Program to access static variable inside a static method

			                                                 3. Static Method VS Instance Method
			                                                 -----------------------------------
Interview Questions

1. What is the main difference between static and instance methods?
Ans- A static method belongs to the class, while an instance method belongs to the object.

ClassName.staticMethod();   // static method

ObjectName.instanceMethod(); // instance method

2. Can a static method call an instance method directly?
Ans- No. A static method cannot call an instance method directly because instance methods need an object.


3. Can an instance method call a static method?
Ans- Yes. An instance method can call a static method directly because static methods belong to the class and are available to all objects.


4. How does memory allocation differ for static and instance methods?
Ans-Static and instance method code is loaded in the method area when the class is loaded.
But static methods are called using the class name, and instance methods are called using an object reference.


5. Give a real-world example where you'd use a static vs an instance method.
Ans-
Static:
class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
}

Instance:
class Student {
    String name;

    void displayName() {
        System.out.println(name);
    }
}


Programs

1. Show difference between static and instance methods
2. Demonstrate calling instance method from static method using object
3. Show that static methods cannot directly access instance variable.

4. Static Block

Interview Questions

1. What is a static block in Java?
Ans- A static block is a block declared using the static keyword. It is used to initialize static data.
class Demo {
    static {
        System.out.println("Static block");
    }
}

2. When is a static block executed?
Ans- A static block is executed when the class is loaded into memory by the JVM.


3. How many times does a static block execute?
Ans- A static block executes only once per class loading.


4. What is the purpose of a static block?
Ans- The purpose of a static block is to initialize static variables or execute code that should run only once.
class Demo {
    static int x;

    static {
        x = 100;
    }
}


5. Can we have multiple static blocks in one class?
Ans- Yes. We can have multiple static blocks. They execute in the order they are written.
class Demo {
    static {
        System.out.println("Static block 1");
    }

    static {
        System.out.println("Static block 2");
    }
}


6. What is the order of execution of static block, constructor, and main method?
Ans- Static block → main method → constructor


7. Can a static block throw an exception?
Ans- Yes, but checked exceptions must be handled using try-catch.


8. Can we use return statement inside a static block?
Ans-  No. We cannot use return statement inside a static block.


9. Can we initialize static variables inside a static block?
Ans- Yes. Static blocks are mainly used to initialize static variables.


10. Is it possible to load a class without running its main method?
Ans- Yes. A class can be loaded using Class.forName() without directly running its main() method.


Programs
1. Demonstrate order of static block and main method.
2. Initialize static variables inside static block.
3. Demonstrate multiple static blocks.
4. Program showing static block executes even before object creation.

			                                                       5. Common Combined Concept
			                                                      -----------------------------
Interview Questions:
---------------------

1. What is static in Java?
Ans- static is a keyword used to create class-level members. Static members belong to the class, not to objects.

2. Why do we use the static keyword in Java?
Ans- We use static when a variable, method, or block should belong to the class and be shared by all objects.


3. Where can we use the static keyword?
Ans- We can use static with:
Variables
Methods
Blocks
Nested classes


4. What is a static variable in Java?
Ans- A static variable is a class-level variable. Only one copy is created and shared by all objects.



5. What is a static method in Java?
Ans- A static method is a class-level method. It can be called without creating an object.


6. What is a static block?
Ans- A static block is used to initialize static variables. It executes once when the class is loaded.



7. Can we override a static method?
Ans- No. Static methods cannot be overridden. They are hidden in subclass.



8. Can we overload a static method?
Ans- Yes. Static methods can be overloaded.
static void add(int a) {}
static void add(int a, int b) {}


9. Why is the Java main method static?
Ans- Because JVM can call main() without creating an object of the class.


10. Can we declare multiple static blocks in our code?
Ans- Yes. Multiple static blocks are allowed. They execute in the order they are written.


11. Can we call a superclass static method in a subclass?
Ans- Yes.
class Parent {
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void display() {
        Parent.show();
    }
}


12. Can a constructor be static in Java?
Ans- No. A constructor cannot be static because constructors are used to initialize objects.



13. Can we access non-static data members in a static method in Java?
Ans- Not directly. We need to create an object.


14. Can we access static data members in a static method?
Ans- Yes. Static methods can directly access static data members.


15. Can we use this and super in a static context?
Ans- No. this and super refer to objects, but static context belongs to class.


16. Can we write static public void main(String args[])?
Ans- Yes. The order of public and static can be changed.


17. Can an abstract class have a static variable in it?
Ans- Yes. Abstract classes can have static variables.
abstract class Demo {
    static int x = 10;
}


18. Can we execute a Java program without the main() method?
Ans-In modern Java, no. To start normal execution, main() method is required.


19. Can we apply the static keyword to an outer class?
Ans- No. An outer/top-level class cannot be static.


20. Can we create a static inner class?
Ans- Yes. We can create a static nested class.
class Outer {
    static class Inner {
        void show() {
            System.out.println("Static nested class");
        }
    }
}


21. What is the advantage of using a static variable?
Ans- It saves memory because only one copy is created and shared by all objects.


22. Can we declare a local variable as static?
Ans- No. Local variables inside methods cannot be static.

23. Why is the combination of abstract and static not allowed for methods?
Ans- abstract methods must be overridden, but static methods cannot be overridden. So both together are not allowed.


24. Explain Illegal forward reference error in a static block with an example.
Ans- Illegal forward reference occurs when we directly use a static variable before its declaration.
class Demo {
    static {
        // System.out.println(x); // error: illegal forward reference
    }

    static int x = 10;
}


25. What is the order of execution of static members in a single class?
Ans- Static members execute from top to bottom in the order they are written.
static int a = 10;
static { }


26. What is the order of execution of static members in super and subclass?
Ans- Parent class static members execute first, then child class static members.
Parent static members → Child static members


27. Demonstrate how to declare a static variable.
Ans-
class Demo {
    static int count = 0;
}

28. How to define a static block and observe when the static block will execute?
Ans- class Demo {
    static {
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
Output:

Static block executed
Main method executed

29. How to define a static method and how to invoke it in the same class and different class?
Ans- class A {
    static void show() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        show();    // same class
        A.show();  // using class name
    }
}

class B {
    void display() {
        A.show();  // different class
    }
}


30. How to differentiate static and non-static members?
Ans- | Static Members          | Non-static Members            |
| ----------------------- | ----------------------------- |
| Belong to class         | Belong to object              |
| Access using class name | Access using object           |
| One copy only           | Separate copy for each object |
| Cannot use `this`       | Can use `this`                |



31. Draw a memory diagram for static members showing where they get memory in the JVM.
Ans-
JVM Memory
------------------------------------------------
Method Area / Class Area
------------------------------------------------
Class: Demo
static int x = 10
static method show()
static block

Heap Area
------------------------------------------------
Objects are created here
Demo d1
Demo d2

Stack Area
------------------------------------------------
Local variables and method calls
main()

Programs

1. Program to show the execution sequence of static block, main method, and constructor
2. Create a utility class using only static methods and variables.
3. Static method returning object of its class.
4. Count total login attempts using static variable and method.
5. Program to show static variable shared across objects but instance variable not.
6. Program to demonstrate static block execution order in inheritance.



				                                                     
