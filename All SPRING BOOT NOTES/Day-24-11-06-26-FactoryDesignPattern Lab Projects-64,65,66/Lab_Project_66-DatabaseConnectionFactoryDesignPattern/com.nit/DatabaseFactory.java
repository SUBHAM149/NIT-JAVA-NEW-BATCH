package com.nit;

public class DatabaseFactory {

    public static Database getDatabase(String dbType) {

        if(dbType == null) {
            return null;
        }

        if(dbType.equalsIgnoreCase("MySQL")) {
            return new MySQLDatabase();
        }
        else if(dbType.equalsIgnoreCase("Oracle")) {
            return new OracleDatabase();
        }
        else if(dbType.equalsIgnoreCase("PostgreSQL")) {
            return new PostgreSQLDatabase();
        }

        return null;
    }
}
