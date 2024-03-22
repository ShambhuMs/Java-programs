package com.xworkzbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//DELETE
public class BankApplicationDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl="jdbc:mysql://localhost:3306/javaSqlConnetion";
        String userName="root";
        String password="Xworkzodc@123";

        String updateQuery="Delete from bank where branch='bhatkal'";

        Connection connection=null;
        Statement statement=null;
        try {
             connection= DriverManager.getConnection(jdbcUrl, userName, password);
             statement=connection.createStatement();
            int result=statement.executeUpdate(updateQuery);
            System.out.println(result);
            System.out.println("deleted date into table");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
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
