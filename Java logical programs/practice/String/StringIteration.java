package com.Xworkz.java.practice.String;

public class StringIteration {
    public static void main(String[] args) {
        String s="@ShambhU123!/";
        //uppercase letters
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                System.out.print(s.charAt(i));
            }
        }
        // Special chars
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)>=33 && s.charAt(i)<=47) || (s.charAt(i)>=58 && s.charAt(i)<=64 ) ||(s.charAt(i)>=48 && s.charAt(i)<=57) || ( s.charAt(i)>=122 && s.charAt(i)<=126)){
                System.out.print(s.charAt(i));
            }
        }
        // Reverse String
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }

    }
}

