

                                       5.RETURNING A VALUE FROM A METHOD
 
                                              Java Method Syntax
                                           -------------------------

Interview Questions
-------------------
1.What is the Syntax of a method in Java, and what are its main component?
Ans-Syntax: return Type method Name(){ }
Components: access modifier, return type, method name, parameters, body

2.What is the difference between instance methods and static methods in Java?
Ans-Instance methods need objects; static methods belong to class.

3.What is the difference between a method declaration and a method definition?
Ans-Declaration specifies method details; definition contains method body.

4.Can a Java Method have multiple return statement? Explain with an example?
Ans-Yes, but only one executes at a time.
int check(int n){
    if(n > 0)
        return 1;
    else
        return -1;
}

5.What are access modifiers in Java methods, and how do they affect visibility?
Ans-public, private, protected, default → control method access visibility.

Programs
--------
1.Write a Java method with no parameter that returns an integer value.
Ans-int getNumber() {
    return 100;
}
2.Write a static method that takes two numbers as parameters and returns their sum.
Ans-static int add(int a, int b) {
    return a + b;
}

3.Write a public method that returns a string message.
Ans-public String message() {
    return "Hello Java";
}
4.Write a method that prints a message to the console but does not return any value.
Ans-void display() {
    IO.println("Welcome");
}
5.Write a method that accept parameters, performs a calculation, and returns the result.
Ans-int multiply(int a, int b) {
    return a * b;
}


                                       Non-Parameterized Methods
                                       -------------------------


Interview Questions
--------------------

1.Explain the purpose of non-parameterized methods in Java. When would you prefer using them?
Ans-Used to perform fixed tasks without input values.

2.Can a non-parameterized method return different data types? Demonstrate with examples?
Ans-Yes.
int num() {       String msg(){
    return 10;      return "Hello";
}                 }

3.Can a non-parameterized method  access instance variables and static variables? Explain.
Ans-Yes, it can access both variables.

4.Can a non-parameterized method  call another method that has parameters? Explain with an example.
Ans-Yes.

void show() {
    add(10, 20);
}

void add(int a, int b) {
    IO.println(a + b);
}
5.What happens if you call a non-parameterized instance method before creating an object?
Ans-Compilation error occurs.


Programs
--------
1.Write a non-parameterized method that returns your name?
Ans-String getName() {
    return "Subham";
}
2.Write a non-parameterized method that returns the current year?
Ans-int getYear() {
    return 2026;
}
3.Write a non-parameterized method that calculate and returns the square of 5.
Ans-int square() {
    return 5 * 5;
}
4.Write a non-parameterized method that prints a welcome message.
Ans-void welcome() {
    System.out.println("Welcome");
}
5.Write a non-parameterized method that returns a greeting massage based on a predefined variable.
Ans-String greeting() {
    String name = "Subham";
    return "Hello " + name;
}


                                           Methods with Parameters
                                           -----------------------

Interview Questions
--------------------
1.What are parameters in a Java Methods, and why are they used?
Ans-Parameters are input values used to pass data to methods.

2.What are the difference between formal parameters and actual parameters in Java?
Ans-Formal parameters → variables in method definition
    Actual parameters → values passed during method call

3.Is Java pass-by-value or pass-by-reference? Explain with an example.
Ans-Java is pass-by-value.
void show(int a) {
    a = 20;
}

4.Can you pass an array or object as a parameter to a method in Java? Demonstrate with ana example.
Ans-Yes.
void display(int arr[]) {
    System.out.println(arr[0]);
}

5.Write a method that accepts multiple parameters, Performs a calculation, and returns the result.
Ans-int add(int a, int b, int c) {
    return a + b + c;
}

Programs
--------
1.Write a method that accepts two integers and returns their sum.
Ans-int add(int a, int b) {
    return a + b;
}
2.Write a method that accepts a string parameter and returns its length.
Ans-int length(String str) {
    return str.length();
}
3.Write a method that accepts an array of integers and returns the maximum element?
Ans-int max(int arr[]) {
    int max = arr[0];

    for(int i = 1; i < arr.length; i++) {
        if(arr[i] > max)
            max = arr[i];
    }

    return max;
}
4.Write a method that accepts two numbers and returns the large one.
Ans-int largest(int a, int b) {
    return (a > b) ? a : b;
}
5.Write a method that accepts multiple parameters, performs a calculation, and returns the result.
Ans-int multiply(int a, int b, int c) {
    return a * b * c;
}




                                           Methods Returns Void
                                           ---------------------

Interview Questions
--------------------
1.What does the void return type signify in a java method?
Ans-Method does not return any value.

2.Can a void method include a return statement? Explain with an example.
Ans-Yes, without returning a value.
void show() {
    return;
}
3.When should you use a void method instead of a method that returns a value?
Ans-When only performing an action like printing output.

4.Can a void method call another method that returns a value? Explain how?
Ans-Yes, by calling and using the returned value.

void display() {
    int x = add();
}

