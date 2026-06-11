package com.nit;

public class PostgreSQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Database.");
    }
}
