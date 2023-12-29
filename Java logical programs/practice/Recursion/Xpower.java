package com.Xworkz.java.practice.Recursion;

public class Xpower {

    public static int calPower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int pwrm1=calPower(x,n-1);
        int pwr=x * pwrm1;
        return pwr;
    }

    public static void main(String[] args) {

         System.out.println(calPower(2,5));
    }
}
