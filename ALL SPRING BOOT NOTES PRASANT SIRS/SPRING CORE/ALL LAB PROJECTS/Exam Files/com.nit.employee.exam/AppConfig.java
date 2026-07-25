package com.nit.employee.exam;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nit.employee.exam")
@PropertySource("classpath:application6.properties")
public class AppConfig {

}
