package com.nit;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoTM {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_tm_1", "root", "Subham@123");
        conn.setAutoCommit(false);
        Statement s=conn.createStatement();
        
        s.execute("INSERT INTO student VALUES(105,'RAM',12,'CSE')");
        s.execute("INSERT INTO student VALUES(106,'RAVI',15,'EEE')");
        conn.commit();
        conn.close();
        System.out.println("Data has Inserted Sucessfully.....");
        
	}

}
