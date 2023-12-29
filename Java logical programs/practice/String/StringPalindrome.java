package com.Xworkz.java.practice.String;

public class StringPalindrome {


    public static void main(String[] args) {
        String s="dad";
        String res="palindrome";
        boolean r=true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                 res="not palindrome";
                 r=false;
                 break;
            }
        }
        System.out.println(res);
        System.out.println(r);

    }
}
