package com.nit.product;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nit.product")
@PropertySource("application2.properties")
public class AppConfig {

}
