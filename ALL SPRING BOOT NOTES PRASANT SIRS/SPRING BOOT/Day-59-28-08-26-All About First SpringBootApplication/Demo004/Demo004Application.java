package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.example.demo.FirstApp.Robot;

@SpringBootApplication
public class Demo004Application {

    @Autowired
    Environment environment;

    @Bean
    public Robot robot() {

        Robot robot = new Robot();

        robot.setRoboCompany(
                environment.getProperty("companyName")
        );

        robot.setMotorPower(
                environment.getProperty("motorPower")
        );

        return robot;
    }

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(
                        Demo004Application.class,
                        args
                );

        Robot bean =
                context.getBean(
                        "robot",
                        Robot.class
                );

        System.out.println(bean);
    }
}
