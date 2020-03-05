package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private String URL = "jdbc:mysql://localhost:3306/crypto";
    private String USERNAME = "admin";
    private String PASSWORD = "admin";
    //    private String DRIVER = "com.mysql.jdbc.Driver";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
