package com.Xworkz.abstr.Runner;

import com.Xworkz.abstr.Mobile;

public class MobileRunner {
    public static void main(String[] args) {
        MobileImp m=new MobileImp();
        m.display();
        m.playGame();
        System.out.println("==============");
        Nitin n=new Nitin();
        n.showInf();
        System.out.println("===================");
        Mobile mobile=new MobileImp();
        Nitin nitin=new Nitin(mobile);
        nitin.showInf();


    }
}
