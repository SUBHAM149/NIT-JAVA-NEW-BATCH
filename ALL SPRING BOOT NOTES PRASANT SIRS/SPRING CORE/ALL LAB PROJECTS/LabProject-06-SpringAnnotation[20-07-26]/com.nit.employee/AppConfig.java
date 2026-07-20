package com.nit.employee;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nit.employee")
@PropertySource("application1.properties")
public class AppConfig {

}
