package com.Xworkz.Tasks.Cloning;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Candle implements Cloneable{
    private int quantity;
    private int noOfCandlesInBox;
    private double cost;
    private double lengthOfCandle;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
