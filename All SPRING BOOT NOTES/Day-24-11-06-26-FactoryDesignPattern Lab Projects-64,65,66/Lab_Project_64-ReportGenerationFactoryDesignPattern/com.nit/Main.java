package com.nit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Report Type (PDF/EXCEL/HTML): ");
        String reportType = sc.nextLine();

        Report report = ReportFactory.getReport(reportType);

        if(report != null) {
            report.generateReport();
        } else {
            System.out.println("Invalid Report Type");
        }

        sc.close();
    }
}
