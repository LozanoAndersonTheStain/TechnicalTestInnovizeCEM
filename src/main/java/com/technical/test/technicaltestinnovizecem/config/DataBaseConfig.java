package com.technical.test.technicaltestinnovizecem.config;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;

public class DataBaseConfig {
    private static final Dotenv dotenv = Dotenv.configure().load();

    public static void loadDatabaseProperties() {
        System.setProperty("DB_URL", dotenv.get("DB_URL"));
        System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
        System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    dotenv.get("DB_URL"),
                    dotenv.get("DB_USERNAME"),
                    dotenv.get("DB_PASSWORD")
            );
            if (connection != null && connection.isValid(2)) {
                System.out.println("Connection to Database Established");
            } else {
                System.out.println("Failed to establish connection to Database");
            }
        } catch (SQLException err) {
            if (err.getSQLState().equals("08001")) {
                System.out.println("Database does not exist: " + dotenv.get("DB_URL"));
            } else {
                System.out.println("Error: " + err.getMessage());
            }
        }
        return  connection;
    }
}
