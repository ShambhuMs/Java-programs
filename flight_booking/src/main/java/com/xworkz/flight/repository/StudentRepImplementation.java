package com.xworkz.flight.repository;

import com.xworkz.flight.dto.StudentDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentRepImplementation implements StudentRepository{
    @Override
    public void saveAll(List<StudentDTO> list) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
        String username="root";
        String password="Xworkzodc@123";

        String insertQuery="insert into studentInfo(id,name,branch,semister) value(?,?,?,?)";

        try {
           Connection connection= DriverManager.getConnection(jdbcUrl,username,password);
           PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
            for (StudentDTO student:list ) {
                preparedStatement.setInt(1,student.getId());
                preparedStatement.setString(2, student.getName());
                preparedStatement.setString(3,student.getBranch());
                preparedStatement.setInt(4,student.getSemister());
                System.out.println("data inserted..");
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(StudentDTO studentDTO) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
        String username="root";
        String password="Xworkzodc@123";

        String insertQuery="insert into studentInfo(id,name,branch,semister) values(?,?,?,?)";

        try {
          Connection connection= DriverManager.getConnection(jdbcUrl,username,password);
         PreparedStatement preparedStatement= connection.prepareStatement(insertQuery);

        preparedStatement.setInt(1,studentDTO.getId());
         preparedStatement.setString(2,studentDTO.getName());
         preparedStatement.setString(3,studentDTO.getBranch());
         preparedStatement.setInt(4,studentDTO.getSemister());
         preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
