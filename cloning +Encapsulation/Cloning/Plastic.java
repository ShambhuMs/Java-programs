package com.Xworkz.Tasks.Cloning;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Plastic implements Cloneable{
    private String name;
    private  Double price;
    private String color;
    private String type;


    @Override
    protected Plastic clone() throws CloneNotSupportedException {
        return (Plastic) super.clone();
    }
}
