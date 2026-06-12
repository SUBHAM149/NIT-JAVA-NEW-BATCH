Day-1-Introduction On MVC
-------------------------
Spring Core:-Grammer of SpringFramework,how the Spring container will work,
how the dependency injection will work,how many types of dependency injection.
->Standalone appln:-Desktop Appln

JDBC,SERVLET,JSP,HIBERNATE DATA JPA

JDBC-->Connect Java with Database
Hibernate Data JPA:-Connect withdatabase

Servlet:-Connect Backend to the Server Side
JSP:-Connect Backend to the Server Side,generate dynamic web page

--->To overcome the disadvantages of JDBC<HIBERNATE<(SERVLET<JSP)

Spring MVC:-Spring MVC is Spring Web module,Which is java based and which is used to
develop web appln by integrating so many another technology .
->It will provide loosley coupled and flexible web appln.

->MVC stands for MODEL VIEW CONTROLLER.
->Spring mvc will provide different layers to have a organized and structured project.
->Layers:
1.Presentation layer(View):--View Page is presentation layer
2.Persistence layer(MODEL):---Model(single data or whole appln data)
3.Controller layer(CONTROLLER):---Controller(Which will handle the incoming request and response)

->It will divide the whole appln into three parts MODEL VIEW CONTROLLER>

->Spring MVC foolows MVC DEsign Pattern.

Design pattern:-generally in it sector as a a developer we will be designing a appn
->problems:-Code is not structructured and organized
->the appln interaction with the client
->testing

1.Singltone
2.Factory
3.Dao 
4.MVC

MVC Design Pattern:-Model View Controller
->It follows Model View Controller design pattern.
->it divides the project into three parts model view controller.

1.Model:-it contains single data,or the whole appln data is called as model.
(Model class:-Entity class in Spring mvc)

2.View:-It will contain presentation layer
->html,css,jsp,thymeleaf,js

3.Controller:-To handle the incoming request and response is called as controller.
->(Dispather Servlet which will behave like Front Controller)

Client Server Architerture:-
Client----->SErver
   Client   <--------Server

->Client will send the request to server,server will handle the request and generate the
response and semnd response back to the client.


**MVC DEsign Pattern Architecture:-

1.Client will send the request to controller
2.Controller will check with Model if Model is there ,it will connect with database
3.send the data with response and display the dynamic web page
4.else if there is no model directly it will display view page to Client


1.Spring MVC Traditional Project
2.Spring MVC with Spring Boot project
