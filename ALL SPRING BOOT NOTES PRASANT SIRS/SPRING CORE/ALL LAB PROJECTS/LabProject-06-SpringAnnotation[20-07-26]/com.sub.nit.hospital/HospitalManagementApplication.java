package com.sub.nit.hospital;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HospitalManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PatientService patientService =
                context.getBean(PatientService.class);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("========= Hospital Management System =========");
            System.out.println("1. Register Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Book Appointment");
            System.out.println("4. Generate Medical Report");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                patientService.registerPatient();
                break;

            case 2:
                patientService.searchPatient();
                break;

            case 3:
                patientService.bookAppointment();
                break;

            case 4:
                MedicalReportService report =
                        context.getBean(MedicalReportService.class);
                report.generateReport();
                break;

            case 5:
                System.out.println("Thank You...");
                sc.close();
                System.exit(0);
                break;

            default:
                System.out.println("Invalid Choice.");
            }
        }
    }
}
