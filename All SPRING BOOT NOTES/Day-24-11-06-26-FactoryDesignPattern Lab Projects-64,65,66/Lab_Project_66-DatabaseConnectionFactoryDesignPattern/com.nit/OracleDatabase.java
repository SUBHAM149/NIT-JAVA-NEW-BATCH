package com.nit;

public class OracleDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connected to Oracle Database.");
    }
}
