Program 1: Employee using @Value (Field Injection)
-------------------------------------------------------------------------------------------------------------------------------------------
Project Structure
Spring_FieldInjection
│
├── src/main/java
│      └── com.day23
│             Employee.java
│             EmployeePortal.java
Employee.java
package com.day23;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ForAllEmployee")
@Scope("prototype")
public class Employee {

    @Value("Prashant")
    private String employeeName;

    @Value("NIT0005")
    private String employeeId;

    @Value("8")
    private int employeeExp;

    @Value("true")
    private boolean allProjectStatus;

    @Value("50000")
    private long employeeBasicSalary;

    public long getIncrementSalary() {

        if(allProjectStatus) {
            employeeBasicSalary = employeeBasicSalary + 100000;
        }

        return employeeBasicSalary;
    }

    @Override
    public String toString() {
        return "Employee [employeeName=" + employeeName
                + ", employeeId=" + employeeId
                + ", employeeExp=" + employeeExp
                + ", allProjectStatus=" + allProjectStatus
                + ", employeeBasicSalary=" + employeeBasicSalary + "]";
    }

}
EmployeePortal.java
package com.day23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeePortal {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.day23");

        Employee emp =
                context.getBean("ForAllEmployee", Employee.class);

        System.out.println("Increment Salary : " + emp.getIncrementSalary());

        System.out.println(emp);

    }

}
Output
Increment Salary : 150000

Employee [employeeName=Prashant,
employeeId=NIT0005,
employeeExp=8,
allProjectStatus=true,
employeeBasicSalary=150000]

This is Program 1 exactly from your PDF (using Field Injection with @Value). Next, we'll move to Program 2: Setter Injection with @Value.


Program 2: Employee using @Value (Setter Injection)
---------------------------------------------------------------------------------------------------------------------------------------------------------------
Project Structure
Spring_SetterInjection
│
├── src/main/java
│      └── com.day23
│             Employee.java
│             EmployeePortal.java
Employee.java
package com.day23;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ForAllEmployee")
@Scope("prototype")
public class Employee {

    private String employeeName;
    private String employeeId;
    private int employeeExp;
    private boolean allProjectStatus;
    private long employeeBasicSalary;

    @Value("Prashant")
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Value("NIT0005")
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Value("8")
    public void setEmployeeExp(int employeeExp) {
        this.employeeExp = employeeExp;
    }

    @Value("true")
    public void setAllProjectStatus(boolean allProjectStatus) {
        this.allProjectStatus = allProjectStatus;
    }

    @Value("50000")
    public void setEmployeeBasicSalary(long employeeBasicSalary) {
        this.employeeBasicSalary = employeeBasicSalary;
    }

    public long getIncrementSalary() {

        if (allProjectStatus) {
            employeeBasicSalary = employeeBasicSalary + 100000;
        }

        return employeeBasicSalary;
    }

    @Override
    public String toString() {
        return "Employee [employeeName=" + employeeName
                + ", employeeId=" + employeeId
                + ", employeeExp=" + employeeExp
                + ", allProjectStatus=" + allProjectStatus
                + ", employeeBasicSalary=" + employeeBasicSalary + "]";
    }

}
EmployeePortal.java
package com.day23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeePortal {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.day23");

        Employee emp =
                context.getBean("ForAllEmployee", Employee.class);

        System.out.println("Increment Salary : " + emp.getIncrementSalary());

        System.out.println(emp);

    }

}
Output
Increment Salary : 150000

Employee [employeeName=Prashant,
employeeId=NIT0005,
employeeExp=8,
allProjectStatus=true,
employeeBasicSalary=150000]
Difference between Program 1 and Program 2
Program 1	Program 2
@Value is applied directly on fields.	@Value is applied on setter methods.
Field Injection	Setter Injection
Less flexible	More flexible because values are set through setters

Next: Program 3 – Reading values from application.properties using XML (application-context.xml + <util:properties>).


Program 3 – Employee Program using XML + application.properties + <util:properties>
------------------------------------------------------------------------------------------------------------------------------------------------------------
This program reads values from application.properties using XML configuration.

Project Structure
Spring_XML_Properties
│
├── src/main/java
│      └── com.day23.backup
│             Employee.java
│             EmployeePortal.java
│
├── src/main/resources
│      └── com
│           └── day23
│                └── backup
│                     application.properties
│                     application-context.xml
1. application.properties
Employee_name=Prashant
Employee_id=NIT0005
Employee_exp=7
Employee_projectStatus=true
Employee_basicSalary=50000
2. application-context.xml
<?xml version="1.0" encoding="UTF-8"?>

<beans
xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:context="http://www.springframework.org/schema/context"
xmlns:util="http://www.springframework.org/schema/util"

xsi:schemaLocation="
http://www.springframework.org/schema/beans
https://www.springframework.org/schema/beans/spring-beans.xsd

http://www.springframework.org/schema/context
https://www.springframework.org/schema/context/spring-context.xsd

http://www.springframework.org/schema/util
https://www.springframework.org/schema/util/spring-util.xsd">

    <util:properties
        id="myprops"
        location="classpath:com/day23/backup/application.properties"/>

    <context:component-scan
        base-package="com.day23.backup"/>

</beans>
3. Employee.java
package com.day23.backup;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ForAllEmployee")
@Scope("prototype")
public class Employee {

