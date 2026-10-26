package com.tka23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConfig {

    public static Connection getSQLConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection( "jdbc:mysql://localhost:3306/ipl_1341", "root","Root");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(
                "Unable to connect to MySQL: " + e.getMessage(), e);
        }
    }
}