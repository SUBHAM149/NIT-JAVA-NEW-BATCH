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
