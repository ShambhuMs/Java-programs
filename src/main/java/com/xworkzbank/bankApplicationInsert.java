package com.xworkzbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//INSERT
public class bankApplicationInsert {
    public static void main(String[] args) {
        // 1.LOAD AND REGESTER
        try {
            Class.forName("com.mysql.jdbc.Driver");//fully qualified name
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // 2.GET CONNECTION
//                     " protocol:subProtocal://host/portalNumber/database"
        String jdbcUrl="jdbc:mysql://localhost:3306/javaSqlConnetion"; //connecting to database
        String userName="root";
        String password="Xworkzodc@123";

        String insertQuery="INSERT INTO bank VALUES(8,'SBI','BHATKAL','SBI00017606','BHATKAL')";

        try {
          //  3. CREATE STATEMENT
            // Connection-Interface  Statement-Interface
           Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
           // 4. EXECUTE QUERY
            Statement statement=connection.createStatement();
            // 5. PROCESS THE RESULT
            boolean result= statement.execute(insertQuery);
            System.out.println(result);   //5) processing the result and data
            System.out.println("Inserted data into bank");
            System.out.println("Connection to database is sucessfull !.........");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //CLOSE THE RESOURCE

    }
}