int add() {
    return 10;
}
5.What are the advantages and limitations of using void methods in Java?
Ans-Advantage: Simple for actions
    Limitation: Cannot return data**


Programs
--------
1.Write a void method that prints "Hello, World!" to the console.
Ans-void hello() {
      IO.println("Hello, World!");
}
2.Write a void method that accepts a name as a parameters and print a personalized greeting message.
Ans-void greet(String name) {
      IO.println("Hello " + name);
}
3.Write a void method that prints numbers from 1 to 10 using a loop.
Ans-void printNumbers() {
    for(int i = 1; i <= 10; i++) {
        IO.println(i);
    }
}
4.Write a void method that accepts ana array of integers and print all its element.
Ans-void display(int arr[]) {
    for(int i = 0; i < arr.length; i++) {
        IO.println(arr[i]);
    }
}
5.Write a void method that performs a calculation but does not return the result.
Ans-void add(int a, int b) {
    int sum = a + b;
        IO.println(sum);
}


                                           Methods Returns Value
                                           ---------------------

Interview Questions
--------------------

1.What does it mean when a method returns a value in Java? Explain with an example?
Ans-Method sends a value back to the caller.
int add() {
    return 10;
}
2.How is the return type of a method declared, and why must it match the returned value?
Ans-Declared before method name; return value must match to avoid errors.

3.Can a method return different types of values based on conditions? Explain with example?
Ans-No, method must return same declared type.
int check(int a) {
    if(a > 0)
        return 1;
    else
        return 0;
}

4.What happens if the return statement in a method is missing or mismatched with the declare return type?
Ans-Compilation error occurs.

5.What are covariant return types in java, and how are they used in method overriding?
Ans-Subclass method can return subclass type instead of parent type.


Programs
--------
1.Write a method that returns the factorial of given number.
Ans-int factorial(int n) {
    int fact = 1;

    for(int i = 1; i <= n; i++) {
        fact *= i;
    }

    return fact;
}
2.Write a method that checks if a number is prime and returns a Boolean value.
Ans-boolean isPrime(int n) {
    for(int i = 2; i < n; i++) {
        if(n % i == 0)
            return false;
    }

    return true;
}
3.Write a method that takes a string and returns it in reverse order.
Ans-String reverse(String str) {
    String rev = "";

    for(int i = str.length() - 1; i >= 0; i--) {
        rev += str.charAt(i);
    }

    return rev;
}
4.What is the difference between returning a primitive type and returning an object in Java?
Ans-Primitive returns value directly; object returns reference.

5.What are covariant return types in Java, and how are they applied in factory method implementations?
Ans-Overridden method can return subclass type in factory methods.

6.How do return type enable polymorphism in Java, particularly in the context of factory methods?
Ans-Parent reference can hold subclass objects returned by methods.



                                           Factory Method-Return Type in Java
                                           ----------------------------------

Interview Questions
--------------------

1) What is a Factory Method in Java, and how does it use return types to create objects?
Ans-Factory Method creates and returns objects using methods.

2) What types of values can a method return in Java, and how are they used in factory methods?
Ans-Methods can return primitive values, objects, arrays, or null.

3) What happens if a non-void method does not return a value? Explain with an example.
Ans-Compilation error occurs.
int add() {
}

4) What is the difference between returning a primitive type and returning an object in Java?
Ans-Primitive returns actual value; object returns reference.

5) What are covariant return types in Java, and how are they applied in factory method implementations?
Ans-Subclass methods can return subclass objects in overridden methods.
 
6) How do return types enable polymorphism in Java, particularly in the context of factory methods?
Ans-Parent reference can store different subclass objects returned by factory methods.



Programs
--------
1) Write a factory method that returns an object based on the input type (e.g., Car, Bike).
Ans-class Vehicle { }

class Car extends Vehicle { }

class Bike extends Vehicle { }

class Factory {
    Vehicle getVehicle(String type) {
        if(type.equals("Car"))
            return new Car();
        else
            return new Bike();
    }
}

2) Write a factory method that creates and returns different shapes (Circle, Rectangle) based on user input.
Ans-class Shape { }

class Circle extends Shape { }

class Rectangle extends Shape { }

class ShapeFactory {
    Shape getShape(String type) {
        if(type.equals("Circle"))
            return new Circle();
        else
            return new Rectangle();
    }
}

3) Write a factory method that returns an instance of a subclass depending on a condition.
Ans-class Animal { }

class Dog extends Animal { }

class Cat extends Animal { }

class AnimalFactory {
    Animal getAnimal(boolean pet) {
        if(pet)
            return new Dog();
        else
            return new Cat();
    }
}

4) Write a program demonstrating covariant return types using a base class and a subclass.
Ans-class A {
    A show() {
        return new A();
    }
}

class B extends A {
    B show() {
        return new B();
    }
}

5) Write a factory method that returns null when no matching object type is found.
Ans-class Factory {
    Object getObject(String type) {
        if(type.equals("Car"))
            return new String("Car");

        return null;
    }
}

