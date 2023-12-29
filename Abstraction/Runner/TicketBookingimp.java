package com.Xworkz.abstr.Runner;

import com.Xworkz.abstr.TicketBooking;

public class TicketBookingimp implements TicketBooking {
    @Override
    public double buy(int quantity) {
        System.out.println("Quantity is: "+quantity);
        return 0;
    }

    @Override
    public boolean cancel() {
        System.out.println("booking canceled..");
        return false;
    }
}
