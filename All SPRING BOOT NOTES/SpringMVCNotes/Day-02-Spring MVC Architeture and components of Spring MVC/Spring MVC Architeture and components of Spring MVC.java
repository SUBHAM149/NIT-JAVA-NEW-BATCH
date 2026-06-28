12/06/2026
---------
Spring MVC Architeture and components of Spring MVC:-

1.Dispatcher Servlet:-This is the first component of Spring mvc framework,
This will behave like a herat of Spring MVC Framework.
->This is called as FrontController.
--->Dispatcher Servlet is a built in interface in Spring Mvc framework.
->The task of dispatcher servlet is to handle all the incoming request to the web app.
and check with the handler mapping and delegates the request to aprropriate controller.
-->Dispather Servlet behaves like security guard of the web appln.

2.HandlerMapping:-HandlerMapping is used to map the specific url to a appropriate
controller class method.
--->If there is a url that url should be mapped to which method of which controller is decided 
by handler mapping.
so basically handler mapping helps front controller to forward the request to
specific controller class.

3.Controller:-It is a component of spring MVC framework.
-->To handle all the incoming request and send the response.
-->Controller is a class and which will be annoted with @Controller annotation.

4.Service:-THis layer will contain Bussiness logic.
-->Controller with interact with Service layer.

5.Repository:-this layer will have database access code.
->>CRUD operation methods will be there.
-->We can call it as DAO layer also.


6.Model:-A single data or the whole appln data is called as model.
->>POJO Class in Spring MVC is called as Model Class.

7.Database:-Take the data and return to model.

8.Model data will reach to controller either alone or with ModelAndView Object.

9.Controller will connect ViewResolver and it will return a view page.
so basically ViewResolver is a component of Spring MVC FRamework and it converts logical view
page to actual view page.

10.View page will be displayed to the user or to the client.

--->THis whole process is called as Spring architecture.
and it is containing components of Spring MVC FRAMEWORK AS WELL.


DispatcherServletConfiguration File
------------------------------------
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


Bean ConfigurationFile
-----------------------
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

MavenDependency
-----------------
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
 <modelVersion>4.0.0</modelVersion>
 <groupId>SpringMVCProject1</groupId>
 <artifactId>SpringMVCProject1</artifactId>
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


 
