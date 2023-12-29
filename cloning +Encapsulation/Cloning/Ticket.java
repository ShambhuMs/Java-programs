package com.Xworkz.Tasks.Cloning;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Ticket implements Cloneable{
    private String color;
    private int noOfTicket;
    private double priceOfTicket;
    private String theatername;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
