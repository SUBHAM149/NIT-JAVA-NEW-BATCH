
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




                                                        10. OPERATOR
						     ------------------

** What is Operator?
Ans: An operator in Java is a symbol that performs an operation on variables or values.
or    An operator in Java is a symbol that performs operations on operands. Examples include arithmetic, relational, logical, assignment, unary, bitwise, and ternary operators.


					      1. INCREMENT & DECREMENT OPERATORS
					      -----------------------------------

Used to increase or decrease a variable's value by 1.

++ (increment), -- (decrement)

Interview Questions
--------------------


1. What are increment and decrement operators in Java?
Ans- Increment and decrement operators are used to increase or decrease a variable value by 1.

2. What is the difference between pre-increment and post-increment?
Ans- Pre-increment updates value before use, while post-increment uses value before updating.


3. What happens if you use increment operators on a final variable?
Ans- Increment operators cannot be used on final variables because final variables cannot be modified.


4. Can you use increment operators on boolean values or reference types? Why or why not?
Ans- Increment operators cannot be used on boolean or reference types because they work only with numeric primitive data types.


Programs:

Predict the output:
int a = 5;

int b=++a + a++;

System.out.println(b);

1. Write a program to demonstrate the difference between a++ and ++a
2. What is the output? Explain the order of increment/decrement.
int a = 5;

int b = a++ +++a + -- a +a --;

System.out.println(a+""+b);

NARESHIT

Core Java Interview Questions

3. What will be printed? (Hint: post vs pre increment difference)
int x = 10;

System.out.println(x+++++x+x);


				                      2. ARITHMETIC OPERATORS
				                     ---------------------------

Used for mathematical calculations: +, -, *, /, %

Interview Questions
--------------------

1)What are arithmetic operators in Java?
Ans- Arithmetic operators are used to perform mathematical operations like addition, subtraction, multiplication, division, and modulus.

2)What happens when we divide numbers of different types in Java (int and float)?
For example:
int / int
float / int
int / float
float / float
Ans- Java performs automatic type promotion. If one operand is float, result becomes float. int/int gives int result.

3)What happens when you divide by zero using integer division?
Ans- Integer division by zero throws ArithmeticException.

4)What is the difference between / and % operators?
Ans- / gives quotient while % gives remainder.

5)Can arithmetic operators be overloaded in Java?
Ans- Java does not support user-defined operator overloading. Only + is specially supported for String concatenation.


Programs

1. Write a program to perform all arithmetic operations on two numbers.

2. Predict the output:
int a =10, b=3;

System.out.println(a /b);
System.out.println(a % b);



					3.RELATIONAL OPERATORS
                                       -----------------------
Interview Questions
--------------------
1.What are relational operator used for?
Ans-They are used to compare two values.

2.What is the difference between== and equals()?
Ans-== compares references, equals() compares values.

3.Can relational operator be used with Boolean values?
Ans-Yes, == and != can be used with Boolean values.

4.What will be output of 5==5.0?
Ans-true

5.What is the return type of relational expression?
Ans-Boolean

6.What is the difference between = and == in Java?
Ans-  = : Assignment operator
     == : Comparison operator


                                             4.LOGICAL OPERATORS
                                          ----------------------------
Interview Questions
-------------------
1.What are logical operator in Java?
Ans-Logical operators are used to combine Boolean conditions.

2.What is short-circuit evaluation?
Ans-It stops checking conditions when the result is already decided.

3.What is the difference between & and &&?
Ans-& : Checks all conditions
&& : Stops if first condition is false

4.What is the result of combining true/false values using logical operators?
Ans-The result is always true or false.

5.Can logical operators be applied to non-Boolean operands?
Ans-No, logical operators work with Boolean values only.



                                            5.NEGATION OPERATORS
                                          ----------------------------
Interview Questions
-------------------
1.What is the purpose of the negation operator?
Ans-It reverses a Boolean value.

2.Can a negation operator be used with integers?
Ans-No, it works only with Boolean values.

3.What is the output of !(true && false)?
Ans-!(true∧false)

4.How does negation work with multiple conditions?
Ans-It reverses the final Boolean result of the condition.



                                           6.ASSIGNMENT OPERATORS
                                          ----------------------------
Interview Questions
-------------------
1.What is the assignment operator in Java?
Ans-The assignment operator (=) is used to assign values to variables.

2.What does x += y mean?
Ans-It means x = x + y

3.What is the output of !(true && false)?
Ans-!(true∧false)
Output: true

4.Can you chain assignment operators like a=b=c=10?
Ans-Yes, Java allows chained assignments.







			                       7. BITWISE OPERATORS
                                               ----------------------


Used for bit-level operations: &, |, ^, ~, << , >>, >>>

Interview Questions
--------------------

1. What are bitwise operators used for?
Ans- Bitwise operators are used to perform operations at bit level.
They are used for:

checking bits
setting bits
clearing bits
toggling bits
fast calculations
low-level programming
flags and permissions


2. What does >> and >>> mean?
Ans- >> is signed right shift and preserves sign bit. >>> is unsigned right shift and fills zeros from the left side.


3. What is the effect of the ~ operator?
Ans- ~ flips all bits of a number. It is called the bitwise complement operator.
Formula
~n = -(n + 1)

Example:

~5 = -(5 + 1)
    = -6

4. Are bitwise operations faster than arithmetic operations?
Ans- Yes, bitwise operations are generally faster because they work directly on bits at hardware level.

Programs

1. Write a program to swap two numbers using bitwise XOR.
Ans-


2. Predict the output:
int a = 5, b=3;
System.out.println(a & b);

