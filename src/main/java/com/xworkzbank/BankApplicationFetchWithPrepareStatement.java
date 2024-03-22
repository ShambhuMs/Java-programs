package com.xworkzbank;

import java.sql.*;
import java.util.Collections;

public class BankApplicationFetchWithPrepareStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/javaSqlConnetion";
        String userName = "root";
        String password = "Xworkzodc@123";
        String updateQuery="select * from bank where name=? or branch=?";
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            connection= DriverManager.getConnection(jdbcUrl,userName,password);
            preparedStatement=connection.prepareStatement(updateQuery);

            preparedStatement.setString(1,"SBI");
            preparedStatement.setString(2,"MALGI");
            ResultSet resultSet=preparedStatement.executeQuery();
            System.out.println(resultSet.toString());
            while(resultSet.next()){
                System.out.println("id---->"+resultSet.getString( "id"));
                System.out.println("branch----->"+resultSet.getString("branch"));
                System.out.println("name---->"+resultSet.getString("name"));
                System.out.println("ifsc_code---->"+resultSet.getString("ifsc_code"));
                System.out.println("location---->"+resultSet.getString("location"));
            }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
