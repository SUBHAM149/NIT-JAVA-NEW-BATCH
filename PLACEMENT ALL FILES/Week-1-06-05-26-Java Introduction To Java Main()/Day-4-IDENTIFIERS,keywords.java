
				                                4. IDENTIFIERS
Interview Questions
-------------------
1) What is an identifier in Java? Why do we use identifiers in Java?
Ans- An identifier is a sequence of characters used to name various program elements like :-
Class
Method
Variable
Interface
Object
Package.

Purpose: They allow the programmer to refer to specific memory locations or blocks of code throughout the program.

2) What are the rules for creating identifiers in Java?
Ans- Identifier can contain:
	Alphabets (A-Z, a-z)
	Digits (0-9)
	Underscore (_)
	Dollar symbol ($)
Identifier must not start with a digit.
Spaces are not allowed.
Keywords cannot be used as identifiers.
Special characters except _ and $ are not allowed.
Identifiers are case-sensitive.
Length of identifier has no limit.

3) Are Java identifiers case-sensitive?
Ans- Yes, Java identifiers are case-sensitive.
4) Can we use special characters like @, #, $, % in identifiers?
Ans- Yes, but partially allowed means-
Allowed: Only $ (Dollar sign) and _ (Underscore) are allowed.
Not Allowed: Characters like @, #, %, &, and * are illegal and will cause a compilation error.

5) Can we use keywords as identifiers?
Ans- No, Java keywords cannot be used as identifiers.

6) What are reserved keywords? How are they different from identifiers?
Ans- Reserved keywords are predefined words in Java that have special meaning to the compiler.

Examples:

class
int
if
while
return
Identifiers

Identifiers are user-defined names used for variables, methods, classes, etc.

7) Can method name and variable name be the same identifier?
Ans- Yes, method name and variable name can be the same because they belong to different namespaces.

8) What is the difference between an identifier and a literal?
Ans-
| Identifier                     | Literal                         |
| ------------------------------ | ------------------------------- |
| Name given to program elements | Fixed constant value            |
| Created by programmer          | Direct value written in program |
| Can change value               | Represents actual data          |

9) What is the difference between identifier and variable?
Ans:-
| Identifier                                  | Variable                    |
| ------------------------------------------- | --------------------------- |
| Name used to identify elements              | Storage location for data   |
| Can represent class, method, variable, etc. | Stores values               |
| Broader term                                | Specific type of identifier |

10) What are legal and illegal identifier examples?
Ans- Legal Identifiers
	student
	student1
	_emp
	$salary
	totalMarks

Illegal Identifiers
1student
total marks
@class
int
emp#

                                                keywords
                                               ----------

Interview Questions
1) What is a keyword in Java?
Ans- A keyword in Java is a reserved word that has a predefined meaning for the compiler.
Examples- class,int,if,while,return

2) How many keywords are available in Java?
Ans- Java has 50 reserved keywords.like-
class
static
final
public
private
this
super

3) Are Java keywords case-sensitive?
Ans- Yes, Java keywords are case-sensitive.

4) Why are keywords reserved in Java?
Ans- Keywords are reserved because they already have predefined meanings in Java syntax.
Example:
if(condition)
Here if is reserved for conditional statements.

5) Can keywords be used as identifiers? Why not?
Ans- No, keywords cannot be used as identifiers because they are reserved for special purposes by the Java compiler.

Invalid example:
int class = 10;
class is a keyword, so this causes a compilation error.

6) What is the use of static keyword?
Ans- The static keyword is used for memory management.
It belongs to the class rather than objects.
Uses:
Static variable
Static method
Static block
Example
class Test {
    static int count = 0;
}
count is shared among all objects.

7) What is the use of final keyword? What happen when we declare a variable, method, class as final?
Ans- The final keyword is used to restrict modification.
Final Variable Value cannot be changed.
Final Method Cannot be overridden.
Final Class Cannot be inherited.

8) What does the super keyword do in Java?
Ans- The super keyword refers to the parent class object.
Uses:
Access parent class variable
Call parent class method
Call parent class constructor

9) What is the role of this keyword?
Ans- The this keyword refers to the current class object.
Uses:
Access current class variables
Call current class methods
Invoke current constructor

10) What is the difference between this and super?
Ans-
| this                           | super                         |
| ------------------------------ | ----------------------------- |
| Refers to current class object | Refers to parent class object |
| Access current class members   | Access parent class members   |
| Calls current constructor      | Calls parent constructor      |

11) What is the purpose of the new keyword?
Ans- The new keyword is used to create objects dynamically.
It allocates memory for objects.

