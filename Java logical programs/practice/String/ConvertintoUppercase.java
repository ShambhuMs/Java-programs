package com.Xworkz.java.practice.String;

public class ConvertintoUppercase {
    public static void main(String[] args) {
        String str="xworkz";

        char[] arr=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
               arr[i]=(char)(arr[i]-'a'+'A');
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }
}
