package com.Xworkz.Tasks.Cloning;

public class TicketRunner {
    public static void main(String[] args) throws CloneNotSupportedException{
        Ticket ticket=new Ticket("Blue",1,120,"triveni");
        Ticket ticket1=(Ticket)ticket.clone();
        System.out.println(ticket1);
        System.out.println(ticket);
    }
}
