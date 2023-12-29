package com.Xworkz.java.practice.Recursion;

public class Sum {

        public static void calculateSum(int i,int n,int sum) {

                if (i == n)
                {
                    sum +=i;
                    System.out.println(sum);
                    return;
                }

                    sum = sum + i;
                    calculateSum(i + 1, n, sum);





        }

    public static void main(String[] args) {
        calculateSum(1,5,0);

    }
}
