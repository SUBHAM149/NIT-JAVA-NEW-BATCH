Weak-(5)-(19,20,21)
-----------------------------------------
                                         19. USES OF THIS KEYWORD
                                        --------------------------
1. What is the this keyword in Java? What is its main purpose in a class?
Answer:

-->this is a reference variable that refers to the current object of a class.
-->Whenever an object calls a method, Java automatically passes the reference of that object using this.

Main Purposes:
Refer current object.
Access instance variables.
Call current class methods.
Call current class constructors.
Pass current object as an argument.
Return current object.
Example:
class Student {
    int id = 101;

    void display() {
        System.out.println(this.id);
    }
}
2. How is this used to refer to the current object?
Answer:

Inside a non-static method or constructor, this refers to the object that is currently executing the method.

Example:
class Test {

    void show() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}
3. How can this be used to differentiate instance variables from local variables?
Answer:

When local variables and instance variables have the same name, this is used to   the instance variable.

Example:
class Employee {

    int id;

    Employee(int id) {
        this.id = id;
    }

    void display() {
        System.out.println(id);
    }
}
Explanation:
this.id = id;

Left Side → Instance Variable

Right Side → Local Variable

4. How is this used to call another constructor in the same class?
Answer:

this() is used to call another constructor of the same class.

This process is called Constructor Chaining.

Example:
class Student {

    Student() {
        this(101);
        System.out.println("Default Constructor");
    }

    Student(int id) {
        System.out.println("Parameterized Constructor");
    }
}
Output:
Parameterized Constructor
Default Constructor
Rule:
this()

must be the first statement inside the constructor.

5. Can this be used in a static method? Why or why not?
Answer:
No.
Static methods belong to the class, not to objects.
Since this refers to the current object, it cannot be used inside static methods.

Example:
class Test {

    static void show() {

        // System.out.println(this);
    }
}

Compile-Time Error.

6. Can this be passed as an argument to a method or constructor?
Answer:
Yes.
The current object can be passed to another method or constructor using this.

Example:
class Test {

    void display(Test t) {
        System.out.println("Object Received");
    }

    void show() {
        display(this);
    }
}
Output:
Object Received
7. How does this help in method chaining?
Answer: Method chaining is achieved by returning the current object using this.

Example:
class Student {

    Student m1() {
        System.out.println("M1");
        return this;
    }

    Student m2() {
        System.out.println("M2");
        return this;
    }
}
Student s = new Student();

s.m1().m2();
Output:
M1
M2
8. Difference between this and current class name for object reference.
| this                            | Class Name            |
| ------------------------------- | --------------------- |
| Refers current object           | Refers class          |
| Access instance members         | Access static members |
| Used only in non-static methods | Used anywhere         |
| Object Reference                | Class Reference       |
 Example:
class Test {

    int x = 10;
    static int y = 20;

    void show() {
        System.out.println(this.x);
        System.out.println(Test.y);
    }
}

                                                      USES OF SUPER KEYWORD
                                                    -------------------------
1. What is the super keyword in Java?
Answer:

super is a reference variable that refers to the immediate parent class object.

Uses:
Access parent class variables.
Access parent class methods.
Invoke parent class constructors.
Example:
class A {
    int x = 10;
}

class B extends A {

    void show() {
        System.out.println(super.x);
    }
}

2. How is super used to refer to the immediate parent class object?
Answer:

super accesses members of the parent class.

Example:
class Parent {
    int x = 100;
}

class Child extends Parent {

    void display() {
        System.out.println(super.x);
    }
}
Output:
100


3. How can super be used to call parent class methods?
Answer:

When a subclass overrides a method, super can invoke the parent version.

Example:
class A {

    void show() {
        System.out.println("Parent Method");
    }
}

class B extends A {

    void show() {
        super.show();
        System.out.println("Child Method");
    }
}
Output:
Parent Method
Child Method

4. How can super be used to access parent class variables hidden by subclass?
Answer:

If parent and child classes have variables with the same name, super accesses the parent variable.

Example:
class A {
    int x = 10;
}

class B extends A {

    int x = 20;

    void show() {
        System.out.println(super.x);
        System.out.println(this.x);
    }
}
Output:
10
20

5. How is super() used to call parent class constructors?
Answer:

super() invokes the immediate parent class constructor.

Example:
class A {

    A() {
        System.out.println("Parent Constructor");
    }
}

class B extends A {

    B() {
        super();
        System.out.println("Child Constructor");
    }
}
Output:
Parent Constructor
Child Constructor

6. Can super() and this() be used together in a constructor? Why or why not?
Answer:

No.

