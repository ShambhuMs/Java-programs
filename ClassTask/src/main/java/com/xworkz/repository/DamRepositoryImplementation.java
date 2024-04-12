package com.xworkz.repository;

import com.xworkz.dto.DamDTO;

import java.sql.*;

public class DamRepositoryImplementation implements DamRepository{
    @Override
    public DamDTO select(String name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/reservior";
        String username="root";
        String password="Xworkzodc@123";
        String updateQuery="select *from dam where name=?";
        DamDTO damDTO=null;
        try {
            Connection connection= DriverManager.getConnection(jdbcUrl,username,password);
            PreparedStatement preparedStatement= connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,name);
         ResultSet resultSet=   preparedStatement.executeQuery();

            if(resultSet.next()){
                System.out.println(resultSet.toString());
                System.out.println(resultSet.getString("place"));
                System.out.println(resultSet.getString("height"));
                damDTO=new DamDTO();
                damDTO.setName(resultSet.getString("name"));
                damDTO.setPlace(resultSet.getString("place"));
                damDTO.setState(resultSet.getString("state"));
                damDTO.setHeight(resultSet.getInt("height"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return damDTO;
    }

    @Override
    public void update(String name,String place,String state) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/reservior";
        String username="root";
        String password="Xworkzodc@123";
        String updateQuery="update dam set name=?,place=? where state=?";

        try {
            Connection connection= DriverManager.getConnection(jdbcUrl,username,password);
            PreparedStatement preparedStatement= connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,place);
            preparedStatement.setString(3,state);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insert(DamDTO damDTO) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/reservior";
        String username="root";
        String password="Xworkzodc@123";
        String insertQuery="insert into dam(name,place,state,height) values(?,?,?,?)";

        try {
         Connection connection= DriverManager.getConnection(jdbcUrl,username,password);
       PreparedStatement preparedStatement= connection.prepareStatement(insertQuery);
       preparedStatement.setString(1, damDTO.getName());
       preparedStatement.setString(2, damDTO.getPlace());
       preparedStatement.setString(3, damDTO.getState());
       preparedStatement.setInt(4,damDTO.getHeight());
       preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
