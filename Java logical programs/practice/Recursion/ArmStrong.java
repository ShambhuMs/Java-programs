package com.Xworkz.java.practice.Recursion;



public class ArmStrong {

    public static int count(int n){
        int count=0;
     while (n!=0){
          count++;
          n=n/10;
        }
        return count;
    }
    public static int calculate(int base,int exp){
        int power=1;
        for(int i=0;i<exp;i++){
            power=power*base;
        }
        return power;
    }
    public static void main(String[] args) { // 1+5+3===1^3+5^3+3^3==153
        int n=153;

        int sum=0;
        int rem=0;
        int n1=n;
       while (n!=0){
           rem=n%10;
           sum=sum+calculate(rem,n);
           n=n/10;
       }
if(n==n1){
    System.out.println("yes");
}
else {
    System.out.println("no");
}


    }
}
