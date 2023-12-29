package com.Xworkz.Task1;

public class AsisTask {
    public static void main(String[] args) {
        int num = 534;
        int rem = 0;
        int res = 0;
        while (num > 0) {
            rem = num % 10;
            res = res + rem;
            num = num / 10;
        }
        System.out.println(res);

        
        int newRes = 0;
        while (res >0) {
                rem = res % 10;
                newRes = newRes + rem;
            res=res/10;
        }
        System.out.println(newRes);

    }

}
