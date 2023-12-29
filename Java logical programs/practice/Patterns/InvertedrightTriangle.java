package com.Xworkz.java.practice.Patterns;

public class InvertedrightTriangle {
    public static void main(String[] args) {
        int n=6;
        for (int i =1; i <= n; i++) {
            int space=(n-i);
            for (int j = 1; j <=space ; j++) {
                System.out.print(" ");
            }

            for (int j =space+1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