Both this() and super() must be the first statement inside a constructor.

Since only one statement can be first, they cannot be used together.

Invalid Example:
class Test {

    Test() {
        this();
        super();
    }
}

Compile-Time Error.


7. Can super be used in a static context? Why or why not?
Answer:

No.

Static methods belong to the class and do not have object references.

Since super refers to the parent object, it cannot be used inside static methods.

Example:
class B extends A {

    static void show() {

        // super.display();
    }
}

Compile-Time Error.

8. Difference between super and this in constructor chaining.
| this()                          | super()                        |
| ------------------------------- | ------------------------------ |
| Calls current class constructor | Calls parent class constructor |
| Same class chaining             | Parent-child chaining          |
| Refers current object           | Refers parent object           |
| First statement                 | First statement                |

9. How does super help in method overriding to call the parent class version of a method?
Answer:

When a subclass overrides a method, the parent version can still be executed using super.

Example:
class A {

    void show() {
        System.out.println("Parent");
    }
}

class B extends A {

    void show() {
        super.show();
        System.out.println("Child");
    }

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
Output:
Parent
Child


                                                20.ARRAYS
                                        --------------------------
INTERVIEW QUESTIONS
--------------------
1. How do you declare an array in Java? What are the three ways to declare an array?
ANS-
Array declaration means creating a reference variable that can hold multiple values of the same type.

Three Ways
int arr[];(square braces)
int[] arr;
int []arr;
All are valid.

Example
int[] marks;

2. How do you instantiate an array?
ANS-
Instantiation means allocating memory to the array using the new keyword.

Syntax
datatype[] arrayName = new datatype[size];
Example
int[] arr = new int[5];

Memory for 5 integers is allocated.

3. Can you declare and instantiate an array in a single line?
Ans-
Yes.
Example
int[] arr = new int[5];
or
int[] arr = {10,20,30,40,50};

4. Can an array have zero size?
Answer
Yes.

Example
int[] arr = new int[0];
System.out.println(arr.length);
Output
0
No exception occurs.

5. Can you declare an array without specifying size? Is negative size allowed?
Ans-Yes, you can declare an array without specifying its size.
Without Size
Valid:
int[] arr;
Invalid:
int[] arr = new int[];
Negative Size
int[] arr = new int[-5];
Output
java.lang.NegativeArraySizeException


6. How is an array object stored in memory?
Ans-
Arrays are objects in Java.
Array Reference Variable → Stored in Stack Memory
Actual Array Object → Stored in Heap Memory


7. Difference between Stack and Heap in arrays?
| Stack                     | Heap                       |
| ------------------------- | -------------------------- |
| Stores reference variable | Stores actual array object |
| Faster                    | Larger Memory              |
| Thread Specific           | Shared                     |

8. Can array size be changed after instantiation?
Ans-
No.
Array size is fixed.

9. Difference between
new int[5]
and
int[] arr = {1,2,3,4,5};
new int[5]
int[] arr = new int[5];

Output:
0 0 0 0 0
Default values.
Array Literal
int[] arr = {1,2,3,4,5};

Values initialized directly.

10. Can you store different data types in an array?
Answer
No.
Arrays are homogeneous.


11. Difference Between Shallow Copy and Deep Copy of Arrays
A) Shallow Copy
Theory
In a shallow copy, both references point to the same array object.
If one reference modifies the array, the change is reflected in the other reference as well.

Example
int[] arr1 = {10,20,30};

int[] arr2 = arr1;

arr2[0] = 100;

System.out.println(arr1[0]);
System.out.println(arr2[0]);
Output
100
100


B) Deep Copy
Theory
In a deep copy, a completely new array object is created.
Changes made to one array do not affect the other.

Example Using clone()
int[] arr1 = {10,20,30};

int[] arr2 = arr1.clone();

arr2[0] = 100;

System.out.println(arr1[0]);
System.out.println(arr2[0]);
Output
10
100

12. How do you declare a 2D Array in Java?
Ans-
A 2D Array (Two-Dimensional Array) is an array of arrays used to store data in the form of rows and columns (matrix format).

13. How do you instantiate a 2D Array in Java?
Ans-
Instantiation means allocating memory for a 2D array using the new keyword.
A 2D array consists of rows and columns.

Syntax
datatype[][] arrayName = new datatype[rows][columns];
Example 1: Instantiating a 2D Array
int[][] arr = new int[3][4];
Meaning
3 Rows
4 Columns

14. How do you access elements in a 2D Array?
Ans-
A 2D array stores data in the form of rows and columns.
To access an element, use:
arrayName[rowIndex][columnIndex]
Index starts from 0.

