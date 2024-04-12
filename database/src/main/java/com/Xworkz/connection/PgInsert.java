package com.Xworkz.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PgInsert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl="jdbc:mysql://localhost:3306/javaSqlConnection";
        String userName="root";
        String password="Xworkzodc@123";

        String insertQuery="INSERT INTO bengaluru_pg VALUE(1,'Mallikarjuna','NS Palya','MALE',5000)";
        String insertQuery1="INSERT INTO bengaluru_pg VALUE(2,'Balaji','Micro layout','FEMALE',5500)";
        String insertQuery2="INSERT INTO bengaluru_pg VALUE(3,'SMS','JP nagar','MALE',6000)";
        String insertQuery3="INSERT INTO bengaluru_pg VALUE(4,'Nitin','Rajajinagar','FEMALE',4500)";
        String insertQuery4="INSERT INTO bengaluru_pg VALUE(5,'Asis','Banashankari','MALE',6500)";
        try {
            Connection connection= DriverManager.getConnection(jdbcUrl,userName,password);
            Statement statement=connection.createStatement();
            boolean result= statement.execute(insertQuery4);
            System.out.println(result);
            System.out.println("Inserted data into bank");
            System.out.println("Connection to database is sucessfull !.........");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
