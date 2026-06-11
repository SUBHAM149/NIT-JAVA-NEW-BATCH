package com.nit;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Database Type (MySQL/Oracle/PostgreSQL): ");
        String dbType = sc.nextLine();

        Database database = DatabaseFactory.getDatabase(dbType);

        if(database != null) {
            database.connect();
        } else {
            System.out.println("Invalid Database Type");
        }

        sc.close();
    }
}
