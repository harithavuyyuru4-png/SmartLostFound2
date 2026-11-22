
package com.lostfound;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        try {
            String host = System.getenv("DB_HOST");
            String port = System.getenv("DB_PORT");
            String database = System.getenv("DB_NAME");
            String username = System.getenv("DB_USER");
            String password = System.getenv("DB_PASSWORD");

            String url = "jdbc:mysql://" + host + ":" + port
                    + "/" + database + "?sslMode=REQUIRED";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("JDBC Connection Successful!");

            return con;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

