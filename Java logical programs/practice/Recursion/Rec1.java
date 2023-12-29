package com.Xworkz.java.practice.Recursion;

public class Rec1 {

    public static void printNo(int n){
       if(n==6){
           return;
       }
        System.out.println(n);
        printNo(n+1);
    }

    public static void main(String[] args) {
        printNo(1);
    }
}
