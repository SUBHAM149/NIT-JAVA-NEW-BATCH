4.Difference Between C,C++ And Java
------------------------------------
1.What are the key difference between C And Java?
Ans-C: Procedural language.
Java: Object-oriented & platform independent.

2.What are The key difference between C++ And Java?
Ans-C++: Supports pointers & multiple inheritance.
Java: Uses JVM, no pointers.

3.Is java fully object-oriented? Explain.
Ans-No, because it uses primitive data types like int, char, etc.

4.How does Java handle memory differently from C++?
Ans-Java uses automatic garbage collection; C++ uses manual memory management.

5.Why doesn't Java support pointers?
Ans-For security and simplicity.

6.How is exception handling different in C++ and Java?
Ans-Java has built-in checked exceptions; C++ does not.

7.What is the difference between compiler behavior in C++ and Java?
Ans-C++ compiles to machine code; Java compiles to bytecode.

8.How does Java achieve platform independence while C/C++ do not?
Ans-Java uses JVM and bytecode; C/C++ depend on system architecture.

9.What are destructors in C++? How is it Handled in Java?
Ans-C++ uses destructors; Java uses garbage collection.

10.How is multiple inheritance handled in Java?
Ans-Using interfaces.

11.What is difference between structures in C And classes in Java?
Ans-Structure stores data only; class stores data and methods.

12.Why does Java not support operator overloading?
Ans-To avoid complexity and confusion.

13.Compare access specifiers in C++ and Java?
Ans-Both use public, private, protected; Java also has default access.

14.What is the difference in memory management between C++ and Java?
Ans-C++ uses manual memory management; Java uses automatic garbage collection.

15.Can you directly manage memory in Java Like in C/C++?
Ans-No, Java does not allow direct memory management.


5.Types of Java Applications
----------------------------
1.What are the different types of applications that can be developed using Java?
Ans-Standalone, Web, Enterprise, Mobile, Embedded applications.

2.What is a standalone application? Give examples.
Ans-Runs on a single system. Example: Notepad, Calculator

3.What is web application in Java?
Ans-An application that runs on a web server and browser.

4.What Technologies are used to create web applications in Java?
Ans-Servlets, JSP, JDBC, Spring, Hibernate.

5.What is an Enterprise application?
Ans-A large-scale business application.

6.Give example of enter-level Java technologies.
Ans-EJB, JSP, Servlet, Spring, Hibernate.

7.What us a mobile application in Java?
Ans-An application developed for mobile devices using Java ME/Android.

8.How does Java support cloud or distributed applications?
Ans-Using APIs, RMI, Web Services, and networking support.

9.Which Java edition is used for embedded system?
Ans-Java ME (Micro Edition)


6.JDK(Java Development Kit)
---------------------------
1.What is JDK?
Ans-JDK (Java Development Kit) is used to develop Java programs.

2.What does JDK Contain?
Ans-JDK contains JRE, JVM, compiler, and development tools.

3.What is the difference between JDK,JRE and JVM?
Ans-JDK → Develops programs
JRE → Runs programs
JVM → Executes bytecode

4.Which tools are part of JDK?
Ans-java c, java, Javadoc, jar

5.Can you run a Java Program without JDK?
Ans-Yes, using JRE.

6.What are the common JDK commands and their purposes?
Ans-java c → compile
java → run
Javadoc → create documentation
jar → package files

7.How do you check your JDK VERSION?
Ans-java -version

8.What are the different between Oracle JDK And OpenJDK?
Ans-Oracle JDK is commercial; OpenJDK is open-source.

9.Can multiple JDK version be installed on the same system?
Ans-Yes.

10.How does JDK help in development and compilation?
Ans-Provides tools to write, compile, debug, and run Java programs.

7.JRE(Java Runtime Environment)
-------------------------------
1.What is JRE?
Ans-JRE (Java Runtime Environment) is used to run Java programs.

2.What is include in JRE?
Ans-JVM, libraries, and runtime files.

3.Can you run Java code without JRE?
Ans-No.

4.How is JRE Different from JDK?
Ans-JRE runs programs; JDK develops programs.

5.What happens if your JRE version doesn't match your JDK version?
Ans-Program may not run properly or show errors.

6.What are the components of JRE?
Ans-JVM, class libraries, and supporting files.

7.Does JRE contain compiler tools?
Ans-No

8.How does JRE interact with JVM?
Ans-JRE provides environment; JVM executes bytecode.

9.Can you have JRE without JDK?
Ans-Yes

10.Why is JRE required for end Users?
Ans-To run Java applications.


8.JVM(Java Virtual Machine)
---------------------------

1.What is JVM?
Ans-JVM (Java Virtual Machine) runs Java bytecode.

2.What is the role of JVM in Java execution?
Ans-Executes bytecode and manages memory.

3.Explain the lifecycle of a Java program in terms of JVM.
Ans-Compile → Bytecode → JVM loads → Executes program

4.What are the main components of JVM?
Ans-Class Loader, Memory Area, Execution Engine

5.What is the role of the class Loader in JVM?
Ans-Loads class files into memory.

6.What is the role of the Execution Engine?
Ans-Executes bytecode into machine code.

7.How does the JVM PERFORM memory management?
Ans-Using automatic garbage collection.

8.What are different memory areas in JVM?
Ans-Heap, Stack, Method Area, PC Register, Native Method Stack.

9.What is method area and heap area?
Ans-Method Area → stores class data
Heap Area → stores objects

10.How does JVM Perform garbage collection?
Ans-Removes unused objects automatically.

11.Is JVM platform dependent or independent?
Ans-JVM is platform dependent.

12.How does JVM handled bytecode?
Ans-Interprets or compiles bytecode for execution.

13.What are native methods In JVM?
Ans-Methods written in non-Java languages like C/C++.

14.How does the JVM differ for different operating system?
Ans-Each OS has its own JVM implementation.

15.In which order does the JVM LOAD classes(hierarchy of class loaders)?
Ans-Bootstrap → Extension → Application Class Loader

16.What is the delegation model of class loading?
Ans-Child loader asks parent loader first.

17.What kind of errors are detected during verification?
Ans-Invalid bytecode and security errors.

18.What is the Prepare phase and what happens during it?
Ans-Memory is allocated for static variables.

19.What is the Resolution step in linking?
Ans-Symbolic references are converted into direct references.

20.What is the main purpose of the initialization phase?
Ans-Initializes static variables and blocks.

21.What happens when a Stack Overflow Error occurs?
Ans-Stack memory becomes full due to deep recursion.

22.What happens when an Out Of Memory Error occurs in The Heap?
Ans-Heap memory gets exhausted.

23.What is the Native Method Stack, and why is it separate from JVM Stack?
Ans-Stores native method data separately from Java methods.
 

9.JIT(Just-In-Time Compiler)
----------------------------
1.What is JIT Compiler in Java?
Ans-JIT (Just-In-Time) compiler converts bytecode into native code.

2.Why is JIT compiler used?
Ans-To improve execution speed.

3.When does JIT compile code?
Ans-During runtime.

4.How does JIT improve performance?
Ans-By converting frequently used code into native code.

5.What is the difference between interpreter and JIT?
Ans-Interpreter executes line by line; JIT compiles for faster execution.

6.What ARE the types of JIT Optimizations?
Ans-In lining, Loop Optimization, Dead Code Removal

7.How does JIT work with bytecode and native code?
Ans-JIT converts bytecode into machine/native code.

8.Is JIT part of JVM OR JRE?
Ans-JIT is part of JVM.

9.What happens if JIT is disabled?
Ans-Program runs slower.
