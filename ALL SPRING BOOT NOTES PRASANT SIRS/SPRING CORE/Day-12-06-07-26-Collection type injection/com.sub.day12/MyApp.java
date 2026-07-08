package com.sub.day12;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/sub/day12/application-context.xml");
	}
}
