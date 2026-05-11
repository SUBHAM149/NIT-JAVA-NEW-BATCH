                                                          6. Java main()
                                                         -----------------
Interview Questions
-------------------

1. What is the signature of the main() method in Java?
Ans- The standard signature of the main() method is:
public static void main(String[] args)
or
public static void main(String... args)

2. Why is main() declared as public static void ?
Ans-public: JVM must access the method from outside the class.
static: JVM calls main() without creating an object.
void: main() does not return any value to JVM.

3. Can we overload the main() method? If yes, how does Java determine which main() to call?
Ans-Yes, main() can be overloaded.
class Test {

    public static void main(String[] args) {
        System.out.println("Original main");
        main(10);
    }

    public static void main(int a) {
        System.out.println("Overloaded main");
    }
}
JVM always calls: public static void main(String[] args)
This is the entry point of Java program.
Other overloaded methods are called manually.

4. Can the main() method be private or protected?
Ans-No. The main() method must be public. Otherwise JVM cannot access it.

5. Explain what happens when a Java program does not contain a main() method?
Ans- If a class does not contain a valid main() method:
Program compiles successfully
But JVM cannot execute it
Runtime Error
Error: Main method not found

6. Explain why main() must be static?Can we change the order of keywords like static, public?
Ans- Because JVM calls main() directly without creating an object. Static methods belong to the class, not objects.
Can we change keyword order?
Yes. he order of public and static can be changed.
Both are valid.

7. Can we have multiple main() methods in different classes?
Ans- Yes. Different classes can have their own main() methods.

8. Can main() throw exceptions? If yes, which types?
Ans- Yes. main() can throw exceptions using throws.
main() can throw:
Checked exceptions
Unchecked exceptions

9. Can the main() method return a value?
Ans- No. The main() method must have void return type.

10. What is the role of the String[] args parameter?
Ans- Role of String[] args: It stores command-line arguments passed during program execution.

*What if we change the argument type? (Example: int[]
instead of String[])?
Ans- If argument type is changed, JVM cannot recognize it as the entry point.

11. Can the main() method be called recursively?
Ans-Yes. main() can call itself recursively like normal methods.

12. How jvm internally call main mathod?
Ans- Steps performed by JVM
JVM loads the class into memory.
JVM searches for:
public static void main(String[] args)
If found, JVM invokes it directly.
Since main() is static, object creation is not required.
Internally JVM behaves similar to: ClassName.main(args);

13. Can we write main() inside an abstract class/interface?
Ans- Inside Abstract Class → Yes. Abstract classes can contain main() method.
Inside Interface → Yes. (Java 8+) Interfaces can contain static methods including main().

14. What happens if main() is declared synchronized?
Ans- It is valid.
Meaning: Only one thread can execute main() at a time.
However: Usually unnecessary because JVM starts main thread only once.

15. Can we use varargs ( ... ) in place of array in main method?
Ans- Yes. Varargs is valid because internally it behaves like an array.


Programs
--------

1. Write a program to demonstrate overloading of the main method .?
Ans- class Test {

    public static void main(String[] args) {
        System.out.println("Original main");

        main(10);
        main("Java");
    }

    public static void main(int a) {
        System.out.println("Integer main: " + a);
    }

    public static void main(String name) {
        System.out.println("String main: " + name);
    }
}
O/P: 	Original main
	Integer main: 10
	String main: Java

2. Write a program to call one class's main from another class.
Ans-
class A {

    public static void main(String[] args) {
        System.out.println("Main method of class A");
    }
}
class B {

    public static void main(String[] args) {

        System.out.println("Main method of class B");

        A.main(args);
    }
}
o/p:
Main method of class B
Main method of class A

3. Demonstrate main() calling itself recursively with a base case.
Ans-
class Demo {

    static int n = 1;

    public static void main(String[] args) {

        System.out.println("Count: " + n);

        n++;

        if(n <= 5) {
            main(args);
        }
    }
}
O/p: 	Count: 1
	Count: 2
	Count: 3
	Count: 4
	Count: 5
4. Write a program with multiple classes having main() - execute each.
Ans-
class First {

    public static void main(String[] args) {
        System.out.println("First class main");
    }
}

class Second {

    public static void main(String[] args) {
        System.out.println("Second class main");
    }
}

o/p: 	First class main
	Second class main



                        Command Line Argument
                       -----------------------

Interview Questions
-------------------
1. What are command-line arguments in Java and how are they passed to a program?
Ans- Command-line arguments are values passed to a Java program during execution.
They are stored in: String[] args
parameter of the main() method.


2. What happens if no arguments are passed to main() ?
Ans- If no arguments are passed:
args array becomes empty
Length becomes 0

3. Why String[] is used for command line arguments?
Ans- Command-line arguments are passed as text values from terminal/command prompt. Therefore Java stores them as: Array of Strings

