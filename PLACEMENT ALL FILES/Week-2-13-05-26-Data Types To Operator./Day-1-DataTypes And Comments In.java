                                              7.DATATYPES
                                              --------------
Interview Questions
-------------------

1.What is a Datatype in Java, and why do we need it for every variable?
Ans-A datatype defines what type of value a variable can store. It helps Java allocate memory properly.

2.What are the main types of data types in Java? Give examples.
Ans-Two types:
Primitive Datatypes → int, char, double
Reference Datatypes → String, Array, Object

3.What is primitive datatypes? Why do we use primitive datatypes?
Ans-Primitive datatypes store simple values directly. They are used for better performance and less memory usage.

4.List all primitive datatypes in Java. What kind of values do they store?
Ans-
byte → small integer values
short → integer values
int → whole numbers
long → large whole numbers
float → decimal numbers
double → large decimal numbers
char → single character
Boolean → true or false

5.What is size, default value, and range of each primitive datatype?
Ans-
| Datatype | Size          | Default Value | Range                    |
| -------- | ------------- | ------------- | ------------------------ |
| byte     | 1 byte        | 0             | -128 to 127              |
| short    | 2 bytes       | 0             | -32,768 to 32,767        |
| int      | 4 bytes       | 0             | Large integer range      |
| long     | 8 bytes       | 0L            | Very large integer range |
| float    | 4 bytes       | 0.0f          | Decimal values           |
| double   | 8 bytes       | 0.0d          | Large decimal values     |
| char     | 2 bytes       | '\u0000'      | Single character         |
| Boolean  | JVM dependent | false         | true/false               |

6.What is reference data types? Give examples.
Ans-Reference datatypes store addresses of objects.
Examples: String, Array, Class, Object

7.Can primitive datatypes hold null? Can reference datatype hold null?
Ans-Primitive datatypes cannot hold null.
Reference datatypes can hold null.

8.What is the difference between primitive and reference datatypes?
Ans-
| Primitive Datatype  | Reference Datatype      |
| ------------------- | ----------------------- |
| Stores actual value | Stores object reference |
| Fixed size          | Size may vary           |
| Cannot store null   | Can store null          |

9.Can a variable be declare without assigning a value? What happens if you try to use it?
Ans-Yes, but local variables must be initialized before use, otherwise compilation error occurs.

10.Can primitive datatype be declared inside constructors, static blocks, instance blocks, or non-static method? Explain.
Ans-Yes, primitive variables can be declared anywhere inside a class or method.

11.if you declare all primitive datatypes inside a method and try to print them without initialization, what happens?
Ans-Compilation error occurs because local variables must be initialized before use.

12. What happens if you declare a primitive variable with a value larger than its range? Give an example.
Ans- if a primitive variable is assigned a value outside its range, a compile-time error may occur.
Example
byte b = 130;
Error: possible lossy conversion from int to byte
Because:
byte range: -128 to 127

13. If you declare a variable with a primitive types, what does JVM do internally? How much memory is
allocated?
Ans- 
When a primitive variable is declared:
JVM allocates memory
Stores actual value directly

Memory Allocation
Primitive Type	Memory
byte	1 byte
short	2 bytes
int	4 bytes
long	8 bytes
float	4 bytes
double	8 bytes
char	2 bytes

Example
int x = 10;
JVM allocates 4 bytes.

14. Where are primitive variables stored in memory?
Ans- Depends on variable type.

| Variable Type               | Stored In    |
| --------------------------- | ------------ |
| Local primitive variable    | Stack memory |
| Instance primitive variable | Heap memory  |
| Static primitive variable   | Method Area  |


15. Where are reference variables stored in memory?
Ans- 
Reference variables themselves are usually stored:
Stack (local references)
Heap contains actual object
Example
Student s = new Student();
| Part             | Memory |
| ---------------- | ------ |
| `s` reference    | Stack  |
| `Student` object | Heap   |


