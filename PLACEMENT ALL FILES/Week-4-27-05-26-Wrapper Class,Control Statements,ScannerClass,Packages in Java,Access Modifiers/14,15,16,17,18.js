
                                                                        14. JAVA WRAPPER CLASSES, AUTOBOXING & UNBOXING
                                                                     ------------------------------------------------------
Mock-04
=======
Interview Questions 
-----------------------

1) What is a wrapper class in Java, and why do we need it?
Ans: Wrapper class converts primitive data type into object form.

Example:
int a = 10;
Integer obj = Integer.valueOf(a);
We need wrapper classes because collections like ArrayList, HashMap store objects, not primitives.

2) List all wrapper classes in Java for each primitive type.
Ans:
| Primitive | Wrapper Class |
| --------- | ------------- |
| byte      | Byte          |
| short     | Short         |
| int       | Integer       |
| long      | Long          |
| float     | Float         |
| double    | Double        |
| char      | Character     |
| boolean   | Boolean       |

3) How is a wrapper class different from a primitive type? Give examples.
Ans- 
| Primitive Type      | Wrapper Class         |
| ------------------- | --------------------- |
| Stores simple value | Stores object         |
| Cannot store null   | Can store null        |
| Faster              | Slower than primitive |
| Example: `int`      | Example: `Integer`    |

4) Can a wrapper object store null? Give an example.
Ans- Yes.
Integer x = null;

Primitive cannot store null:

int y = null; // error

5) What is autoboxing / unboxing in Java? Diff b/w autoboxing and unboxing?
Ans- 
| Autoboxing           | Unboxing             |
| -------------------- | -------------------- |
| Primitive to wrapper | Wrapper to primitive |
| Automatic by compiler| Automatic by compiler|

6) Can we perform arithmetic operations directly on wrapper objects? How does it work?
Ans- Yes. Java automatically unboxes wrapper objects into primitive values. Because of arithmetic operations can only be done with primitive value.
Integer a = 10;
Integer b = 20;

int c = a + b;
System.out.println(c); // 30

7) What is the difference between == and .equals() when comparing wrapper objects?
Ans- 
| `==`                           | `.equals()`                |
| ------------------------------ | -------------------------- |
| Compares reference/address     | Compares value             |
| May give false for same values | Gives true for same values |
Integer a = 200;
Integer b = 200;

System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true

8) How does the caching mechanism work for Integer and Boolean?
Ans- Java caches Integer values from -128 to 127.
Integer a = 100;
Integer b = 100;
System.out.println(a == b); // true
Integer x = 200;
Integer y = 200;
System.out.println(x == y); // false

For Boolean, only two objects are cached:

Boolean b1 = true;
Boolean b2 = true;
System.out.println(b1 == b2); // true

9) What happens if you try to unbox a null wrapper object?
Ans- It throws NullPointerException.
Integer x = null;
int y = x; // NullPointerException

10) How does autoboxing affect performance in Java programs?
Ans- Autoboxing creates wrapper objects, so it can be slower and use more memory than primitives.

Example: prefer int for heavy calculations.

11) Can we declare wrapper objects as final? What happens if we try to change their value?
Ans- 
Yes. But final means reference cannot be changed.
final Integer x = 10;
// x = 20; // error

Wrapper objects are immutable, so value cannot be changed inside same object.
12) Can autoboxing occur when passing arguments to a method? Give an example.
Ans- Yes.
static void show(Integer x) {
    System.out.println(x);
}

show(10); // int autoboxed to Integer

13) What is the difference between Integer.parseInt() and Integer.valueOf()?
Ans- 
| `parseInt()`             | `valueOf()`              |
| ------------------------ | ------------------------ |
| Returns primitive `int`  | Returns `Integer` object |
| No caching object needed | May use cached object    |

int a = Integer.parseInt("100");
Integer b = Integer.valueOf("100");

14) What is the behavior of null in wrapper comparisons?
Ans- When dealing with null references in Java wrapper classes (like Integer, Double, Boolean, etc.), comparisons behave differently depending on whether you use the == operator, the .equals() method, or compare them against primitive values.
Integer a = null;
Integer b = null;
System.out.println(a == b); // true

But:
System.out.println(a.equals(b)); // NullPointerException

And:
System.out.println(a == 10); // NullPointerException

15) Can wrapper objects be synchronized for thread safety?
Ans- Technically yes, but it is not recommended because wrapper objects are immutable and cached.
Integer lock = 10;

synchronized(lock) {
    System.out.println("Locked");
}

Better use separate lock object:

Object lock = new Object();

16) Are wrapper objects immutable? How does Java handle immutability for wrappers?
Ans- Yes. Wrapper objects are immutable. Once created, their value cannot be changed.
Integer x = 10;
x = 20;

