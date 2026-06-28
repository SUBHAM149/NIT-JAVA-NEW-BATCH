22/06/26
Spring MVC:-

Model:-Model is a interface 

,we will call pojo class as model class.
->which will contain private properties,setter getter and constructor.
->According to the requirement we can use Either Model class or ModelAndView Class.



2.@Requestparam-->This is a built in annotation which is used to fetching the data from url.
-->generally it is used to fetch one form data or max 2-3 form data.

3.@Modelattribute:-This is a built in annotation which is used to fetch the data from url or the 
form .
-->generally it is used to fetch more then one form data.

4.Form Handling in Spring MVC:-
1.First we will have frontend form
2.user will enter the data
3.we will handle user entered data from the form to the controller using @Requestparam
or @Modelattribute.
4.either with Model class or ModelAndView Class.

Note:-(it is similar to Servlet form handling)
--------------------------------------------------------------------------------------------------
1.Spring MVC FormHandling:-
1.Create a dynamic web project
2.convert it into maven project
3.add the dependency servlet and spring web mvc dependency we will add
4.option build path and force update
5.first we have to get a form(we will create handler method which will return the form),enter the data and submit form
6.submit url /or request will come to controller and we will fetch the data and
7.display a proper page


-------------------------------------------------------------------------------------------------------------
2. Design a EmployeeForm management system using ModelAndView class and @Requestparam.
Create a employee form which should have min 3 columns and handle the data with handler method of 
EmployeeControllor and display the saved employee data on success.jsp page.


Projects
--------
Index.jsp
—------------------------
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Spring mvc Form handling Class...</h1>
<a href="form">User_Form</a>
</body>
</html>



—--------------------------------------------------------------------------------------------------------------
Web.xml
—---------------------------
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="https://jakarta.ee/xml/ns/jakartaee" xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee https://jakarta.ee/xml/ns/jakartaee/web-app_5_0.xsd" id="WebApp_ID" version="5.0">
 <display-name>SpringMVC_Project1_45</display-name>
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
Spring-servlet.xml
—--------------------------------------
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
FirstController
—---------------------
package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/form")
	public String getForm()
	{
		return "form";
	}
	
	@PostMapping("/submit")
	public ModelAndView saveForm(@RequestParam("name")String name,ModelAndView mav)
	{
		mav.addObject("msg", name);
		mav.setViewName("profile");
		return mav;
	}
	
	
	
	
	
	

}








