package com.Xworkz.java.practice;

public class factorial {

    public static void factNo(int n){
        int factorial=1;
       for(int i=n;i>=1;i--){
          factorial=factorial*i;

       }
        System.out.println("fact no:"+factorial);
    }
    public static void main(String[] args) {
        factNo(5);
    }
}
