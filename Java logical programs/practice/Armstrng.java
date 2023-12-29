package com.Xworkz.java.practice;

public class Armstrng {
    public static void main(String[] args) {
        int num=123;
        int r;
        int sum=0;
        int temp=num;
        while(num>0)
        {
            r=num%10;
            num=num/10;
            sum=sum+r*r*r;
        }
        if(temp==sum) {
            System.out.println("Arm strong");
        }
        else {
            System.out.println("not ");
        }
    }
}