16. What happens if you assign one reference variable to another?
Ans- 
Both references point to the same object.

Example
Student s1 = new Student();
Student s2 = s1;

Now: s1 and s2 → same object
Changes through one reference affect the same object.

17. Explain overflow and underflow with examples using byte, short, int, or long.
Ans- 
Overflow:
When value exceeds maximum limit.

Example: 
byte b = 127;
b++;
IO.println(b);
Output: -128

Underflow:
When value goes below minimum limit.

Example
byte b = -128;
b--;
System.out.println(b);
Output: 127

18. What happens if you call a method on a null reference variable?
Ans- JVM throws: NullPointerException

Example
Student s = null;
s.show();

Output: NullPointerException
Because null does not reference any object.

19. Show an example where a local variable has the same name as a class-level variable (variable
shadowing).
Ans- 
Example:
class Test {

    int x = 100;
    void show() {
        int x = 50;
        System.out.println(x);
        System.out.println(this.x);
    }
}
Output:
50
100

20. Can primitive and reference datatypes be mixed in expressions, like int + Integer? What happens?
Ans- Yes.
Java performs: autoboxing, unboxing
Example
int a = 10;
Integer b = 20;
System.out.println(a + b);

Output: 30
Integer gets automatically unboxed into int.

21. Can a final primitive or reference variable be changed after initialization? What happens?
Ans- Final Primitive Variable: Cannot change value.
Final Reference Variable: Reference cannot change, but object data can change.

Example
final Student s = new Student();
s.id = 500; // allowed
s = new Student(); // ERROR

Meaning:
object contents can change
reference variable cannot point to new object





                                                                               8. COMMENTS IN JAVA
                                                                              -----------------------
Interview Questions
---------------------

