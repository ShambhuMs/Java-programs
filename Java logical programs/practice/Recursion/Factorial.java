package com.Xworkz.java.practice.Recursion;

public class Factorial {

    public static int calFact(int n) {

            int fact = 1;
            if (n == 1 || n==0) {
                return 1;
            }

          int fac=calFact(n-1);
          fact=fac*n;
          return fact;
        }

    public static void main(String[] args) {
      int val = calFact(5);
        System.out.println(val);
    }
}
