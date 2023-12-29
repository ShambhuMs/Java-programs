package com.Xworkz.Task1;

public class Sandals extends Footware{


   public void get(){
       super.sale();
       super.wear();
        System.out.println("get method is running in Sandals..");
    }
    @Override
    protected void show(){
        System.out.println("running show-method in sandals..");
    }

    @Override
    void sale(){
       this.naya();
        System.out.println("running sale-method in Sandals..");
    }

    private void naya(){
        System.out.println(" private naya method is running in sandals");
    }

}
