package com.Xworkz.pgm;

public abstract class AbsClass {

    String name="nanu";
    int no;
AbsClass(){
    System.out.println("iam AbsClass constructor");
}

     AbsClass(int no) {
        this.no = no;
        System.out.println("number is : "+no);
    }

    static void nanMeth(){
       System.out.println("nanMethod");
   }
   void nan(){
       System.out.println("its me ");
   }
}
