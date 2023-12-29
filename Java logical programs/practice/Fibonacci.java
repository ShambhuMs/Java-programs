package com.Xworkz.java.practice;

public class Fibonacci {
    public static void main(String[] args) {
        int n=7;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n-2;i++){
           int c=a+b;
            a=b;
            b=c;
           System.out.println(c);
        }
    }

}