Here new Integer object/reference is assigned. Original value 10 is not changed.

				

					                                                        15. CONTROL STATEMENTS
					                                                    ================================
				                                               1. Selection Statements (if, if-else, if-else-if, switch)
			                                                    -----------------------------------------------------------------

Interview Questions
--------------------

1. What are selection statements in Java?
Ans- Selection statements are used to choose which block of code should execute based on a condition.

Types:

if
if-else
if-else-if
switch

2. Difference between if and if-else.
Ans- 
| `if`                                     | `if-else`                                    |
| ---------------------------------------- | -------------------------------------------- |
| Executes block only if condition is true | Executes one block if true, another if false |

3. Can we use multiple if statements without else?
Ans- Yes. Hear Each if condition is checked independently.

4. What is an if-else-if ladder, and how does it work?
Ans- It is used to check multiple conditions one by one. Once one condition becomes true, remaining conditions are skipped.

5. When should you use switch instead of if-else?
Ans- Use switch when you compare one variable with many fixed values.

6. What happens if you forget to use a break in a switch case?
Ans- In old switch, fall-through happens. It continues executing next cases.

7. Can we use logical operators (&&, ||) in a switch expression?
Ans- No, not like if conditions. switch matches values, not boolean conditions. Its possible inside "if".

8. Difference between switch expression (Java 12+) and old switch statement.
Ans- 
| Old switch statement          | Switch expression |
| ----------------------------- | ----------------- |
| Uses `case:`                  | Uses `case ->`    |
| Needs `break`                 | No fall-through   |
| Usually does not return value | Can return value  |

9. Can we have duplicate case values in a switch?
Ans- No. Duplicate case values give compile-time error.
switch (n) {
    case 1: System.out.println("One"); break;
    // case 1: System.out.println("Again"); // error

10. What happens if no case matches and no default is present?
Ans- Nothing will execute inside the switch. Program continues after switch.

11. Can we use a switch with wrapper classes like Integer?
Ans- Yes. We can use wrapper classes like Integer, Byte, Short, and Character.

12. Can a switch statement work on enum types?
Ans- Yes. switch works with enum types.
enum Day { MONDAY, TUESDAY }

Day d = Day.MONDAY;

switch (d) {
    case MONDAY:
        System.out.println("Monday");
        break;
    case TUESDAY:
        System.out.println("Tuesday");
        break;
}

13. What is the fall-through behavior in a switch?
Ans- Fall-through means if break is missing, next cases also execute.
int n = 1;

switch (n) {
    case 1: System.out.println("One");
    case 2: System.out.println("Two");
}

                                                        2. Logical programs on (if, if-else, if-else-if                 
                                                     ------------------------------------------------------
Interview Questions
----------------------

## Programs

### 1) Greatest of two numbers

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greatest");
        } else {
            System.out.println(b + " is greatest");
        }
    }
}
```

---
### 2) Greatest of three numbers using if-else-if

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is greatest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is greatest");
        } else {
            System.out.println(c + " is greatest");
        }
    }
}
```

---

### 3) Positive, negative, or zero

```java id="crv4w2"
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
```

---

### 4) Leap year

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
```

---

### 5) Vowel or consonant using switch

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
        }
    }
}
```

---

### 6) Even or odd

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```

---

### 7) Grade of student

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("A Grade");
        } else if (marks >= 75) {
            System.out.println("B Grade");
        } else if (marks >= 60) {
            System.out.println("C Grade");
        } else if (marks >= 35) {
            System.out.println("D Grade");
        } else {
            System.out.println("Fail");
        }
    }
}
```

---

### 8) Largest of three numbers using nested if

```java id="qod3cn"
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is largest");
            } else {
                System.out.println(c + " is largest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is largest");
            } else {
                System.out.println(c + " is largest");
            }
        }
    }
}
```

---

### 9) Divisible by both 3 and 5

```java id="s9yj6h"
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }
    }
}
```

---

### 10) Calculator using switch

