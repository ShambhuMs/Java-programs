package com.xworkz.flight.service;

import com.xworkz.flight.dto.Flightbooking;

import java.util.List;

public interface FlightBookingService {
    public void save(Flightbooking flightbooking);

    public void saveAll(List<Flightbooking> flightbookings);

    public void update(String flightName,String source,String destination);

    public void delete(String flightName);
    public Flightbooking findByName(String flightName);
    public List<Flightbooking> findAll();
}
