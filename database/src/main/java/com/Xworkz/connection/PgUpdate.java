package com.Xworkz.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PgUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl="jdbc:mysql://localhost:3306/javaSqlConnection";
        String userName="root";
        String password="Xworkzodc@123";

        String updateQuery="update bengaluru_pg set location='Btm 2nd stage' where id=4";
        String updateQuery1="update bengaluru_pg set location='btm dollars colony' where id=1";
        String updateQuery2="update bengaluru_pg set location='kengeri' where id=2";
        String updateQuery3="update bengaluru_pg set location='jayanagar' where id=3";
        String updateQuery4="update bengaluru_pg set location='sahakarnagar' where id=5";

        try {
            Connection connection= DriverManager.getConnection(jdbcUrl, userName, password);
            Statement statement=connection.createStatement();
            boolean result=statement.execute(updateQuery4);
            System.out.println(result);
            System.out.println("Updated date into table");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
