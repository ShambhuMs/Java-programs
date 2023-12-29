package com.Xworkz.java.practice.Recursion;

public class Fibonacci {
    public static void showFib(int a,int b,int n){
        int c;
       if(n==0){

           return;
       }

        c=a+b;
        System.out.println(c);
        showFib(b,c,n-1);


    }

    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        showFib(a,b,n-2);
    }
}