12) Why do we use the return keyword?
Ans- The return keyword is used to return a value from a method.

13) What are break and continue keywords?
break:- Terminates loop or switch immediately.
continue:- Skips current iteration and moves to next iteration.

14) What is the use of void keyword?
Ans- The void keyword specifies that a method does not return any value.

15) Explain public, private, protected keywords.
Ans-
| Modifier  | Accessibility                            |
| --------- | ---------------------------------------- |
| public    | Accessible everywhere                    |
| private   | Accessible only within same class        |
| protected | Accessible within package and subclasses |

16) What is the difference between abstract and final keywords?
Ans-
| abstract             | final                 |
| -------------------- | --------------------- |
| Incomplete           | Complete              |
| Must be overridden   | Cannot be overridden  |
| Used for inheritance | Restricts inheritance |

17) What is the role of the extends keyword?
Ans- The extends keyword is used for inheritance.
It allows one class to inherit properties from another class.

18) What is the use of implements keyword?
Ans- The implements keyword is used to implement interfaces.
A class can implement multiple interfaces.

19) What is the use of package keyword?
Ans- The package keyword is used to group related classes and interfaces.
It helps:

Organize files
Avoid naming conflicts
Provide access protection

20) What is the difference between import and package?
Ans-
| package                      | import                            |
| ---------------------------- | --------------------------------- |
| Declares package name        | Uses classes from another package |
| Written at beginning of file | Written after package statement   |
| Creates namespace            | Accesses existing classes         |

21) What is the purpose of instanceof keyword?
Ans- The instanceof keyword checks whether an object belongs to a particular class or interface.
it Returns:
true
false

22) Explain the use of interface keyword.
Ans- The interface keyword is used to create interfaces in Java.
Interfaces contain: Abstract methods,Constants
They are used to achieve: Abstraction,Multiple inheritance

23) What is the use of throws and throw keywords?
Ans- The throw keyword is used to explicitly throw an exception.
The throws keyword is used to declare exceptions in a method signature.
| throw                              | throws                            |
| ---------------------------------- | --------------------------------- |
| Used to throw exception explicitly | Used to declare exceptions        |
| Used inside method body            | Used in method declaration        |
| Followed by exception object       | Followed by exception class names |


24) What does the try, catch, and finally block mean?
Ans-try block Contains code that may produce an exception.
catch block Handles the exception generated in the try block.
finally block Executes always whether exception occurs or not.
Used for cleanup operations like:
Closing files
Closing database connections

25) What is the use of enum keyword?
Ans- The enum keyword is used to define a collection of constants.
26) What does the transient keyword do?
The transient keyword prevents a variable from being serialized.
When an object is converted into a stream:
transient variables are skipped

27) What is the role of volatile keyword?
Ans- The volatile keyword ensures that variable values are always read from main memory, not thread cache.
It is mainly used in multithreading.
Example: volatile boolean flag = true;
Benefits: Visibility of updated values across threads
Prevents caching issues

28) What is the use of synchronized keyword?
Ans- The synchronized keyword is used to control multiple thread access to shared resources.
It prevents:
Data inconsistency
Race conditions

Only one thread can execute synchronized code at a time.

29) What is the meaning of strictfp keyword?
Ans- The strictfp keyword ensures consistent floating-point calculations across all platforms.
Without strictfp, floating-point calculations may vary between systems.
Used in:
Scientific calculations
Financial applications

30) Where do we use native keyword?
Ans- The native keyword is used to declare methods implemented in non-Java languages like: C, C++
It is mainly used with JNI (Java Native Interface).
Example
native void display();
Uses: System-level programming, Hardware access, OS-specific features

31) What is the difference between const and final in Java?
Ans-
| const                    | final                                         |
| ------------------------ | --------------------------------------------- |
| Reserved keyword         | Actual keyword used in Java                   |
| Not used in Java         | Used to create constants                      |
| Cannot declare constants | Used for variable, method, class restrictions |

32) Is goto keyword supported in Java?
Ans- No, goto is reserved but not used in Java.
Java does not support goto because:
It makes code complex
Reduces readability

However, goto remains reserved to avoid future conflicts.

33) Describe real-time uses of transient and volatile?
Ans- transient:- Used when some data should not be saved during serialization.
Examples:
Password fields
OTP values
Session IDs
Temporary cache data

volatile:- Used in multithreaded applications where multiple threads access shared variables.
Used in:
Banking systems
Online ticket booking
Multiplayer gaming
Real-time monitoring systems

