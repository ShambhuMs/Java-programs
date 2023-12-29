package com.Xworkz.java.practice.Arrays;

public class RepeatedElementCheck {
    public static void main(String[] args) {
        int a[]={1,2,3,1,2,3,4,5,1,6,7,8,9,4,6,3};

        for (int i = 0; i < a.length-1; i++) {
            int count=1;
            if(a[i]!=-1) {//skip elements that have alredy been counted
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = -1;//dupicate element as counted.
                    }
                }

            if(count>1) {
                System.out.println("repeated no: " + a[i] + "  no of times repeated: " + count);

             }
            }
        }


    }
}
