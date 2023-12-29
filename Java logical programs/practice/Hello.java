package com.Xworkz.java.practice;

public class Hello {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        StringBuilder ref=new StringBuilder("shambhu");
        ref.append(" ");
        ref.append("M ");
        ref.append("S");
        System.out.println(ref);
        System.out.println(ref.charAt(0));
        System.out.println(ref.length());
    }
}
