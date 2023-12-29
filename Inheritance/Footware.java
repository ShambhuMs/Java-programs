package com.Xworkz.Task1;

import java.sql.SQLOutput;

public class Footware {

    private void setMethod(){
        System.out.println("private set method is running in Footwear..");
    }

    public void wear(){
        System.out.println("public wear-method is running in Footwear");
    }

    protected void show(){
        this.setMethod();
        System.out.println("protected show method is running in footwear..");
    }

    void sale(){
        System.out.println("sale method is running in Footwear..");
    }


}
