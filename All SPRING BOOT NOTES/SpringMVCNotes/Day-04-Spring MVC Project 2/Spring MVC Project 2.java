Spring MVC Project 2:-
1.Create a Dynamic project
2.Convert it into maven project
3.add dependency Spring web mvc and servlet
4.generate two xml files 1.web.xml,spring-servlet.xml
5.web.xml:-With the help of Servlet class tag and servlet mapping tag we will specify the address
of dispatcher servlet
6.spring-servle.xml:-We r specifying base package name and view resolver bean object.
7.we will generate a welcome page name index.jsp we will specify a url.
8.we will create a folder views inside WEB-INF folder all the fronted pages which is containing
jsp suffix will write down.
9.WE will create a controller class and it will have handler method which will handle the url.
10.We will use two annotation in gewneral @Controller,@Requestmapping.
---------------------------------------------------------------------------
1.add two more hyperlink for two buttons
1.profilePage-->profile(min 5 msg)
2.registration form--->registration form(with 5 columns and submit button)

-------------------------------------------------

package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	
	@RequestMapping("/home")
	public String getHomePage()
	{
		return "homePage";
		
	}
	
	@RequestMapping("/about")
	public String getAboutUsPage()
	{
		return "aboutUs";
	}
	
}

spring-servlet.xml
-------------------
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

web.xml
--------
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="https://jakarta.ee/xml/ns/jakartaee"
	xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee https://jakarta.ee/xml/ns/jakartaee/web-app_5_0.xsd"
	id="WebApp_ID" version="5.0">
	<display-name>SpringMVC_Project2_45</display-name>

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

  aboutUs.jsp
---------------
  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>..Welcome to About Us Page..</h1><br>
<h1>Here Are the details about us:Naresh It is the Biggest Institute..</h1><br>
<h2>Contact:7676767665</h2><br>
<h1>Email:nit123@gmail.com</h1><br>
<h1>Thank u for visiting..</h1><br>
<h2>Plz visit again...</h2><br>
<h1></h1>
</body>
</html>


