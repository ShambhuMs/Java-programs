package com.Xworkz.Tasks;

public class Locker{
    String brand;
    String ownerName;
    double cost;

    Locker(String brand,String ownerName,double cost){
        this.brand=brand;
        this.ownerName=ownerName;
        this.cost=cost;
        System.out.println("running String,String,double in locker..");
    }

    @Override
    public String toString() {
        return ("brand: "+this.brand+" ownerName: "+this.ownerName+" cost: "+this.cost);
    }
}

 class Seed{
    String brand;
    int quantity;
    double cost;

    Seed(String brand,int quantity,double cost){
        this.brand=brand;
        this.quantity=quantity;
        this.cost=cost;

    }

    @Override
    public String toString() {
        return ("brand: "+this.brand+" quantity: "+this.quantity+" cost: "+this.cost);
    }
}

class Rice{
    String brand;
    int quantity;
    double cost;

    Rice(String brand,int quantity,double cost){
        this.brand=brand;
        this.quantity=quantity;
        this.cost=cost;

    }

    @Override
    public String toString() {
        return ("brand: "+this.brand+" quantity: "+this.quantity+" cost: "+this.cost);
    }
}

