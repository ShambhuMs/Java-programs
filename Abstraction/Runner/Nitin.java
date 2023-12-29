package com.Xworkz.abstr.Runner;

import com.Xworkz.abstr.Mobile;

public class Nitin {
    private Mobile mobile=new MobileImp();
  private  MobileImp mobileImp=new MobileImp();
   public Nitin(){
        System.out.println("no-arg const");
    }

    public Nitin(Mobile mobile) {
        this.mobile = mobile;
    }

    public void showInf(){
        mobile.display();
        mobile.playGame();
        System.out.println("Running showinfo mwthod in Nitin");
    }
}
