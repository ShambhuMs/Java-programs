package com.Xworkz.java.practice.String;

public class PercharChange {
    public static void main(String[] args) {
        String s="xworkzODC";
        String n=" ";
       /* System.out.println(s.replace('o','O'));
        System.out.println(s.replace('O','o'));
        System.out.println(s);*/
        for (int i = 0; i < s.length(); i++) {
            char t=s.charAt(i);
            if ( t== 'O' ) {
                System.out.println(s.replace('O','o'));
                
            }
        }



       /* for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }*/


    }
}
