package com.Xworkz.pgm;

public class Guitar {
    public int id;
    public double price;
    public String meterial;


    public Guitar(int id, double price, String meterial) {
        this.id = id;
        this.price = price;
        this.meterial = meterial;
    }
    public void finalizer(){

    }

    @Override
    public String toString() {
        return ("id: " + this.id + "  price: " + this.price + "  meterial: " + this.meterial);
    }

    @Override
    public boolean equals(Object obj) {
        Guitar leftSide=this;
        if(obj!=null){
              if(obj instanceof Guitar){
                  Guitar rightSide=(Guitar)obj;
                  if(leftSide.id==rightSide.id && leftSide.price==rightSide.price){
                      System.out.println("guitar1 & guitar2 are equal..");
                      return true;
                  }
                  else {
                      System.err.println("guitar1 & guitar2 are not equal..");
                  }
              }
              else{
                  System.err.println("its not instance of Guitar..");
              }

        }
        else{
            System.err.println("obj is having null plz add valid data..");
        }
        return false;
    }



}
