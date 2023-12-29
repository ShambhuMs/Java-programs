package com.Xworkz.Tasks.Cloning;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Paint implements Cloneable{
    private String brand;
    private int quantity;
    private double price;
    private String color;

    @Override
    protected Paint clone() throws CloneNotSupportedException {
        return (Paint) super.clone();
    }
}