    @Value("#{myprops.Employee_name}")
    private String employeeName;

    @Value("#{myprops.Employee_id}")
    private String employeeId;

    @Value("#{myprops.Employee_exp}")
    private int employeeExp;

    @Value("#{myprops.Employee_projectStatus}")
    private boolean allProjectStatus;

    @Value("#{myprops.Employee_basicSalary}")
    private long employeeBasicSalary;

    public long getIncrementSalary() {

        if(allProjectStatus)
            employeeBasicSalary += 100000;

        return employeeBasicSalary;
    }

    @Override
    public String toString() {

        return "Employee [employeeName=" + employeeName
                + ", employeeId=" + employeeId
                + ", employeeExp=" + employeeExp
                + ", allProjectStatus=" + allProjectStatus
                + ", employeeBasicSalary=" + employeeBasicSalary + "]";
    }

}
4. EmployeePortal.java
package com.day23.backup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeePortal {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "com/day23/backup/application-context.xml");

        Employee emp =
                context.getBean("ForAllEmployee", Employee.class);

        System.out.println("Increment Salary : " + emp.getIncrementSalary());

        System.out.println(emp);

    }

}
Output
Increment Salary : 150000

Employee [employeeName=Prashant,
employeeId=NIT0005,
employeeExp=7,
allProjectStatus=true,
employeeBasicSalary=150000]
Interview Questions
Q1. Why do we use <util:properties>?

Answer: It loads the values from the application.properties file into a Spring bean (myprops).

Q2. Why do we use #{myprops.Employee_name}?

Answer: Because the properties file is loaded as a bean named myprops, and Spring Expression Language (SpEL) is used to access its values.

Q3. Why do we use <context:component-scan>?

Answer: To scan the package and register classes annotated with @Component as Spring beans.

Q4. Which IoC container is used?

Answer: ClassPathXmlApplicationContext, because the configuration is XML-based.

Difference from Program 1 & 2
Program 1: @Value("Hardcoded Value")
Program 2: @Value on setter methods
Program 3: Reads values from application.properties using XML and <util:properties> with #{myprops.propertyName} syntax.

Program 4 – Employee Program using @PropertySource + application.properties (Without XML)
-------------------------------------------------------------------------------------------------------------------------------------------------------
This program does not use XML. It reads values directly from application.properties using @PropertySource and @Value.

Project Structure
Spring_PropertySource
│
├── src/main/java
│      └── com.day23
│             Employee.java
│             AppConfig.java
│             EmployeePortal.java
│
└── src/main/resources
       application.properties
1. application.properties
Employee_name=Prashant
Employee_id=NIT0005
Employee_exp=7
Employee_projectStatus=true
Employee_basicSalary=50000
2. Employee.java
package com.day23;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ForAllEmployee")
@Scope("prototype")
public class Employee {

    @Value("${Employee_name}")
    private String employeeName;

    @Value("${Employee_id}")
    private String employeeId;

    @Value("${Employee_exp}")
    private int employeeExp;

    @Value("${Employee_projectStatus}")
    private boolean allProjectStatus;

    @Value("${Employee_basicSalary}")
    private long employeeBasicSalary;

    public long getIncrementSalary() {

        if (allProjectStatus) {
            employeeBasicSalary = employeeBasicSalary + 100000;
        }

        return employeeBasicSalary;
    }

    @Override
    public String toString() {

        return "Employee [employeeName=" + employeeName
                + ", employeeId=" + employeeId
                + ", employeeExp=" + employeeExp
                + ", allProjectStatus=" + allProjectStatus
                + ", employeeBasicSalary=" + employeeBasicSalary + "]";
    }

}
3. AppConfig.java
package com.day23;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.day23")
@PropertySource("application.properties")
public class AppConfig {

}

If this gives a file-not-found error, use:

@PropertySource("classpath:application.properties")
4. EmployeePortal.java
package com.day23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeePortal {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp =
                context.getBean("ForAllEmployee", Employee.class);

        System.out.println("Increment Salary : " + emp.getIncrementSalary());

        System.out.println(emp);

    }

}
Output
Increment Salary : 150000

Employee [employeeName=Prashant,
employeeId=NIT0005,
employeeExp=7,
allProjectStatus=true,
employeeBasicSalary=150000]
Interview Questions
Q1. Why do we use @PropertySource?

Answer: To load the application.properties file into the Spring application context.

Q2. Why do we use ${} in @Value?

Answer: ${} reads values directly from the properties file loaded by @PropertySource.

Q3. Why don't we use #{myprops.propertyName} here?

Answer: Because @PropertySource loads the properties into Spring's environment, not into a separate bean. Therefore, we use ${propertyName} instead of #{myprops.propertyName}.

Q4. Which IoC container is used?

Answer: AnnotationConfigApplicationContext, because the project uses annotation-based configuration instead of XML.

Difference Between Program 3 and Program 4
Program 3	Program 4
Uses XML (application-context.xml)	No XML
Uses <util:properties>	Uses @PropertySource
Uses #{myprops.Employee_name}	Uses ${Employee_name}
Uses ClassPathXmlApplicationContext	Uses AnnotationConfigApplicationContext

This is the recommended modern Spring approach because it is completely annotation-based and does not require XML configuration.