```java id="wxv4bg"
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Addition = " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction = " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication = " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Division = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}



                                                                           3. Understanding switch case
                                                                        -----------------------------------
Interview Questions
--------------------
1) What is a switch statement in Java?
Ans-A switch statement is a selection statement used to execute one block from multiple choices based on a value.

2) What is the syntax of a switch statement?
Ans-
switch (expression) {
    case value1:
        // statements
        break;

    case value2:
        // statements
        break;

    default:
        // statements
}

3) What is the purpose of the break keyword in a switch?
Ans-break stops the switch execution and comes out of the switch block.

4) What happens if break is omitted in a switch-case?
Ans-Fall-through happens. Next cases also execute until a break or end of switch is found.

5) Can we use multiple statements inside a case block?
Ans-Yes.

6) What is the purpose of the default case? Is the default case mandatory in a switch?
Ans-default executes when no case matches. It is not mandatory, but recommended.

7) Can default be written anywhere in the switch block?
Ans-Yes. default can be written anywhere, but usually it is written at the end.

8) How does Java decide which case to execute?
Ans-Java compares the switch expression value with each case value. The matching case executes.

9) Can two case labels have the same constant value?
Ans-No. Duplicate case values are not allowed. It gives compile-time error.
case 1:
case 1: // error

10) Which primitive data types are supported in switch?
Ans-Supported primitive types:
byte
short
char
int

Not supported:

long
float
double
boolean

11) How is a switch expression different from a switch statement?
Ans-
| Switch Statement                    | Switch Expression      |
| ----------------------------------- | ---------------------- |
| Executes statements                 | Returns a value        |
| Uses `case:`                        | Usually uses `case ->` |
| Needs `break` to avoid fall-through | No fall-through        |
| Older style                         | Java 12+ feature       |



                                                                4. Iteration Statements (while, do-while, for, for-each)
                                                            ------------------------------------------------------------------
Interview Questions
---------------------
1) What are iteration statements in Java?
Ans-Iteration statements are used to execute a block of code repeatedly until a condition becomes false.

Types

for
while
do-while
for-each

2) Difference between for, while, and do-while loops.
Ans-
| Loop       | Use                                  | Condition Check  |
| ---------- | ------------------------------------ | ---------------- |
| `for`      | When number of iterations is known   | Before loop body |
| `while`    | When number of iterations is unknown | Before loop body |
| `do-while` | When loop must run at least once     | After loop body  |

3) Which loop is entry-controlled and which is exit-controlled?
Ans-
| Loop       | Type             |
| ---------- | ---------------- |
| `for`      | Entry-controlled |
| `while`    | Entry-controlled |
| `do-while` | Exit-controlled  |

4) Explain the syntax of a for, while ,do-while ,for -each loop in Java.
Ans-
for loop:

for (initialization; condition; increment/decrement) {
    // code
}

while loop:

while (condition) {
    // code
}

do-while loop:

do {
    // code
} while (condition);

for-each loop:

for (dataType variable : arrayOrCollection) {
    // code
}

5) Can we have an infinite loop? How to create it by using for, while Give an example.
Ans- Yes.

Using for:

for (;;) {
    System.out.println("Infinite loop");
}

Using while:

while (true) {
    System.out.println("Infinite loop");
}

6) What is the difference between for and for-each loop?
Ans-
| for loop                     | for-each loop                 |
| ---------------------------- | ----------------------------- |
| Uses index                   | Does not use index            |
| Can modify array using index | Mainly used for reading       |
| Works with conditions        | Works with arrays/collections |

7) When is a for loop preferred over a while loop?
Ans-Use for loop when the number of iterations is known.

Example:

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

8) When is a do-while loop used?
Ans-Use do-while when code must execute at least once, even if condition is false.
int i = 10;

do {
    System.out.println(i);
} while (i < 5);

9) How do break and continue work in loops?
Ans-
break:- stops the loop completely.
continue:- skips current iteration and goes to next iteration.

10) What is the difference between break and return inside a loop?
Ans-
| break                        | return                      |
| ---------------------------- | --------------------------- |
| Exits only loop/switch       | Exits the method            |
| Control continues after loop | Control goes back to caller |

11) What happens if we put a continue statement in the last line of a loop?
Ans-It has no special effect because the loop would go to next iteration anyway.

12) Can loops be replaced with recursion? When is that useful?
Ans-Yes. Recursion can replace loops when a method calls itself.

Useful for:

Factorial
Fibonacci
Tree traversal
Backtracking problems

13) When should we use a for loop, a while loop, or a for-each loop in Java?
Ans-
| Loop       | When to use                       |
| ---------- | --------------------------------- |
| `for`      | When count is known               |
| `while`    | When count is unknown             |
| `do-while` | When code must run at least once  |
| `for-each` | To read arrays/collections easily |


                                                             5. Jumping Statements (break, continue, return)
                                                           ------------------------------------------------------
Interview Questions
--------------------
1) What are jump statements in Java?
Ans-Jump statements are used to transfer control from one place to another.

Main jump statements:

break
continue
return

2) What is the purpose of the break statement?
Ans-break is used to stop a loop or switch immediately.

3) What is the purpose of the continue statement?
Ans-continue skips the current iteration and moves to the next iteration.

4) What is the purpose of the return statement?
Ans-return is used to exit from a method. It can also return a value.

5) Can we use break without a loop or switch?
Ans-No. break can be used only inside loop or switch.
// break; // compile-time error

6) Can we use continue in a switch statement? Why or why not?
Ans-No, continue is used for loops, not for switch.

But if switch is inside a loop, continue can continue the outer loop.

for (int i = 1; i <= 3; i++) {
    switch (i) {
        case 2:
            continue; // continues for loop
    }
    System.out.println(i);
}

7) What is the difference between break and continue / return?
Ans-
| Statement  | Meaning                 |
| ---------- | ----------------------- |
| `break`    | Stops loop/switch       |
| `continue` | Skips current iteration |
| `return`   | Exits method            |

8) Can break terminate a method in Java?
Ans-No. break terminates only loop or switch. To terminate a method, use return.

9) What will happen if you write multiple break statements in nested loops?
Ans-A normal break stops only the nearest loop.
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            break;
        }
        System.out.println(i + " " + j);
    }
}

Here, break stops only inner loop.


Programming Questions
1) Write a program to check Armstrong number (e.g., 153 → 1³+5³+3³=153).
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is Armstrong Number");
        } else {
            System.out.println(num + " is Not Armstrong Number");
        }
    }
}
2) How do you check if a number is a Strong Number using loops in Java?
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is Strong Number");
        } else {
            System.out.println(num + " is Not Strong Number");
        }
    }
}
3) How do you check if a number is a Perfect Number using loops in Java?
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is Perfect Number");
        } else {
            System.out.println(num + " is Not Perfect Number");
        }
    }
}
4) Write a program to find the factorial of a given number using a loop.?
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}
5) Write a program to reverse a number.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reverse = " + rev);
    }
}
6) Write a program to check if a number is palindrome or not.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (rev == num)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }
}
7) Write a program to check if a number is prime or not.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
8) Find the Nth prime number using nested loops.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        while (true) {
            boolean prime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                count++;
                if (count == n) {
                    System.out.println(n + "th prime number is " + num);
                    break;
                }
            }

            num++;
        }
    }
}
9) Write a program to print Fibonacci series up to N terms.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
10) Write a program to find LCM and GCD of two numbers using loops.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int smallest = 9;
        int largest = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit < smallest)
                smallest = digit;

            if (digit > largest)
                largest = digit;

            num = num / 10;
        }

        System.out.println("Smallest digit = " + smallest);
        System.out.println("Largest digit = " + largest);
    }
}
11) Write a program to find smallest and largest digit in a given number.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int smallest = 9;
        int largest = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit < smallest)
                smallest = digit;

            if (digit > largest)
                largest = digit;

            num = num / 10;
        }

        System.out.println("Smallest digit = " + smallest);
        System.out.println("Largest digit = " + largest);
    }
}
12) Check if the digits of a number are in increasing order?( 1234 ✅, 1324 ❌)
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean increasing = true;
        int prev = 10;

        while (num > 0) {
            int digit = num % 10;

            if (digit >= prev) {
                increasing = false;
                break;
            }

            prev = digit;
            num = num / 10;
        }

        if (increasing)
            System.out.println("Digits are in increasing order");
        else
            System.out.println("Digits are not in increasing order");
    }
}
13) Find the frequency of each digit in a number using loops?
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i <= 9; i++) {
            int temp = num;
            int count = 0;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit == i) {
                    count++;
                }

                temp = temp / 10;
            }

            if (count > 0) {
                System.out.println(i + " = " + count);
            }
        }
    }
}
14) Remove all zeros from a number (e.g., 10204 → 124)?
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;

            if (digit != 0) {
                result = digit * place + result;
                place = place * 10;
            }

            num = num / 10;
        }

        System.out.println("After removing zeros = " + result);
    }
}



                                                                6. Pattern Printing (Nested Loop Programs)
                                                              -------------------------------------------------
Interview Questions
----------------------

1) Print inverted right triangle pattern of *.
Ans-
int n = 5;

for (int i = n; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}

2) Print pyramid pattern of *.
Ans-
int n = 5;

for (int i = 1; i <= n; i++) {
    for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
3) Print inverted pyramid of *.
Ans-
int n = 5;

for (int i = n; i >= 1; i--) {
    for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
4) Print half pyramid with numbers.
Ans-
int n = 5;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
5) Print Floyd’s triangle.
Ans-
int n = 5;
int num = 1;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
    }
    System.out.println();
}
6) Print Pascal’s triangle.
Ans-
int n = 5;

for (int i = 0; i < n; i++) {
    int num = 1;

    for (int s = 0; s < n - i; s++) {
        System.out.print(" ");
    }

    for (int j = 0; j <= i; j++) {
        System.out.print(num + " ");
        num = num * (i - j) / (j + 1);
    }

    System.out.println();
}
7) Print diamond pattern of *.
Ans-
int n = 5;

for (int i = 1; i <= n; i++) {
    for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}

for (int i = n - 1; i >= 1; i--) {
    for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
8) Print hollow square pattern using *.
Ans-
int n = 5;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
    System.out.println();
}
9) Print hollow pyramid pattern (outline only)
Ans-
int n = 5;

for (int i = 1; i <= n; i++) {
    for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
    }

    for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i || i == n) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }

    System.out.println();
}
10) Print right-angled triangle pattern of *.
Ans-
int n = 5;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}



                                                                                                 16. SCANNER CLASS
                                                                                             -------------------------
Interview Questions:
----------------------
1. What is the Scanner class in Java and Which package contains the Scanner class?
Ans-Scanner is a class used to take input from user, file, or string. It is present in java.util package.

2. How do you create a Scanner object for keyboard input?
Ans-Scanner sc = new Scanner(System.in);

3. How do you read a string using Scanner?
Ans-Use next().

4. How do you read a complete line using Scanner?
Ans-Use nextLine().

5. Difference between next() and nextLine()?
Ans-
| next()                          | nextLine()                           |
| ------------------------------- | ------------------------------------ |
| Reads one word                  | Reads full line                      |
| Stops at space                  | Reads spaces also                    |
| Example: `Sahid Khan` → `Sahid` | Example: `Sahid Khan` → `Sahid Khan` |

6. How do you read integers, floats, doubles, and booleans?
Ans-
int a = sc.nextInt();
float f = sc.nextFloat();
double d = sc.nextDouble();
boolean b = sc.nextBoolean();

7. How do you read a single character using Scanner?
Ans-Scanner has no direct nextChar() method.
char ch = sc.next().charAt(0);

8. What happens if user enters wrong data type?
Ans-Program throws InputMismatchException.

9. What is InputMismatchException? How to avoid InputMismatchException?
Ans-InputMismatchException occurs when input type does not match expected type.

Avoid using hasNextInt():

10. What is the default delimiter of Scanner? How to change the delimiter in Scanner?
Ans-Default delimiter is whitespace: space, tab, newline.

Change delimiter using useDelimiter():

Scanner sc = new Scanner("10,20,30");
sc.useDelimiter(",");

while (sc.hasNext()) {
    System.out.println(sc.next());
}

11. Why should Scanner be closed?
Ans-Scanner should be closed to release system resources.
sc.close();
But if using System.in, usually close it at the end of program only.

12. Can you reuse Scanner for another input source?
Ans-No, one Scanner is connected to one input source. For another source, create another Scanner object.
Scanner sc1 = new Scanner(System.in);
Scanner sc2 = new Scanner("Hello Java");

13. What is the purpose of System.in in Scanner?
Ans-System.in represents keyboard input stream. Means Scanner reads input from keyboard. 
Scanner sc = new Scanner(System.in);


*** What is BufferedReader?
Ans: BufferedReader is a Java class used to read text input efficiently.

It is present in: java.io

So we import:

import java.io.BufferedReader;
import java.io.InputStreamReader;

Example: Reading from keyboard
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter name: ");
        String name = br.readLine();

        System.out.println("Name: " + name);
    }
}

14. Difference between Scanner and BufferedReader?
Ans-
| Scanner                      | BufferedReader                  |
| ---------------------------- | ------------------------------- |
| Easy to use                  | Faster                          |
| Has methods like `nextInt()` | Reads string using `readLine()` |
| Slower                       | Better for large input          |
| Can parse data directly      | Need manual conversion          |

15. Why does Scanner skip input after reading numbers?
Ans-Because nextInt() does not consume the newline \n. Then nextLine() reads that leftover newline.

16. What happens if you try to read from a closed Scanner?
Ans-It throws IllegalStateException.
sc.close();
sc.nextInt(); // error

17. Can Scanner read binary data?
Ans-Scanner is mainly for text input, not binary data. For binary data, use streams like FileInputStream.


Programming Questions
1. Sum of N numbers – Read N integers and print their sum.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum = " + sum);
    }
}
2. Maximum and Minimum number – Read 5 integers and print the max and min.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
3. Average of floating-point numbers – Read N doubles in one line and calculate the average.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double num = sc.nextDouble();
            sum = sum + num;
        }

        double avg = sum / n;

        System.out.println("Average = " + avg);
    }
}
4. Reverse a string – Read a line of text and print it reversed.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);
    }
}
5. Count words in a sentence – Read a line and count the number of words.
Ans-
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        sentence = sentence.trim();

        if (sentence.length() == 0) {
            System.out.println("Words = 0");
        } else {
            String[] words = sentence.split("\\s+");
            System.out.println("Words = " + words.length);
        }
    }
}
------------------------------------------------------------------------------



                                                                        17. PACKAGES IN JAVA
                                                                     ---------------------------
Interview Questions
----------------------
1) What is a package in Java, and why do we need it?
Ans-A package is a group of related classes, interfaces, and sub-packages.
We need packages to organize code and avoid name conflicts.

Example:
package com.nit.service;

2) Explain the benefits of using packages in Java.
Ans-
Organizes classes properly
Avoids duplicate class name conflict
Improves code readability
Provides access control
Helps in code reusability
Useful for large projects

3) How do packages help in organizing large projects?
Ans-In large projects, packages divide code based on modules.

Example:
com.nit.controller
com.nit.service
com.nit.repository
com.nit.entity
This makes the project clean and easy to maintain.

4) Can a class exist without a package? Explain.
Ans-Yes. If we do not write any package statement, the class belongs to the default package.
public class Main {
}
But in real projects, default package is not recommended.

5) Difference between package and import statements.
Ans-
| package                            | import                                      |
| ---------------------------------- | ------------------------------------------- |
| Defines where the class belongs    | Used to access classes from another package |
| Written at top of file             | Written after package statement             |
| Only one package statement allowed | Multiple import statements allowed          |

6) What is the difference between default package and user-defined packages?
Ans-
| Default Package                | User-defined Package         |
| ------------------------------ | ---------------------------- |
| No package statement           | Created by programmer        |
| Not good for large projects    | Good for organized projects  |
| Classes are in unnamed package | Classes are in named package |

7) How do packages improve code reusability and accessibility?
Ans-
Packages allow us to reuse classes in different programs by importing them.

Example:

import com.nit.service.EmployeeService;

8) Explain real-time use cases where packages are essential.?
Ans-Packages are essential in real-time projects like Spring Boot.

Example:

controller  → handles user requests
service     → contains business logic
repository  → handles database operations
entity      → represents database table


                                                                           Structure of a Package
                                                                       --------------------------------
Interview Questions
--------------------
1) What is the structure of a Java package?
Ans-Package structure follows folder/directory structure.

Example package:

package com.nit.service;

Folder structure:

com
 └── nit
     └── service
         └── EmployeeService.java

Compiled class:

com/nit/service/EmployeeService.class

2) Explain the difference between top-level and sub-packages.
Ans-
| Top-level package | Sub-package                    |
| ----------------- | ------------------------------ |
| Main package name | Package inside another package |
| Example: `com`    | Example: `com.nit`             |
| Parent package    | Child package                  |

3) What are naming conventions for packages?
Ans-
Package names should be in lowercase.
Use reverse domain name style.
Avoid capital letters.
Use meaningful module names.

4) How does the JVM locate classes inside a package?
Ans-JVM uses the package name as a folder path and searches in the classpath.

Example: classpath/com/nit/service/ClassName.class

5) Explain the difference between .class files in default and user-defined packages.
Ans-
| Default package                                     | User-defined package                           |
| --------------------------------------------------- | ---------------------------------------------- |
| `.class` file is created directly in current folder | `.class` file is created inside package folder |
| No package statement                                | Has package statement                          |
| Not recommended for real projects                   | Recommended for real projects                  |


                                                                                                  Built-in Packages
                                                                                                ----------------------
Interview Questions
--------------------
1) What are built-in packages in Java? Give examples.
Ans: Built-in packages are predefined packages provided by Java.

Examples:

java.lang
java.util
java.io
java.sql
java.net

2) Explain the difference between java.lang and java.util packages.
Ans-
| java.lang                           | java.util                                  |
| ----------------------------------- | ------------------------------------------ |
| Contains basic/core classes         | Contains utility classes                   |
| Automatically imported              | Need to import manually                    |
| Example: `String`, `System`, `Math` | Example: `Scanner`, `ArrayList`, `HashMap` |

3) Which built-in package is automatically imported in every Java program?
Ans-java.lang package is automatically imported.

Example classes:

String
System
Math
Object
Thread

4) Can you use a class from a built-in package without import? Explain.
Ans-Yes, if the class belongs to java.lang.

Example:

String name = "Java";
System.out.println(name);

But for Scanner, import is needed:

                                                                              Package Naming Rules
                                                                            ------------------------
Interview Questions
----------------------
1) What are the naming rules for Java packages?
Ans-Package names follow identifier rules.

Rules:

Use lowercase letters.
Can contain letters, digits, and underscore _.
Cannot start with a digit.
Cannot use Java keywords.
Use dot . to separate package levels.

2) Can a package name start with a number or special character?
Ans-No. Package name cannot start with a number or special character.

Invalid:

package 1com.nit;   // error
package @com.nit;   // error

3) Why is lowercase recommended for package names?
Ans-Lowercase is recommended to avoid confusion with class names, because class names usually start with capital letters.

4) Explain the use of reverse domain name convention in package naming.
Ans-Reverse domain name convention means writing domain name in reverse order to make package names unique.

5) Can two packages have the same name in Java? What happens?
Ans-Yes, technically two projects can have same package name. But inside one project/classpath, same package name means classes are treated as part of the same package.

6) What are the restrictions on special characters in package names?
Ans-Special characters like @, #, $, %, -, space are not allowed.


                                                                     How to Access Package from Another Package
                                                                   -----------------------------------------------
Interview Questions
---------------------
1) How do you access a class from one package in another package?
Ans-Use import statement and make the class public.

2) Difference between using import package.* and import package.ClassName.
Ans-
| `import package.*`                    | `import package.ClassName`           |
| ------------------------------------- | ------------------------------------ |
| Imports all classes from that package | Imports only one specific class      |
| Example: `import java.util.*;`        | Example: `import java.util.Scanner;` |
| Less specific                         | More specific and recommended        |

3) Can private classes be accessed from another package?
Ans-Top-level classes cannot be private.

Only inner classes can be private.

A class with default access cannot be accessed from another package.



                                                                           18. ACCESS MODIFIERS
                                                                       1. Class level access modifier
                                                                    -------------------------------------
Interview Questions
--------------------
1. What are access modifiers in Java, what are their types, and what is their purpose?
Ans-Access modifiers control the visibility/accessibility of classes, constructors, methods, and variables.
Purpose: security, encapsulation, data hiding, and controlled access.
Types:

public
protected
default / package-private
private

2. Which access modifiers are allowed for top-level classes, and why can't a top-level class be protected or
private?
Ans-Top-level classes can use only:
public
default

They cannot be private or protected because top-level classes are not inside another class, so private/protected access does not make sense.

3. What does the public modifier mean for a class or interface, and how does it affect accessibility across
packages?
Ans-public means the class/interface can be accessed from anywhere, including different packages.

4. What does it mean for a class to have default (package-private) access, and can such a class be accessed
from another package?
Ans-If no modifier is written, it is default access.
class A {
}

This class can be accessed only inside the same package. It cannot be accessed from another package.

5. How do access modifiers apply to constructors, and what impact do they have on object creation and inheritance?
Ans-Constructors can be:
public
protected
default
private

They control object creation.

6. How do access modifiers support encapsulation and data hiding in Java?
Ans- We make variables private and provide public getter/setter methods.

7. How do access modifiers differ between class level and member level?
Ans-
| Level           | Allowed modifiers                         |
| --------------- | ----------------------------------------- |
| Top-level class | `public`, default                         |
| Members         | `public`, `protected`, default, `private` |

8. Can we declare a private constructor inside an abstract class? Or can a class be both abstract and final at the same time?
Ans-Yes, an abstract class can have a private constructor, but it is not useful for inheritance because subclass constructor cannot call private super constructor.
abstract class A {
    private A() {
    }
}

But this cannot be extended properly.

A class cannot be both abstract and final.

Reason:

abstract means class must be extended.
final means class cannot be extended.

So both together are opposite.


                                                                                      2. Method level access modifier
                                                                                 --------------------------------------------
Interview Questions
--------------------
1. What is the default access modifier for a method, and how does it differ from public, private, and protected access?
Ans-If no modifier is written, it is default/package-private.
| Modifier    | Access                  |
| ----------- | ----------------------- |
| `public`    | Anywhere                |
| `protected` | Same package + subclass |
| default     | Same package only       |
| `private`   | Same class only         |

2. Can a constructor or a method be declared private or protected? In what scenarios is this useful?
Ans-Yes.
private A() { }      // restrict object creation
protected void show() { } // accessible in subclass

Useful for singleton class, factory methods, inheritance control.

3. Why do we use private methods inside a class, and can a private method be accessed or overridden in subclasses?
Ans-Private methods are used for internal helper logic.
private void calculateSalary() {
}

They cannot be accessed outside the class and cannot be overridden in subclass.

4. Can a protected method be accessed or overridden in another package? How does inheritance affect this?
Ans-Yes, but mainly through inheritance.
package p1;
public class A {
    protected void show() {}
}
package p2;
class B extends A {
    void test() {
        show(); // allowed
    }
}

Protected method can be overridden in subclass.

5. Can you reduce or increase the visibility of an overridden method (e.g., public → protected)? What happens if you try to?
Ans-We can increase visibility, but cannot reduce it.

Allowed:

protected void show() {}

Override as:

public void show() {}

6. Can a default/package-private, final, or static method be overridden or hidden in another package? Explain the difference.
Ans-
| Method type             | Result                                               |
| ----------------------- | ---------------------------------------------------- |
| default/package-private | Not accessible in another package, so not overridden |
| final                   | Cannot be overridden                                 |
| static                  | Cannot be overridden, only hidden                    |

7. Do access modifiers affect method overloading? Can you overload methods with different access levels?
Ans-No. Overloading depends on method name and parameters, not access modifier.
public void add(int a) {}
private void add(int a, int b) {}

This is valid overloading.

8. Can a private static method be overloaded in the same class? How is it different from overriding?
Ans- Yes, in the same class.
private static void show() {}
private static void show(int a) 

Reason:
private methods are not inherited, and static methods belong to class, not object. So private static methods cannot be overridden.

| Overloading                             | Overriding                                 |
| --------------------------------------- | ------------------------------------------ |
| Same class or subclass                  | Parent-child class                         |
| Same method name, different parameters  | Same method name and same parameters       |
| Private static method can be overloaded | Private static method cannot be overridden |
| Compile-time polymorphism               | Runtime polymorphism                       |

9. Can an abstract class have a private abstract method? Why or why not? Can you declare a private synchronized method?
Ans- No, private abstract method is not allowed.

Reason:

abstract method must be overridden.
private method cannot be inherited/overridden.

But private synchronized method is allowed:

private synchronized void show() {
}

10. Can an interface’s default method be private or protected?
Ans-Interface default method cannot be private or protected.

Valid:

interface A {
    default void show() {}
}

Private methods are allowed inside interface from Java 9, but they are helper methods, not default methods.

interface A {
    private void helper() {}
}



                                                                            3.Variable level access modifiers
                                                                          -------------------------------------
Interview Questions
---------------------


1. What are the types of variables in Java (local, instance, static)? What access modifiers can be applied to each, and what is the default access modifier for instance variables?
Ans- Java has 3 main types of variables:
Local variable
Instance variable
Static variable
| Variable          | Access modifiers allowed?                 |
| ----------------- | ----------------------------------------- |
| Local variable    | No access modifier                        |
| Instance variable | `public`, `protected`, default, `private` |
| Static variable   | `public`, `protected`, default, `private` |

2. What’s the difference between local, instance, and static variables in terms of scope, lifetime, and storage? Can local variables have access modifiers? Why or why not?
Ans-
| Variable | Scope               | Lifetime                | Storage                  |
| -------- | ------------------- | ----------------------- | ------------------------ |
| Local    | Inside method/block | Until method/block ends | Stack                    |
| Instance | Inside object       | Until object destroyed  | Heap                     |
| Static   | Whole class         | Until class unloaded    | Method Area / Class Area |

3. What is a final variable? Can it be static or transient? What happens if you try to reassign it?
Ans-A final variable value cannot be changed after initialization.

If we try to reassign, compile-time error occurs.
Yes. A final variable can be static: static final int MAX = 100;
Meaning: one constant value for the whole class.
A final variable can also be transient: transient final int id = 10;
Meaning: during serialization, this variable is not saved.

| Static variable                  | Instance variable        |
| -------------------------------- | ------------------------ |
| One copy per class               | Separate copy per object |
| Access using class name          | Access using object      |
| Stored in Method Area/Class Area | Stored in Heap           |

4. What is a static variable? How does it differ from an instance variable? Can it be accessed using an object reference, and when/where is it initialized and stored?
Ans-Static variable belongs to class, not object.
It can be accessed using object reference, but recommended way is class name.

5. Can a constructor modify a static variable? Can we use the this keyword with static variables? What happens if multiple objects change a static variable?
Ans-Yes, constructor can modify static variable.
class A {
    static int count = 0;

    A() {
        count++;
    }
}

We can write this.count, but it is not recommended because static belongs to class.
If multiple objects change static variable, the same single copy is updated.

6. What is a blank final variable and a static blank final variable? Where should each be initialized?
Ans-Blank final variable means final variable without value.
final int x;

It must be initialized in constructor.

A() {
    x = 10;
}

Static blank final variable:
static final int y;

It must be initialized in static block.

static {
    y = 20;
}

7. What is a transient variable? What happens to transient variables during serialization?
Ans-transient variable is not saved during serialization.
transient int password;

During deserialization, it gets default value.

8. What is a volatile variable? When should it be used, how does it differ from?
Ans-volatile is used in multithreading.

It tells JVM that variable value should always be read from main memory, not thread cache.

volatile boolean running = true;

Use it when one thread changes a variable and another thread reads it.

Difference:
| volatile                                   | normal variable                |
| ------------------------------------------ | ------------------------------ |
| Always reads latest value from main memory | May read cached value          |
| Useful in multithreading                   | Not safe for thread visibility |



Programming Questions:
1. Write code to prove that a default class cannot be accessed outside its package.
2. Demonstrate that a private constructor restricts object creation outside its class.
3. Write code to show that final methods cannot be overridden.
4. Create a program to show visibility changes in method overriding (protected → public).
5. Demonstrate method hiding using a static method.
6. Create a Singleton class and test multiple instance creation.
7. Show that abstract + final combination on a class is invalid.
8. Write code to access protected members across packages using inheritance.
9. Show that default methods cannot be accessed outside package even with import.
10. Prove that private static methods are not accessible through object references
------------------------------------------------------------------------
