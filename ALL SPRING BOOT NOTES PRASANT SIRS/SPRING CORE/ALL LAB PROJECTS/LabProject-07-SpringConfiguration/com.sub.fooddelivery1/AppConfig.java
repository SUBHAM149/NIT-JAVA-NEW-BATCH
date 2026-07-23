package com.sub.fooddelivery1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DeliveryService deliveryService() {
        return new DeliveryService();
    }

    @Bean
    public FoodOrder foodOrder() {
        return new FoodOrder(deliveryService());
    }
}
