1.Controller Class:-The class which will handle request and response is called Controller
Class.on the top of this class we will use @Controller annotation.

2.@RequestMapping:-it is use to handle all the type of request.mainly it is use to bind the 
url with handler method.
It supports Get,Post,Put,delete all the type of request.

3.@GetMapping:-It is use to handle only get request.

4.@PostMapping:-It is use to handle only post request.

5.@PutMapping:It is use to handle only put request.

6.RequestParameter:-It is use to receive data from browser to controller.
and we will use the annotation
@RequestParam:It is use to get value from url.

@PathVariable:-It is use to get value directly from path variable.(Spring boot)

7.Model:-It contains single data or whole application data.
->Model class represents pojo class.

8.View:-It represents frontend page.(JSP,Thymeleaf)

Note:-ModelAndView is class which will have model and view cobined.
->It represents model as well as view,so rather then returning data individually we can
return it together as ModelAndView Class Object.

Note:-Model is also a class and ModelAndView is also a class.

Project
-------
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Spring mvc project 2</h1>
<a href="home">Get Home Page</a><br>
<a href="about">AboutUs</a><br>
<a href="profile">ProfilePage</a><br>
<a href="welcome">WelcomePage</a><br>
<a href="form">MyForm</a><br>
</body>
</html>


—-----------------------------------------------------------------------------------------------------------------------
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
package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/profile")
	public ModelAndView getProfilePage()
	{
		System.out.println("I m in ProfilePage method");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("profilePage");
		mav.addObject("Msg","Profile page is very important");
		return mav;
		
	}
	
	//Create one handler method with ModelAndView Class for  Welcome page.
	//add msg Welcome Everyone.(/welcome)
	
	@RequestMapping("/welcome")
	public ModelAndView getWelcomePage()
	{
		System.out.println("I m in welcome page");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("WelcomePage");
		mav.addObject("msg", "Welcome Everyone from backend side");
		return mav;
	}
	
//	@RequestMapping("/form")
//	public String getForm()
//	{
//		return "registrationForm";
//	}
	
	@RequestMapping("/form")
	public ModelAndView getForm()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("registrationForm");
		return mav ;
	}
	
	
	
	
	
	

}

—------------------------------------------------------------------------------------------------------------------------
About-us page

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
—------------------------------------------------------------------------------------------------------------------------
Registration page


<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
<h1>Welcome to Registration Form..</h1>
<form action="submit" method="post">
Name:<input type="text" name="name"><br>
Email:<input type="text" name="email"><br>
Loc:<input type="text" name="loc"><br>
<input type="submit" name="Submit"><br>
</form>
</body>
</html>
—--------------------------------------------------------------------------------------------------------------------
Welcome page

<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>We are in welcome page..</h1>
<h2>${msg}</h2>
</body>
</html>

—------------------------------------------------------------------------------------------------------------------------
About-us page:-


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
—------------------------------------------------------------------------------------------------------------------------
Home page:-

<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Home Page..</h1>
<h1>Gud evening everyone</h1>
</body>
</html>
