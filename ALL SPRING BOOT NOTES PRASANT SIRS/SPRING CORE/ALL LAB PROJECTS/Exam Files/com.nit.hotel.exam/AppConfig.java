package com.nit.hotel.exam;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nit.hotel.exam")
@PropertySource("classpath:application7.properties")
public class AppConfig {

}
