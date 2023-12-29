package com.Xworkz.Tasks.Cloning;

public class PlasticRunner {
    public static void main(String[] args) throws CloneNotSupportedException{
        Plastic plastic=new Plastic("Amees plastic",10.0,"White","Polystyrene");
         Plastic plastic1=plastic.clone();
        System.out.println(plastic1);
        System.out.println(plastic);
    }
}