4. How to access a command line argument?
Ans- Arguments are accessed using array indexing.

5. What is the difference between using the Scanner class and command-line arguments for input in Java?
Ans-
| Scanner Class                | Command-Line Arguments       |
| ---------------------------- | ---------------------------- |
| Input taken during execution | Input given before execution |
| Interactive input            | Non-interactive input        |
| Uses keyboard input          | Uses terminal arguments      |
| Flexible                     | Fixed during execution       |


Programs
--------
1. Write a program to find the maximum and minimum number from command-line arguments.
Ans-
class MaxMin {

    public static void main(String[] args) {

        int max, min;

        max = min = Integer.parseInt(args[0]);

        for(int i = 1; i < args.length; i++) {

            int num = Integer.parseInt(args[i]);

            if(num > max)
                max = num;

            if(num < min)
                min = num;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
o/p: Maximum = 80
     Minimum = 2

2. Implement a program that reverses the order of command-line arguments.
Ans-
class ReverseArgs {

    public static void main(String[] args) {

        for(int i = args.length - 1; i >= 0; i--) {

            System.out.println(args[i]);
        }
    }
}
o/p:
D
C
B
A

3. Write a program that counts the number of vowels in all command-line arguments.
Ans-
class VowelCount {

    public static void main(String[] args) {

        int count = 0;

        for(String str : args) {

            str = str.toLowerCase();

            for(int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    count++;
                }
            }
        }

        System.out.println("Total vowels = " + count);
    }
}
o/p: Total vowels = 4

4. Write a program to check if a specific argument exists among the command-line inputs.
Ans-
class SearchArg {

    public static void main(String[] args) {

        String search = "Java";

        boolean found = false;

        for(String str : args) {

            if(str.equals(search)) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Argument found");
        else
            System.out.println("Argument not found");
    }
}
o/p: Argument found

5. Write a program to sort numbers passed as command-line arguments in ascending order.
Ans-
class SortNumbers {

    public static void main(String[] args) {

        int n = args.length;

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Ascending Order:");

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
o/p: Ascending Order:
5 10 30 50

                                                 Varargs in java
                                                ------------------

Interview Questions
-------------------
1. What are varargs in Java?
Ans- Varargs (Variable Arguments) allow a method to accept any number of arguments.

2. How do varargs differ from arrays?
Ans-
| Varargs                             | Arrays                         |
| ----------------------------------- | ------------------------------ |
| Accept variable number of arguments | Fixed size                     |
| Easier syntax                       | Manual array creation required |
| Internally treated as array         | Explicit array                 |


3. Can a method have multiple varargs parameters?
Ans- No. A method can have only one varargs parameter.
Rules of Varargs
Only one varargs allowed
Varargs must be the last parameter

4. Where should varargs be placed in the method parameter list?
Ans:  Varargs parameter must always be the last parameter in the method parameter list.

5. Can varargs accept zero arguments?
Ans: Yes. Varargs can accept:
Zero arguments
One argument
Multiple arguments


6. How does Java internally treat varargs?
Ans: Internally, Java converts varargs into an array.

Programs
---------

1. Write a method using varargs to calculate the sum of numbers.
Ans:
class SumVarargs {

    static int sum(int... numbers) {

        int total = 0;

        for(int n : numbers) {
            total += n;
        }

        return total;
    }

    public static void main(String[] args) {

        System.out.println(sum(10, 20, 30));
        System.out.println(sum(5, 15));
    }
}
o/p: 	60
	20

2. Write a method to find the maximum value using varargs.
Ans:
class MaximumVarargs {

    static int max(int... numbers) {

        int max = numbers[0];

        for(int n : numbers) {

            if(n > max)
                max = n;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Maximum = " + max(10, 80, 25, 90, 50));
    }
}
o/p: Maximum = 90

3. Write a method to concatenate multiple strings using varargs.
Ans:
class ConcatenateStrings {

    static String join(String... words) {

        String result = "";

        for(String s : words) {
            result += s + " ";
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(join("Java", "is", "powerful"));
    }
}
o/p: Java is powerful

4. Write a method to calculate the average of double values using varargs.
Ans:
class AverageVarargs {

    static double average(double... numbers) {

        double sum = 0;

        for(double n : numbers) {
            sum += n;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {

        System.out.println("Average = " + average(10.5, 20.5, 30.0));
    }
}
o/p: Average = 20.333333333333332

5. Write a method to count the number of even numbers from varargs input.
Ans:
class CountEven {

    static int countEven(int... numbers) {

        int count = 0;

        for(int n : numbers) {

            if(n % 2 == 0)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println("Even numbers = " + countEven(10, 15, 20, 33, 40));
    }
}
o/p: Even numbers = 3
