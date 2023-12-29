package com.Xworkz.abstr.Runner;

import com.Xworkz.abstr.TicketBooking;

public class TicketMainEnter {
    public static void main(String[] args) {
        TicketBooking ticketBooking=new TicketBookingimp();
        Theater theater=new Theater(ticketBooking);
        theater.sell(10);


    }
}
