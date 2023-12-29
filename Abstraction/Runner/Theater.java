package com.Xworkz.abstr.Runner;

import com.Xworkz.abstr.TicketBooking;

public class Theater {
    TicketBooking ticketBooking;
    Theater(TicketBooking ticketBooking){
        this.ticketBooking=ticketBooking;

    }

    public double sell(int quantity){
        int price=200;
        int dis;
        int totalprice;
        if(quantity<=0){
            cancel();
        }


        if( quantity>5){
             dis=(price*quantity)/10;
            ticketBooking.buy(quantity);
             totalprice=(price*quantity)-dis;
            System.out.println("Total price with 10% discount is: "+totalprice);
            System.out.println("discount price is: "+dis);
            return dis;
        }
        else{
            ticketBooking.buy(quantity);
            totalprice=quantity*price;
            System.out.println("total price is: "+totalprice);
        }


        return 0;
    }

    public void cancel(){
        this.ticketBooking.cancel();
    }
}
