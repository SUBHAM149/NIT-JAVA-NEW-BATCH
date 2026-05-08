                                                              2.First Java Program

1.What is the extension of a Java source file?
Ans- .java

2.What is the extension of the compiled bytecode file?
Ans- .class

3.Which command is used to compile Java Code?
Ans- java c FileName.java

4.Which command is used to run a Java Program?
Ans- java c FileName.java

5.Why do we not use .class when running the program?
Ans-JVM automatically detects the .class file.

6.What is the entry point of Java Program?
Ans-main() method

7.What Happens if the file name and class name differ?
Ans-Compilation error occurs (for public class).

8.What is bytecode?
Ans-Intermediate code executed by JVM.

9.Can we have multiple classes in one Java file?
Ans-Yes

10.What happens when we omit public keyword in class?
Ans-Class becomes default/package-private.

Java Program's
---------------

1) Write a program to print "Hello, Java Developer!"
public class Hello {
    public static void main(String[] args) {
        IO.println("Hello, Java Developer!");
    }
}
2) Write a program to add two numbers
public class AddNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int sum = a + b;

        IO.println("Sum = " + sum);
    }
}
3) Write a program to find the largest of two numbers
public class Largest {
    public static void main(String[] args) {
        int a = 50, b = 30;

        if(a > b)
            IO.println(a + " is largest");
        else
            IO.println(b + " is largest");
    }
}
4) Write a program to check even or odd number
public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;

        if(num % 2 == 0)
            IO.println("Even");
        else
            IO.println("Odd");
    }
}
5) Write a program to print sum of first 10 natural numbers
public class SumNatural {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            sum += i;
        }

        IO.println("Sum = " + sum);
    }
}
6) Write a program to swap two numbers
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20, temp;

        temp = a;
        a = b;
        b = temp;

        IO.println("a = " + a);
        IO.println("b = " + b);
    }
}
7) Write a program to swap two numbers without using third variable
public class SwapWithoutThird {
    public static void main(String[] args) {
        int a = 10, b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        IO.println("a = " + a);
        IO.println("b = " + b);
    }
}
8) Write a program to print ASCII value of a character
public class ASCIIValue {
    public static void main(String[] args) {
        char ch = 'A';

        int ascii = ch;

        IO.println("ASCII Value = " + ascii);
    }
}
9) Write a program to check if number is positive or negative
public class PositiveNegative {
    public static void main(String[] args) {
        int num = -5;

        if(num > 0)
            IO.println("Positive");
        else if(num < 0)
            IO.println("Negative");
        else
           IO.println("Zero");
    }
}
10) Write a program to print multiplication table
public class Table {
    public static void main(String[] args) {
        int num = 5;

        for(int i = 1; i <= 10; i++) {
            IO.println(num + " x " + i + " = " + (num * i));
        }
    }
}

                                                                          3. OBJECT CLASS


1) What is Object Class in Java?
Ans- Object class is the root superclass of all classes in Java.Every class in Java directly or indirectly inherits from the Object class.
It is present in:java.lang package

2) What is the superclass of all Java classes?
Ans- Object class is the superclass of all Java classes. Every class in Java directly or indirectly inherits from the Object class.

3) Is it necessary to extend Object class explicitly?
Ans- No, it is not necessary to extend the Object class explicitly.
Java automatically extends the Object class for every class.

4) How many methods does the Object class have?
Ans- Object class contains 11 methods.
toString()
equals()
hashCode()
getClass()
clone()
finalize()
wait()
notify()
notifyAll()

5) Can we override methods of the Object class?
Ans- Yes, many methods of the Object class can be overridden to provide custom behavior. Commonly Overridden Methods are:-
toString()
equals()
hashCode()

6) Which methods are declared as final in the Object class?
Ans- The following method is declared as final in Object class:
 getClass()
 notify()
 notifyAll()
 wait()

7) What is the difference between == and equals()?
Ans- | `==`                          | `equals()`                  |
| ----------------------------- | --------------------------- |
| Compares memory addresses     | Compares object contents    |
| Operator                      | Method                      |
| Used for reference comparison | Used for logical comparison |

8) Why should we override hashCode() when we override equals()?
Ans- If two objects are equal using equals(), they must return the same hash code.

9) What is the default implementation of toString()?
Ans- The default implementation of toString() in Object returns:
ClassName@HexadecimalHashCode

10) What is the purpose of clone() method?
Ans- The clone() method is used to create a duplicate copy of an object.

11) What is shallow copy?
Ans- A shallow copy creates a new object, but copies only the references of nested objects, not the actual objects.
Meaning:
Primitive values are copied
Reference variables point to the same memory location

12) What is deep copy?
Ans- A deep copy creates a completely independent copy of an object along with all referenced objects.
Meaning:
Primitive values are copied
Referenced objects are also separately copied

13) What is the purpose of finalize() method?
Ans- The finalize() method is called by the Garbage Collector before destroying an object.
Purpose: To perform cleanup activities before object destruction, Release system resources like: Files, Database connections, Network connections

14) What is the use of getClass()?
Ans- The getClass() method returns the runtime class of an object.
This is a final method used to get metadata about the object’s class (like its name, methods, or fields) via Reflection.