System.out.println(a | b);

System.out.println(a^b);
Ans-



3. What is left shift and right shift doing here?
int x = 8;

System.out.println(x << 2);

System.out.println(x>>1);
Ans-


				8. BOOLEAN OPERATOR
				-------------------
Interview Questions
-------------------

1. What are boolean operators in Java?
Ans- Boolean operators are operators that work with true and false values such as &&, ||, and !.
 
2. What is the default value of a boolean variable?
Ans- The default value of a boolean variable is false.
 

3. Difference between Boolean (wrapper class) and boolean (primitive type)?
Ans-
| `boolean`                  | `Boolean`                      |
| -------------------------- | ------------------------------ |
| Primitive data type        | Wrapper class                  |
| Stores true/false directly | Stores object reference        |
| Faster                     | Slightly slower                |
| Cannot store `null`        | Can store `null`               |
| Default value = `false`    | Default value = `null`         |
| Used for basic logic       | Used in collections/frameworks |


4. Can boolean be converted to int directly?
Ans- No, Java does not allow direct conversion between boolean and int.
 

Programs:

1. Write a program using boolean variables to check eligibility for driving.
2. What is the value of result?
Boolean x = true, y = false;

boolean result =x && !y;

System.out.println(result);

3. What will be printed?
Boolean a = true;

a = !a || false;

System.out.println(a);
	


				9. TERNARY OPERATOR
				---------------------

Short form of if-else: condition ? value1 : value2

Interview Questions
--------------------

1. What is the ternary operator in Java?
Ans- The ternary operator is a conditional operator used as a short form of if-else.
It checks a condition and returns one of two values.
It is called ternary because it uses three operands.
 

2. Can a ternary operator replace an if-else statement?
Ans- Yes, ternary operator can replace simple if-else statements.
 

3. What is the syntax of a ternary operator?
Ans- Syntax: condition ? expression1 : expression2;
 

4. Can we have nest ternary operators in java? Give example?
Ans- Yes, Java allows nested ternary operators.
A ternary operator inside another ternary operator is called nested ternary.

Example:
int a = 10;
int b = 20;
int c = 30;

int largest = (a > b)
                ? ((a > c) ? a : c)
                : ((b > c) ? b : c);

System.out.println(largest);

Output:
30
 

Programs:

1. Write a program to find the maximum of two numbers using a ternary operator.
2. Write a program to check if a number is even or odd using ternary operator.
3. What is the output? Can you rewrite this using if-else?
Int a = 10, b=20;

int max = (a >b)?a:b;

System.out.println(max);

4. What will be printed for x = 5, x = 6, and x = 8?
Int x = 5;

String result = (x% 2 == 0) ? "Even" : (x>5 ?"Greater": "Odd");

System.out.println(result);



				10. MEMBER OPERATOR (. OR DOT OPERATOR)
				---------------------------------------

Used to access members (fields and methods) of a class or object.

Interview Questions
--------------------
1. What is the dot operator used for?
Ans- The dot (.) operator is used to access members of a class or object.

It is used to access:

variables
methods
constructors
packages
static members
 

2. Can the dot operator be used with static members?
Ans- Yes, the dot operator is used with static members.

Static members are usually accessed using the class name.
 

3. What is the difference between object.method() and ClassName.method()?
Ans-
| `object.method()`         | `ClassName.method()`    |
| ------------------------- | ----------------------- |
| Used for instance methods | Used for static methods |
| Requires object creation  | No object required      |
| Belongs to object         | Belongs to class        |
 

4. What happens when you use a dot operator on a null reference?
Ans- Using the dot operator on a null reference throws NullPointerException.
 

Programs

1. Write a simple class and use the dot operator to access its members.
Ans-
 

2. Which members are accessed using the dot operator?
Ans-
 

Class Student {

int id=1;

void show() {

System.out.println("ID:"+ id);

 }
}

public class Test {

public static void main(String[] args) {

Student s = new Student();

s.show();

System.out.println(s.id);
 }
}

				11. NEW OPERATOR
			      --------------------

Used to allocate memory for an object.

Interview Questions
--------------------
1. What does the new operator do?
Ans- The new operator is used to create objects in Java.

It:
allocates memory for the object (in heap Area)
calls the constructor
returns the object reference
 

2. Can an object be created without the new operator?
Ans- Yes, objects can be created without directly using new, such as through cloning, deserialization, reflection, and factory methods.
 

3. What happens if memory allocation fails?
Ans- If memory allocation fails, JVM throws OutOfMemoryError.
 

4. Can we overload the new operator in Java?
Ans- No, Java does not support overloading of the new operator. Because Java keeps memory management controlled by JVM. Developers cannot change how object creation works.


Programs:

1. Create an object using new operator and call its methods.
Ans-
 
2. What will the output be? What happens when you remove new?
class Demo {

Demo() {

System.out.println("Object Created");
  }
}

public class Main {

public static void main(String[] args) {

Demo obj = new Demo();
}

Ans-
 


				12. INSTANCEOF OPERATOR
				-----------------------

Used to test whether an object is an instance of a particular class or subclass.

Interview Questions
--------------------
1. What is the purpose of the instanceof operator?
Ans- The instanceof operator is used to check whether an object belongs to a specific class or interface.
 

2. What is the return type of instanceof?
Ans- The return type of instanceof is boolean.
 

3. Can instance of be used with interfaces?
Ans- Yes, instance of can be used with interfaces to check whether an object implements an interface.

4. What happens if you use instanceof with null?
Ans- Using instanceof with null returns false because null does not refer to any object.
 
