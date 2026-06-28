**Form Handling using ModelAndView,@Modelattribute:-
Q.1 Design a Student Registration form using ModelAndView and @Modelattribute use after handling the form
display profile page on which all the student details should be printed.
Try to design a Proper Registration form using multiple pages and hyperlinks.

->1.Create a dynamic web project
2.Convert the project into maven project
3.create web.xml,spring-servlet.xml
4.create a welcome page index.jsp on this page we will create multiple buttons
5.for form url will return the student form 
6.another handler method will handle the form
7.and display appropriate page






—------------------------------------------------------------------------------------------------------------------------
Pom.xml
—--------------
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
 <modelVersion>4.0.0</modelVersion>
 <groupId>StudentRegistrationForm_45</groupId>
 <artifactId>StudentRegistrationForm_45</artifactId>
 <version>0.0.1-SNAPSHOT</version>
  <dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>6.2.1</version>
		</dependency>
		<!--
		https://mvnrepository.com/artifact/jakarta.servlet/jakarta.servlet-api -->
		<dependency>
			<groupId>jakarta.servlet</groupId>
			<artifactId>jakarta.servlet-api</artifactId>
			<version>6.0.0</version>
			<scope>provided</scope>
		</dependency>
	</dependencies>
 
 
 
 <packaging>war</packaging>
 <build>
   <plugins>
     <plugin>
       <artifactId>maven-compiler-plugin</artifactId>
       <version>3.13.0</version>
       <configuration>
         <release>21</release>
       </configuration>
     </plugin>
     <plugin>
       <artifactId>maven-war-plugin</artifactId>
       <version>3.2.3</version>
     </plugin>
   </plugins>
 </build>
</project>
—------------------------------------------------------------------------------------------------------------------------
Web.xml
—-------------------
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="https://jakarta.ee/xml/ns/jakartaee" xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee https://jakarta.ee/xml/ns/jakartaee/web-app_5_0.xsd" id="WebApp_ID" version="5.0">
 <display-name>StudentRegistrationForm_45</display-name>
 <servlet>
		<servlet-name>spring</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>spring</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
</web-app>
—------------------------------------------------------------------------------------------------------------------------spring-servlet.xml
—-----------------------
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
     xmlns:context="http://www.springframework.org/schema/context"
     xmlns:mvc="http://www.springframework.org/schema/mvc"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xsi:schemaLocation="
         http://www.springframework.org/schema/beans
         http://www.springframework.org/schema/beans/spring-beans.xsd
         http://www.springframework.org/schema/context
         http://www.springframework.org/schema/context/spring-context.xsd
         http://www.springframework.org/schema/mvc
         http://www.springframework.org/schema/mvc/spring-mvc.xsd">
  <!-- Enable component scanning -->
  <context:component-scan base-package="com.nit.backend" />
  <!-- Enable Spring MVC annotations like @Controller -->
  <mvc:annotation-driven/>
  <!-- View Resolver -->
  <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
      <property name="prefix" value="/WEB-INF/views/" />
      <property name="suffix" value=".jsp" />
  </bean>
</beans>
—----------------------------------------------------------------------------------index.jsp
—------------------------------------------------------------------------
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>..Welcome to StudentRegistration System..</h1>
<a href="home">HomePage</a><br>
<a href="about">AboutUsPage</a><br>
<a href="form">FormPage</a><br>
</body>
</html>
—------------------------------------------------------------------------
Student class
—------------------------------------------------------------------------
package com.nit.backend;
public class Student {
private 	int id;
private String name;
private	String course;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
}
—-------------------------------------------------------------------------------StudentController
package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@GetMapping("/home")
	public String getHomePage()
	{
		return "home";
	}
	
	@GetMapping("/about")
	public String getAboutUsPage(Model m)
	{
		m.addAttribute("msg", "Welcome to Naresh It");
		return "aboutUs";
	}
	
	@GetMapping("/form")
	public String getFormPage()
	{
		return "registration";
	}
	
	@PostMapping("/submit")
	public ModelAndView   saveStudent(@ModelAttribute  Student s)
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("Student", s);
		mav.setViewName("profile");
		return mav;
	}
	
	

}

—------------------------------------------------------------------------------home.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to HomePage</h1>
<h2>Naresh It is the biggest training institute in India..</h2>
Location:<h1>Hyderabad</h1>
Contact-us:<h1>Nit123@gmail.com</h1>
<h2>Thank u for visiting Naresh It..</h2>
</body>
</html>
—------------------------------------------------------------------------
aboutUs.jsp
—--------------
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to AboutUsPage..</h1>
<h1>${msg}</h1>
<h1>:Contact details:</h1>
Location:<h2>Hyderabad</h2>
Email:<h2>nit123@gmail.com</h2>
Mob_num:<h2>9878885689</h2>
</body>
</html>
—-----------------------------------------------------------------------
Registration.jsp
—-------------------------------------------------------------------------
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>..Welcome to Registration Form..</h1>
<form action="submit" method="post">
Id:<input type="text" name="id"><br>
Name:<input type="text" name="name"><br>
Course:<input type="text" name="course"><br>
<input type="submit" value="Submit"><br>
</form>
</body>
</html>
—--------------------------------------------------------------------------------profile.jsp

<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Successfull..</h1>
Id is:<h1>${Student.id}</h1>
Name is:<h1>${Student.name}</h1>
Course is:<h1>${Student.course}</h1>
<h2>Thank u..</h2>
<h1></h1>
<h1></h1>
</body>
</html>
