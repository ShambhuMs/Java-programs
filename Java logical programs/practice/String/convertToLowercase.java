package com.Xworkz.java.practice.String;

public class convertToLowercase {
    public static void main(String[] args) {
        String s="SHAMBHU";
        //System.out.println(s.toLowerCase());
        char[] ar=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                ar[i]=(char)(s.charAt(i)-'A'+'a');
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
    }
}
