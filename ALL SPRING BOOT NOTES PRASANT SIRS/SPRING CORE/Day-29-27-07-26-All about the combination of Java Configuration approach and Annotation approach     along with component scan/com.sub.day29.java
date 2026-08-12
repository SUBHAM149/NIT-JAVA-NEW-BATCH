All about the combination of Java Configuration approach and Annotation approach 
   along with component scan

Program In Class
------------------------------------------------------------------------------------------
package com.sub.day29;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    @Value("${brandName}")
    private String brandName;

    @Value("${price}")
    private int price;

    private Motor motor;

    public void pressStartKey() {

        motor.start();

        System.out.println("Vehicle started");
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehicle [brandName=" + brandName
                + ", price=" + price
                + ", motor=" + motor + "]";
    }
}
------------------------------------------------------------------------------------------
package com.sub.day29;

public class Motor {

    private String companyName;
    private int capacity;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void start() {
        System.out.println("Motor started!!");
    }

    @Override
    public String toString() {
        return "Motor [companyName=" + companyName
                + ", capacity=" + capacity + "]";
    }
}
------------------------------------------------------------------------------------------
package com.sub.day29;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/sub/day29/application.properties")
@ComponentScan(basePackages = "com.sub.day29")
public class JavaConfig {

    @Autowired
    Environment environment;

    @Bean
    public Motor motor() {

        Motor motor = new Motor();

        motor.setCompanyName(
                environment.getProperty("companyName")
        );

        motor.setCapacity(
                Integer.parseInt(
                        environment.getProperty("capacity")
                )
        );

        return motor;
    }
}
------------------------------------------------------------------------------------------
application.properties
----------------------
companyName=TATA
capacity=10
brandName=Enfield
price=200000
------------------------------------------------------------------------------------------
OUTPUT
Vehicle [brandName=Enfield, price=200000, motor=Motor [companyName=TATA, capacity=10]]
Motor started!!
Vehicle started
