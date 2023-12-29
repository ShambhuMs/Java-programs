package com.Xworkz.Tasks.Cloning;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Light implements Cloneable{
    private String lightType;
    private String brand;
    private double price;
    private int warrenty;

    @Override
    protected Light clone() throws CloneNotSupportedException {
        return (Light) super.clone();
    }
}