Example
int[][] arr = {
    {10,20,30},
    {40,50,60},
    {70,80,90}
};
System.out.println(arr[1][2]);
Output
60
15. Difference Between Rectangular and Jagged Arrays (Theory Only)
| Rectangular Array                         | Jagged Array                                    |
| ----------------------------------------- | ----------------------------------------------- |
| All rows have the same number of columns. | Rows can have different numbers of columns.     |
| Regular structure.                        | Irregular structure.                            |
| Memory allocated uniformly.               | Memory allocated according to row requirements. |
| Easier to access and process.             | More flexible and memory efficient.             |
| Suitable for matrix representation.       | Suitable when row sizes vary.                   |

16. How do you declare, instantiate and access a 3D Array?
16. How do you declare, instantiate and access a 3D Array?

A 3D Array (Three-Dimensional Array) is an array that consists of multiple two-dimensional arrays. It is used to store data in three dimensions and is represented using three indices.

Declaration

A 3D array is declared by specifying three pairs of square brackets.

int[][][] arr;
Instantiation

Memory is allocated to the array using the new keyword.

arr = new int[2][3][4];

                                                21.STRING
                                        --------------------------
INTERVIEW QUESTIONS
--------------------
1. What is a String in Java?
Ans-
A String is a sequence of characters enclosed within double quotes ("").
In Java, String is a class present in the java.lang package.
Strings are immutable, meaning once created, their value cannot be changed.

Example
String name = "Subham";
System.out.println(name);
Output
Subham


2. How do you create a String object and how many ways are there?
Ans-There are two ways to create Strings:

Method 1: String Literal
String s1 = "Hello";
Stored in String Constant Pool (SCP).

Method 2: Using new Keyword
String s2 = new String("Hello");
Stored in Heap Memory.

4. Why are Strings immutable in Java?
Ans-
Java Strings are immutable because of:

Security
Thread Safety
Caching
Performance
Example
String s = "Java";
s.concat("Programming");
System.out.println(s);
Output:
Java
Original string remains unchanged.


5. What is String Constant Pool (SCP)?
Ans-
SCP is a special memory area inside Heap where string literals are stored.

Example
String s1 = "Java";
String s2 = "Java";
Only one object is created in SCP.


6. How does SCP help in memory optimization?
Ans-
Duplicate string literals are not created.
Java reuses the existing object.

Example
String s1 = "Hello";
String s2 = "Hello";
String s3 = "Hello";
Only one object exists in SCP.


7. What happens when you create two String literals with the same value?
Example
String s1 = "Java";
String s2 = "Java";
System.out.println(s1 == s2);

Output
true
Both references point to the same SCP object.


9. How does intern() method work?
Ans-
intern() moves or returns the SCP reference.

Example
String s1 = new String("Java");
String s2 = s1.intern();
System.out.println(s2 == "Java");

Output
true

10. Why did Java designers make String immutable?
Answer
String is immutable for:
| Reason           | Benefit                                   |
| ---------------- | ----------------------------------------- |
| Security         | Prevents unauthorized changes             |
| Thread Safety    | Multiple threads can share Strings safely |
| Caching          | Hashcode can be cached                    |
| SCP Optimization | Reuse of String objects                   |


11. What is the advantage of storing Strings in SCP?
Answer
Saves memory
Avoids duplicate objects
Improves performance
Faster comparison

12. What happens internally when you modify a String?
Answer
A new String object is created because Strings are immutable.

Example
String s = "Java";
s = s + " Programming";

Internally:
Java
↓
New Object Created
↓
Java Programming

Project_Exam_5-Library_Management_System
13. What is the difference between mutable and immutable objects?
| Mutable       | Immutable       |
| ------------- | --------------- |
| Can change    | Cannot change   |
| StringBuilder | String          |
| StringBuffer  | Wrapper Classes |


14. What happens if you concatenate Strings using + operator?
Answer
Compiler converts it into StringBuilder operations.
Lab_Project_34-SpringCore_Employee_Management_System

15. What is the difference between == and equals() in Strings?
| ==                              | equals()                     |
| ------------------------------- | ---------------------------- |
| Reference Comparison            | Content Comparison           |
| Returns true if addresses match | Returns true if values match |


16. What is the Difference Between compareTo() and equals()?
Theory
Both compareTo() and equals() are used to compare Strings, but they work differently.
compareTo()
Compares strings lexicographically (dictionary order).
Returns an integer value.
Used for sorting and ordering strings.
equals()
Compares the content (values) of two strings.
Returns a boolean value (true or false).
Used when you only want to know whether two strings are equal.



