23/06/2026

Model:-It is a built in Interface.Inside Spring MVC Framework.
->it is use to send data from controller to view page.
->The object of model interface will contain only data,no view page.
->Generally we will use model in simple project where we r displaying commonly view
page and very less data we can use Model object.

Model model;

ModelAndView:-this is a built in class of Spring MVC Framework.
->It is use to contain data and view page.
->Generally the controller class after handling the request it will return
object of ModelAndView class from where we can display with the help of view
resolver actual view page.
->In general we will use ModelAndView Class for big projects.
->and it is a part of Spring MVC Traditional project.

ModelAndView mav=new ModelAndView();

1.mav.addObject(key,value);
2.mav.setViewname("  ");

Note:-In industry still legacy Banking appln,telecom appln,insurance appln
are using traditional MVC Project for maintance purpose.
->So dont't take this topic lighltly.
->We actually work on this in it industry nowadays.


3.@Modelattribute:-if we have to fetch more then one form data ,rather then @Requ
est param we can use @Modelattribute.
->@Modelattribute is used to bind the form data with java bean directly.
--------------------------------------------------------------------------------
1.Design a SpringWebMVC Project which will show the example how to use Model
and display proper msg along with this in the same project do form handling 
using Model.
->1.Create a Dynamic project and convert it into maven
2.add the dependency
3.design web.xml and spring-servlet.xml
4.create index.jsp ,it will contain a hyperlink
5.WE will create a controller class and handler method
6.which will handle the url using MOdel
7.display a proper page

Projects
--------<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
 <modelVersion>4.0.0</modelVersion>
 <groupId>SpringWebMvc_ModelProject_45</groupId>
 <artifactId>SpringWebMvc_ModelProject_45</artifactId>
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

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="https://jakarta.ee/xml/ns/jakartaee" xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee https://jakarta.ee/xml/ns/jakartaee/web-app_5_0.xsd" id="WebApp_ID" version="5.0">
 <display-name>SpringWebMvc_ModelProject_45</display-name>
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
—------------------------------------------------------------------------------------------------------------------------
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
—------------------------------------------------------------------------------------------------------------------------
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to SpringMVC Model class..</h1>
<a href="demo">welcomePage</a>
<a href="form">FormPage</a>
</body>
</html>
—------------------------------------------------------------------------------------------------------------------------
package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	
	@GetMapping("/demo")
	public String getWelcomePage(Model model)
	{
		model.addAttribute("name", "Mona");
		return "welcome";
	}
	
	@GetMapping("/form")
	public String getForm()
	{
		return "userForm";
	}
	
	@PostMapping("/submit")
	public String saveForm(@RequestParam("email") String email,Model m)
	{
		m.addAttribute("u_email",email);
		return "profile";
		
	}
	

}

—------------------------------------------------------------------------------------------------------------------------

<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome:${name}</h1>
</body>
</html>
—------------------------------------------------------------------------------------------------------------------------
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to the UserForm</h1>
<form action="submit" method="post">
User_Email:<input type="text" name="email"><br>
<input type="submit" value="Submit">
</form>
</body>
</html>
—------------------------------------------------------------------------------------------------------------------------
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>You are on Profile Page</h1>
<h1>Welcome:${u_email}</h1>
</body>
</html>

