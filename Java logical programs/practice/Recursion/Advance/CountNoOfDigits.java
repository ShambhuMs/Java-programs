package com.Xworkz.java.practice.Recursion.Advance;

public class CountNoOfDigits {

    public static void main(String[] args) {
        int n=153;
        int reminder = 0;
        int count=0;
        while(n!=0){
            reminder=n%10;

            count++;
            n=n/10;
        }
        System.out.println(reminder);
    }

}
