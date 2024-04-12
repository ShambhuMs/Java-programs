package com.xworkz.flight.runner;

import com.xworkz.flight.dto.Flightbooking;
import com.xworkz.flight.service.FlightBookingService;
import com.xworkz.flight.service.FlightBookingServiceImplement;

import java.util.ArrayList;
import java.util.List;

public class FlightRunner {
    public static void main(String[] args) {
        Flightbooking flightbooking=new Flightbooking("Indigo","bangalore","Delhi",10000);
        FlightBookingService flightBookingService=new FlightBookingServiceImplement();
    //    flightBookingService.save(flightbooking);

        List<Flightbooking> list=new ArrayList<>();
        Flightbooking flightbooking1=new Flightbooking("AirIndia","bangalore","chennai",6000);
        Flightbooking flightbooking2=new Flightbooking("Indigo","bangalore","Mumbai",8000);
        list.add(flightbooking1);
        list.add(flightbooking2);
      //  flightBookingService.saveAll(list);

     //   flightBookingService.update("Indigo","Hubli","Bengaluru");
//      flightBookingService.delete("AirIndia");
//       Flightbooking booking= flightBookingService.findByName("AirIndia");
//        if(booking==null){
//            System.out.println("There are no flights..");
//        }
//        else {
//            System.out.println("Flight exist and flightName is "+booking.getFlightName());
//        }

        List<Flightbooking> list1=flightBookingService.findAll();
        System.out.println("Flightbooking details...........");
        list1.forEach(booking1 ->{
            System.out.println(booking1.getFlightName());
            System.out.println(booking1.getSource());
            System.out.println(booking1.getDestination());
            System.out.println(booking1.getPrice());
        } );
    }
}
