package com.sub.hospital3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DoctorService doctorService() {
        return new DoctorService();
    }

    @Bean
    public Appointment appointment() {
        return new Appointment(doctorService());
    }
}
