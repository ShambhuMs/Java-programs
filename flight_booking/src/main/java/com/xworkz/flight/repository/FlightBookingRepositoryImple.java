package com.xworkz.flight.repository;

import com.xworkz.flight.dto.Flightbooking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightBookingRepositoryImple implements FlightBookingRepository{
    @Override
    public void update(String flightName, String source, String destination) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
        String username="root";
        String password="Xworkzodc@123";

        String updateQuery="update flightticket set source=?, destination=? where flight_name=?";
        try {
           Connection connection= DriverManager.getConnection(jdbcUrl,username,password);
           PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
           preparedStatement.setString(1,source);
           preparedStatement.setString(2,destination);
           preparedStatement.setString(3,flightName);
           preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String flightName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
        String username="root";
        String password="Xworkzodc@123";

        String updateQuery="delete from flightticket  where flight_name=?";
        try {
            Connection connection= DriverManager.getConnection(jdbcUrl,username,password);
            PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,flightName);
            preparedStatement.executeUpdate();
            System.out.println("deleted....");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Flightbooking> findAll() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
        String userName="root";
        String password="Xworkzodc@123";
        String query="select *from flightticket ";
        List<Flightbooking> list=new ArrayList<>();
        try {
         Connection connection=  DriverManager.getConnection(jdbcUrl,userName,password);
         PreparedStatement preparedStatement= connection.prepareStatement(query);
         ResultSet resultSet=preparedStatement.executeQuery();
         while(resultSet.next()){
             System.out.println(resultSet.getString(2));
             System.out.println(resultSet.getString("source"));
             Flightbooking flightbooking=new Flightbooking();
             flightbooking.setFlightName(resultSet.getString("flight_name"));
             flightbooking.setSource(resultSet.getString("source"));
             flightbooking.setDestination(resultSet.getString("destination"));
             flightbooking.setPrice(resultSet.getInt("price"));
             list.add(flightbooking);
         }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    @Override
    public Flightbooking findByName(String flightName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
        String userName="root";
        String password="Xworkzodc@123";

        String insertQuery="Select * from flightticket where flight_name=? ";
        Flightbooking flightbooking=null;
        try {
            Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
            preparedStatement.setString(1,flightName);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                System.out.println(resultSet.getString("source"));
                System.out.println(resultSet.getString("destination"));
                flightbooking=new Flightbooking();
                flightbooking.setFlightName(resultSet.getString("flight_name"));
                flightbooking.setSource(resultSet.getString("source"));
                flightbooking.setDestination(resultSet.getString("destination"));
                flightbooking.setPrice(resultSet.getInt("price"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  flightbooking;
    }

    //    FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImple();
    @Override
    public void save(Flightbooking flightbooking) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
        String userName="root";
        String password="Xworkzodc@123";

        String insertQuery="insert into flightticket(flight_name, source,destination,price) values(?,?,?,?)";

        try {
            Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
            preparedStatement.setString(1,flightbooking.getFlightName());
            preparedStatement.setString(2,flightbooking.getSource());
            preparedStatement.setString(3,flightbooking.getDestination());
            preparedStatement.setInt(4,flightbooking.getPrice());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveAll(List<Flightbooking> flightbookings) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
        String userName="root";
        String password="Xworkzodc@123";

        String insertQuery="insert into flightticket(flight_name, source,destination,price) values(?,?,?,?)";

        try {
            Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
            for (Flightbooking flightbooking: flightbookings) {
                preparedStatement.setString(1, flightbooking.getFlightName());
                preparedStatement.setString(2, flightbooking.getSource());
                preparedStatement.setString(3, flightbooking.getDestination());
                preparedStatement.setInt(4, flightbooking.getPrice());
                preparedStatement.execute();
                System.out.println("data inserted..");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
