package com.xworkzbank;

import java.sql.*;

public class BankApplicationUsingPreparestatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/javaSqlConnetion";
        String userName = "root";
        String password = "Xworkzodc@123";

        String insertQuery = "Insert into bank values(?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement=null;
        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setInt(1, 9);
            preparedStatement.setString(2, "KOTAK");
            preparedStatement.setString(3, "Vijayanagar");
            preparedStatement.setString(4, "KOT007608");
            preparedStatement.setString(5, "Bengaluru");
            preparedStatement.execute();
            System.out.println("=========================================");
            preparedStatement.setInt(1, 10);
            preparedStatement.setString(2, "AXIS");
            preparedStatement.setString(3, "Hosur");
            preparedStatement.setString(4, "AXIS007680");
            preparedStatement.setString(5, "Bengaluru");
            preparedStatement.execute();

            System.out.println("Inserted date into table......");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