1. What are the types of comments in Java?
Ans- In Java, there are 3 types of comments:
	1. Single-line comment(//)
	2. Multi-line comment(/* */)
	3. Documentation comment(/**  */)

2. Difference between single-line and multi-line comments.
Ans-
| Single-line Comment    | Multi-line Comment                  |
| ---------------------- | ----------------------------------- |
| Starts with `//`       | Starts with `/*` and ends with `*/` |
| Used for one line only | Used for multiple lines             |
| Short explanation      | Long explanation                    |

3. Can comments be nested?
Ans-
Single-line comments can be used inside multi-line comments as text.

But multi-line comments cannot be nested inside another multi-line comment.

4. Are comments compiled into bytecode?
Ans-No, comments are not compiled into bytecode.

5. What is the purpose of comments in coding standards or documentation?
Ans-
Comments are used to:

explain code logic
improve readability
help other developers understand code
describe purpose of classes and methods
generate documentation using Javadoc
make code maintenance easier


		                            Variables in Java (Instance, Static, Local)
                              ------------------------------------------------

1. What are the types of variables in Java?
Ans- 
There are 3 types of variables in Java:
Instance variables
Static variables
Local variables

2. Difference between instance, static, and local variables.
Ans-
| Feature       | Instance Variable            | Static Variable            | Local Variable                  |
| ------------- | ---------------------------- | -------------------------- | ------------------------------- |
| Declared      | Inside class, outside method | Inside class with `static` | Inside method/block/constructor |
| Belongs to    | Object                       | Class                      | Method/block                    |
| Memory        | Heap                         | Method Area/Class Area     | Stack                           |
| Default value | Yes                          | Yes                        | No                              |
| Access        | Through object               | Through class name         | Directly inside method          |
| Lifetime      | Until object exists          | Until class is loaded      | Until method/block executes     |


3. Can we declare variables inside a method as static?
Ans-No, we cannot declare a local variable as static.
Reason: static belongs to class level, but local variables belong to method/block level.

4. Scope and lifetime of instance variables, static variable, local variables?
Ans-
Instance Variable
Scope: Accessible inside the class through object.
Lifetime: Exists as long as the object exists.

Static Variable
Scope: Accessible inside class and through class name.
Lifetime: Exists from class loading until program ends or class unloads.

Local Variable
Scope: Only inside the method/block where it is declared.
Lifetime: Created when method/block starts and destroyed when method/block ends.

5. How are static variables shared among objects?
Ans- Static variables have only one copy in memory.
All objects share the same static variable.


6. Default values of instance, static, and local variables .?
Ans-
Instance and static variables get default values.
Data Type	Default Value
byte		0
short		0
int		0
long		0L
float		0.0f
double		0.0d
char		\u0000
boolean		false
Object/String	null

Local variables do not get default values. Otherwise Error

7. Can a variable shadow another variable?
Ans- Yes, a variable can shadow another variable.

Variable shadowing means a local variable has the same name as an instance or static variable.

8. How do instance, static variables, differ from local variables in memory allocation?
Ans-
| Variable Type     | Memory Allocation          |
| ----------------- | -------------------------- |
| Instance variable | Heap memory, inside object |
| Static variable   | Method Area/Class Area     |
| Local variable    | Stack memory               |

9. What is the difference between class-level and object-level variables?
Ans-
Class-level variable:
A class-level variable is a static variable.
It belongs to the class.
e.g.: static int count;
Only one copy exists.

Object-level variable:
An object-level variable is an instance variable.
It belongs to each object.
e.g.: int id;
Each object gets a separate copy.

10. What happens if we try to access a local variable in Java without initializing it?
Ans-local variables do not get default values.
So if you try to use a local variable without initialization, you get a compile-time error.



Programs:
1. Write a program to demonstrate the difference between instance and static variables.
Ans:
class Student {

    int id;                 // instance variable
    static String college;  // static variable

    void display() {
        System.out.println(id + " " + college);
    }
}

public class Main {
    public static void main(String[] args) {

        Student.college = "ABC College";

        Student s1 = new Student();
        s1.id = 101;

        Student s2 = new Student();
        s2.id = 102;

        s1.display();
        s2.display();
    }
}

2. Show how modifying a static variable affects all objects of a class.
Ans-
class Student {

    int id;
    static String college = "ABC College";

    void display() {
        System.out.println(id + " " + college);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.id = 101;

        Student s2 = new Student();
        s2.id = 102;

        s1.display();
        s2.display();

        Student.college = "XYZ College";

        s1.display();
        s2.display();
    }
}
Output:
101 ABC College
102 ABC College
101 XYZ College
102 XYZ College

3. Write a method to demonstrate local variable scope.
Ans-
class Main {

    static void show() {

        int x = 10; // local variable

        System.out.println(x);
    }

    public static void main(String[] args) {

        show();

        // System.out.println(x); // Error
    }
}
Output: 10

4. Create a program where variable shadowing occurs and explain the output.
Ans-
class Main {

    int x = 100; // instance variable

    void show() {

        int x = 50; // local variable shadows instance variable

        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {

        Main m = new Main();

        m.show();
    }
}
Output:
50
100

5. Write a program to count the number of objects created using a static variable?
Ans-
class Student {

    static int count = 0;

    Student() {
        count++;
    }

    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        Student.displayCount();
    }
}
Output:
Number of objects created: 3

6. Predict the output: program using local variables inside loops and methods.
Ans-
class Test {

    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++) {

            int x = i * 10;

            System.out.println(x);
        }
    }
}
Output:
10
20
30

7. write a program demonstrating instance variable initialization and default values.
Ans-
class Demo {

    int a;
    boolean b;
    String s;

    void display() {

        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
    }

    public static void main(String[] args) {

        Demo d = new Demo();

        d.display();
    }
}
Output:
0
false
null

8. Create a program to show that local variables must be initialized before use.
Ans-
class Test {

    public static void main(String[] args) {

        int x;

        // System.out.println(x); // ERROR

        x = 100;

        System.out.println(x);
    }
}
Output: 100

