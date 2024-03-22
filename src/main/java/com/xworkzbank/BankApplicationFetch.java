package com.xworkzbank;

import java.sql.*;
import java.util.Iterator;

public class BankApplicationFetch {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/javaSqlConnetion";
        String userName = "root";
        String password = "Xworkzodc@123";

        String updateQuery = " Select * from bank";

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(updateQuery);
            System.out.println(result.toString());

            while(result.next()){
                System.out.println(result.getString("location"));
                System.out.println(result.getString("id"));
                System.out.println(result.getString("name"));
                System.out.println(result.getString("ifsc_code"));
                System.out.println(result.getString("branch"));
            }
//            System.out.println("deleted date into table");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