17.Can String be extended9(inheritance)?Why or Whynot?

Ans-No, the String class cannot be extended because it is a final class in Java.
Example:
class MyString extends String {
}
Output:
Error: Cannot inherit from final String

18.Difference between substring() and subsequence()?
Ans-
| `substring()`                             | `subSequence()`                              |
| ----------------------------------------- | -------------------------------------------- |
| Returns a `String` object.                | Returns a `CharSequence` object.             |
| Syntax: `substring(beginIndex, endIndex)` | Syntax: `subSequence(beginIndex, endIndex)`  |
| Used when a String result is required.    | Used when a CharSequence result is required. |

Example:
String str = "HelloWorld";
System.out.println(str. substring(0, 5));    // Hello
System.out.println(str.subsequence(0, 5));  // Hello

19.What is string buffer Class In Java?
Ans-String Buffer is a predefined class in Java used to create mutable (modifiable) string objects. Unlike String, the contents of a String Buffer object can be changed without creating a new object. It is synchronized, making it thread-safe.
Example:
StringBuffer sb = new StringBuffer("Hello");
sb.append(" Java");
System.out.println(sb);
Output:
Hello Java

20.Is String Buffer mutable or immutable?Is StringBuffer thread-safe?Why?
Ans-
StringBuffer is mutable because its contents can be modified after creation.
Yes, StringBuffer is thread-safe because its methods are synchronized, allowing multiple threads to access it safely.

Example:
StringBuffer sb = new StringBuffer("Hello");
sb.append(" Java");
System.out.println(sb);

Output:
Hello Java

21.Difference Between append() and insert() methods?
Ans-| `append()`                             | `insert()`                                          |
    | -------------------------------------- | --------------------------------------------------- |
    | Adds data at the end of the string.    | Adds data at a specified position.                  |
    | Syntax: `append(data)`                 | Syntax: `insert(index, data)`                       |
    | Increases length by adding at the end. | Inserts data without replacing existing characters. |

Example:

StringBuffer sb = new StringBuffer("Hello");
sb.append(" Java");
System.out.println(sb);   // Hello Java
sb.insert(5, " World");
System.out.println(sb);   // Hello World Java

22.What is the diffult capcity of StringBuffer?
Ans-The default capacity of a StringBuffer object is 16 characters.
Example:
StringBuffer sb = new StringBuffer();
System.out.println(sb.capacity());
Output:
16

23.How does the capacity of StringBuffer increase dynamically?
Ans-Ans: When the current capacity is exceeded, the capacity of a StringBuffer increases automatically using the formula:
New Capacity = (Old Capacity × 2) + 2

24.What is string builder in Java?
Ans: StringBuilder is a predefined class in Java used to create mutable (modifiable) string objects. It allows modification of string content without creating a new object. It is not thread-safe because its methods are not synchronized, making it faster than StringBuffer.

25.Difference between StringBuffer and StringBuilder?
Ans-
| StringBuffer                           | StringBuilder                                  |
| -------------------------------------- | ---------------------------------------------- |
| Thread-safe (methods are synchronized) | Not thread-safe (methods are not synchronized) |
| Slower                                 | Faster                                         |
| Introduced in Java 1.0                 | Introduced in Java 5                           |
| Used in multi-threaded environments    | Used in single-threaded environments           |

26.Is StringBuilder thread-safe? Why Or Whynot?
Ans-No, StringBuilder is not thread-safe.
Reason: Its methods are not synchronized, so multiple threads can access and modify the same object at the same time, which may lead to data inconsistency.

27.When should you use Stringbuilder over StringBuffer?
Ans-You should use StringBuilder when you are working in a single-threaded environment where thread safety is not required.
Reason: StringBuilder is faster because it is not synchronized, so it does not have the overhead of thread safety.

28.What are common methods in Stringbuilder and stringBuffer?
Common Methods:
append() → Adds data at the end
insert() → Inserts data at a specific position
delete() → Removes characters from a range
deleteCharAt() → Removes a character at a specific index
reverse() → Reverses the string
replace() → Replaces characters in a range
length() → Returns length of the string
capacity() → Returns current capacity

29.Which one is best for frequent string modification?
Ans-StringBuilder is generally the best choice for frequent string modification because it is faster and more efficient than StringBuffer as it does not provide synchronization (thread safety). If thread safety is required, use StringBuffer; otherwise, prefer StringBuilder for better performance.

30.Whic one is best for multithreaded environment and single thread environment?
Ans-StringBuffer is best for a multithreaded environment because it is thread-safe (its methods are synchronized).
StringBuilder is best for a single-thread environment because it is faster and has better performance.

