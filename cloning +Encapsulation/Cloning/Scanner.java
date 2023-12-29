package com.Xworkz.Tasks.Cloning;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString

public class Scanner implements Cloneable{
    private int quantity;
    private String brand;
    private double price;
    private double rating;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
