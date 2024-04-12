package com.xworkz.flight.service;

import com.xworkz.flight.dto.Flightbooking;
import com.xworkz.flight.repository.FlightBookingRepository;
import com.xworkz.flight.repository.FlightBookingRepositoryImple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class FlightBookingServiceImplement implements FlightBookingService{

    FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImple();

    @Override
    public void update(String flightName, String source, String destination) {
        if (flightName==null || flightName.isEmpty()){
            System.out.println("please enter valid name..");
        }
        else {
            flightBookingRepository.update(flightName,source,destination);
        }
    }

    @Override
    public void delete(String flightName) {
        if(flightName==null || flightName.isEmpty()){
            System.out.println("Please enter valid name..");
        }
        else {
            flightBookingRepository.delete(flightName);
        }
    }

    @Override
    public void save(Flightbooking flightbooking) {
        if(flightbooking.getFlightName().isEmpty()){
            System.out.println("Please enter the flight name..");
        }
        else {
            flightBookingRepository.save(flightbooking);
        }
    }

    @Override
    public Flightbooking findByName(String flightName) {
        if(flightName==null){
            System.out.println("Please enter valid name..");
        }
        else {
       Flightbooking  booking =     flightBookingRepository.findByName(flightName);
       return booking;
        }
        return null;
    }

    @Override
    public List<Flightbooking> findAll() {
        List<Flightbooking> flightbookings=flightBookingRepository.findAll();
        return flightbookings;
    }

    @Override
    public void saveAll(List<Flightbooking> flightbookings) {
      boolean validBooking=true;
      for (Flightbooking booking: flightbookings){
          if(booking.getFlightName().isEmpty()) {
              System.out.println("Please enter valid flight name...");
              validBooking = false;
          }
      }
      if (!validBooking){
          return;
      }
      flightBookingRepository.saveAll(flightbookings);
    }
}
