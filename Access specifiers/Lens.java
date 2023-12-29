package com.Xworkz.Tasks;

public class Lens {
   String brand;
    int quantity;
    int lensPoint;

   public Lens(String brand, int quantity, int lensPoint){
        this.brand=brand;
        this.quantity=quantity;
        this.lensPoint=lensPoint;
        System.out.println("Running String,int,int in lens..");
    }

    @Override
    public String toString() {
        return ("Info :   brand:"+this.brand+" quantity: "+this.quantity+" lenspoint:"+this.lensPoint);
    }
}

class Cotton{
    int size;
    String sellerName;
    double cost;

    Cotton(int size,String sellerName,double cost){
        this.size=size;
        this.sellerName=sellerName;
        this.cost=cost;
    }
    @Override
    public String toString(){
        return ("size: "+this.size+" sellerName: "+this.sellerName+"cost: "+this.cost);
    }
}

class Mic{
    int soundPoint;
    int quantity;
    String brand;

    Mic(int soundPoint,int quantity,String brand){
        this.soundPoint=soundPoint;
        this.quantity=quantity;
        this.brand=brand;
    }
    @Override
    public String toString(){
        return ("soundPoint: "+this.soundPoint+" quantity: "+this.quantity+" brand: "+this.brand);
    }

}

    class Heart{
        int bloodPoint;
        int pulseRate;
        String bloodPressure;

        Heart(int bloodPoint,int pulseRate,String bloodPressure){
        this.bloodPoint=bloodPoint;
        this.pulseRate=pulseRate;
        this.bloodPressure=bloodPressure;
        }
        @Override
        public String toString(){
        return ("bloodPoint: "+this.bloodPoint+" pulseRate: "+this.pulseRate+" brand: "+this.bloodPressure);
        }

  }

class Chain{
    String type;
    int quantity;
    double cost;

    Chain(String type,int quantity,double cost){
        this.type=type;
        this.quantity=quantity;
        this.cost=cost;
    }
    @Override
    public String toString(){
        return ("type: "+this.type+" quantity: "+this.quantity+" cost: "+this.cost);
    }

}

class Bucket{
    String color;
    int quantity;
    double cost;

    Bucket(String color,int quantity,double cost){
        this.color=color;
        this.quantity=quantity;
        this.cost=cost;
    }
    @Override
    public String toString(){
        return ("color: "+this.color+" quantity: "+this.quantity+" cost: "+this.cost);
    }

}

class Money{
    String color;
    String type;
    boolean digitalMoney;

    Money(String color,String type,boolean digitalMoney){
        this.color=color;
        this.type=type;
        this.digitalMoney=digitalMoney;
    }
    @Override
    public String toString(){
        return ("color: "+this.color+" type: "+this.type+" digitalMoney: "+this.digitalMoney);
    }

}
