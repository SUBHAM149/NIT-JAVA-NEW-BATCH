package com.nit.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.factory.InsuranceFactory;
import com.nit.service.InsuranceClaim;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Claim Type (CAR/BIKE/TRUCK):");
		String claimType = sc.nextLine();

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		InsuranceFactory factory = context.getBean(InsuranceFactory.class);

		InsuranceClaim claim = factory.getClaim(claimType);

		if (claim != null) {
			claim.processClaim();
		} else {
			System.out.println("Invalid Claim Type");
		}

		sc.close();
	}
}
