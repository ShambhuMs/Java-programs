package com.Xworkz.java.practice.Recursion.Advance;

public class Countpath {

    public static int totPath(int i,int j,int m,int n){
       if(i==n || j==m){
           return 0;
       }
        if(i==m-1 && j==n-1){
            return 1;
        }
        int downpath=totPath(i+1,j,m,n);

         int rightpath=totPath(i,j+1,m,n);

         return downpath+rightpath;

    }

    public static void main(String[] args) {
        int m=3,n=3;
       int s= totPath(0,0,m,n);
       System.out.println(s);
    }
}
