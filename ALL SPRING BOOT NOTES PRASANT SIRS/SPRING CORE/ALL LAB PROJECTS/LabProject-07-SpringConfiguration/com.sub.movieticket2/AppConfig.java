package com.sub.movieticket2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PaymentGateway paymentGateway() {
        return new PaymentGateway();
    }

    @Bean
    public MovieTicket movieTicket() {
        return new MovieTicket(paymentGateway());
    }
}
