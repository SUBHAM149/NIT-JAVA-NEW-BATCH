package com.nit.banking;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nit.banking")
@PropertySource("application3.properties")
public class AppConfig {

}
