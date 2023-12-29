package com.Xworkz.Tasks;

import com.Xworkz.Task1.Footware;

public class Shoe extends Footware {

    public void setShoe(){
        super.wear();
      //  this.show();
        System.out.println("running setShoe in Shoe...");
    }

    @Override
    protected void show(){
        System.out.println("protected show method is running in Sandals..");
    }


}
