package com.xworkzbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//UPDATE
public class BankApplicationUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl="jdbc:mysql://localhost:3306/javaSqlConnetion";
        String userName="root";
        String password="Xworkzodc@123";

        String updateQuery="update bank set branch='BANASHANKARI' where name='HDFC'";

        try {
            Connection connection= DriverManager.getConnection(jdbcUrl, userName, password);
            Statement statement=connection.createStatement();
            boolean result=statement.execute(updateQuery);
            System.out.println(result);
            System.out.println("Updated date into table");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