15) Why are wait(), notify(), and notifyAll() methods defined in Object class and not in Thread class?
Ans- These methods are used for inter-thread communication and depend on object-level locking (monitor).

16) What happens if we don't override toString()?
Ans- If toString() is not overridden, Java uses the default implementation from the Object class.
ClassName@HexadecimalHashCode

17) Can we override finalize()?
Ans- No. If a class does not implement the Cloneable interface and clone() is called, Java throws: CloneNotSupportedException
Ans- Yes, finalize() can be overridden.
18) Can we call clone() without implementing Cloneable?
19) What is the difference between shallow copy and deep copy?
Ans -
| Shallow Copy                | Deep Copy                               |
| --------------------------- | --------------------------------------- |
| Copies only references      | Copies complete objects                 |
| Nested objects are shared   | Nested objects are independently copied |
| Changes affect both objects | Changes do not affect other object      |
| Faster                      | Slower                                  |
| Less memory usage           | More memory usage                       |

20) Why is finalize() deprecated in Java 9 and later?
Ans- finalize() was deprecated because of several problems:
Unpredictable execution
Poor performance
Security issues
Garbage Collector delay
Resource leakage possibility

To handle this situation we can use this Modern Alternatives:
try-with-resources
AutoCloseable
Cleaner API

Coding Questionl
1) Write a Java program to display object details using toString() method.

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Rahul");
        System.out.println(s);
    }
}
O/P: 101 Rahul

2) Write a Java program to compare two objects using the equals() method.

class Test {
    int id;

    Test(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Test t = (Test) obj;
        return this.id == t.id;
    }

    public static void main(String[] args) {
        Test t1 = new Test(10);
        Test t2 = new Test(10);

        System.out.println(t1.equals(t2));
    }
}
O/P:- true

3) Write a program to demonstrate the difference between == operator and equals() method.

class Demo {
    String name;

    Demo(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        Demo d = (Demo) obj;
        return this.name.equals(d.name);
    }

    public static void main(String[] args) {
        Demo d1 = new Demo("Java");
        Demo d2 = new Demo("Java");

        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));
    }
}
O/P:- 	false
	true

4) Write a Java program to find whether two employee objects are equal by overriding equals() and hashCode().

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return id == e.id && name.equals(e.name);
    }

    public int hashCode() {
        return id + name.hashCode();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ravi");
        Employee e2 = new Employee(1, "Ravi");

        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
O/P:- 	true
	2593500
	2593500

5) Write a Java program to print the runtime class name using the getClass() method.

class Test {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(s.getClass().getName());
    }
}
O/P:- java.lang.String

6) Write a program to clone an object using the clone() method.

class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {
        Student s1 = new Student(101, "Amit");

        Student s2 = (Student) s1.clone();

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}

7) Write a Java program to demonstrate deep cloning using the clone() method.

class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Employee implements Cloneable {
    int id;
    Address address;

    Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        Employee e = (Employee) super.clone();
        e.address = (Address) address.clone();
        return e;
    }

    public static void main(String[] args) throws Exception {
        Address a1 = new Address("Hyderabad");

        Employee e1 = new Employee(1, a1);
        Employee e2 = (Employee) e1.clone();

        e2.address.city = "Delhi";

        System.out.println(e1.address.city);
        System.out.println(e2.address.city);
    }
}
O/P:-	Hyderabad
	Delhi

8) Write a Java program to override the hashCode() method.

class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    public int hashCode() {
        return id * 100;
    }

    public static void main(String[] args) {
        Student s = new Student(10);

        System.out.println(s.hashCode());
    }
}
O/P:- 1000

9) Write a program to check the hash codes of two equal objects.

class Test {
    int id;

    Test(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Test t = (Test) obj;
        return id == t.id;
    }

    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        Test t1 = new Test(5);
        Test t2 = new Test(5);

        System.out.println(t1.equals(t2));
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}
O/P:- 	true
	5
	5

10) Write a Java program to call the finalize() method and see when it executes.

class Demo {

    protected void finalize() {
        System.out.println("Finalize method executed");
    }

    public static void main(String[] args) {
        Demo d = new Demo();

        d = null;

        System.gc();
    }
}
O/P:- Finalize method executed

11) Write a Java program to demonstrate shallow copy?

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Employee implements Cloneable {
    int id;
    Address address;

    Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {
        Address a1 = new Address("Mumbai");

        Employee e1 = new Employee(1, a1);
        Employee e2 = (Employee) e1.clone();

        e2.address.city = "Pune";

        System.out.println(e1.address.city);
        System.out.println(e2.address.city);
    }
}
O/P:- 	Pune
	Pune

12) Write a Java program to demonstrate deep copy?

class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Employee implements Cloneable {
    int id;
    Address address;

    Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        Employee e = (Employee) super.clone();
        e.address = (Address) address.clone();
        return e;
    }

    public static void main(String[] args) throws Exception {
        Address a1 = new Address("Chennai");

        Employee e1 = new Employee(1, a1);
        Employee e2 = (Employee) e1.clone();

        e2.address.city = "Bangalore";

        System.out.println(e1.address.city);
        System.out.println(e2.address.city);
    }
}
O/P:- 	Chennai
	Bangalore
