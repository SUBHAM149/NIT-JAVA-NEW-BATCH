package com.nit.Scholarship;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nit.Scholarship")
@PropertySource("application4.properties")
//@PropertySource("application5.properties")
public class AppConfig {

}