Summary:
Multithreaded → StringBuffer
Single-threaded → StringBuilder

31.Difference between length() method and length property of arrays.
| `length()` Method                                     | `length` Property                                          |
| ----------------------------------------------------- | ---------------------------------------------------------- |
| Used with **String** objects.                         | Used with **arrays**.                                      |
| It is a **method**, so parentheses `()` are required. | It is a **property/variable**, so no parentheses are used. |
| Returns the number of characters in a string.         | Returns the size (number of elements) of an array.         |
String str = "Hello";
System.out.println(str.length());   // 5

int[] arr = {10, 20, 30};
System.out.println(arr.length);     // 3


32.Difference between isEmpty() and isBlank().
| `isEmpty()`                                   | `isBlank()`                                                                                            |
| --------------------------------------------- | ------------------------------------------------------------------------------------------------------ |
| Returns `true` if the string length is **0**. | Returns `true` if the string is empty or contains only **whitespace** characters (spaces, tabs, etc.). |
| Available since early Java versions.          | Introduced in **Java 11**.                                                                             |
| Does not ignore spaces.                       | Ignores spaces and other whitespace characters.                                                        |
String s1 = "";
String s2 = "   ";

System.out.println(s1.isEmpty()); // true
System.out.println(s2.isEmpty()); // false

System.out.println(s1.isBlank()); // true
System.out.println(s2.isBlank()); // true

33.Difference between trim() and strip()(introduced in java 11).
| `trim()`                                                      | `strip()`                                                       |
| ------------------------------------------------------------- | --------------------------------------------------------------- |
| Removes leading and trailing **ASCII whitespace** characters. | Removes leading and trailing **Unicode whitespace** characters. |
| Available since early Java versions.                          | Introduced in **Java 11**.                                      |
| May not remove some special Unicode spaces.                   | Handles all Unicode whitespace correctly.                       |

String str = "  Hello  ";

System.out.println(str.trim());
System.out.println(str.strip());


34.Difference between strip(),stripLeading(), and stripTrailing().
| Method            | Description                                                               |
| ----------------- | ------------------------------------------------------------------------- |
| `strip()`         | Removes whitespace from **both beginning and end** of the string.         |
| `stripLeading()`  | Removes whitespace only from the **beginning (left side)** of the string. |
| `stripTrailing()` | Removes whitespace only from the **end (right side)** of the string.      |
Example
String str = "   Hello World   ";

System.out.println("'" + str.strip() + "'");
System.out.println("'" + str.stripLeading() + "'");
System.out.println("'" + str.stripTrailing() + "'");

Output:

'Hello World'
'Hello World   '
'   Hello World'

35.Difference between indexOf() and lastIndexOf().
| `indexOf()`                                                                | `lastIndexOf()`                                                           |
| -------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| Returns the index of the **first occurrence** of a character or substring. | Returns the index of the **last occurrence** of a character or substring. |
| Searches from **left to right**.                                           | Searches from **right to left**.                                          |
| Returns `-1` if the character or substring is not found.                   | Returns `-1` if the character or substring is not found.                  |

Example
String str = "Java Programming Java";

System.out.println(str.indexOf("Java"));      // 0
System.out.println(str.lastIndexOf("Java"));  // 17
Output
0
17

36.Difference between split() and join (breaking vs combining).
Ans-
| `split()`                                   | `join()`                                          |
| ------------------------------------------- | ------------------------------------------------- |
| Used to break a string into multiple parts. | Used to combine multiple strings into one string. |
| Returns an array of strings.                | Returns a single string.                          |
| Takes a delimiter as input.                 | Uses a delimiter to connect elements.             |

Example:
String str = "Java,Python,C++";
String[] arr = str.split(",");

Output:
[Java, Python, C++]
String result = String.join("-", "Java", "Python", "C++");

Output:
Java-Python-C++
Short Answer:

split() → Breaks a string into parts.
join() → Combines strings into one.

37.Difference between valueOf() and to string().
Ans-
| `valueOf()`                                  | `toString()`                                       |
| -------------------------------------------- | -------------------------------------------------- |
| Converts different data types into a String. | Converts an object into its String representation. |
| Static method.                               | Non-static method.                                 |
| Can handle primitive values directly.        | Called on an object.                               |

Example:
int num = 100;
String s1 = String.valueOf(num);
System.out.println(s1);

Output:
100
Integer num = 100;
String s2 = num.toString();
System.out.println(s2);

Output:
100

Short Answer:
valueOf() → Converts any data type to String.
toString() → Converts an object to String.
