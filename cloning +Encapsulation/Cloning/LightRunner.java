package com.Xworkz.Tasks.Cloning;

public class LightRunner {
    public static void main(String[] args) throws CloneNotSupportedException{
        Light light=new Light("LED Bulb","Philips",120.0,1);
        Light light1=light.clone();
        System.out.println(light);
        System.out.println(light1);
    }
}
