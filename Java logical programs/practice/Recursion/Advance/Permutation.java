package com.Xworkz.java.practice.Recursion.Advance;

public class Permutation {

    public static void per(String str,String perm){
     if(str.length()==0){
         System.out.println(perm);
         return;
     }

        for (int i=0;i<str.length();i++){
            char cur=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            per(newStr,perm+cur);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        per(str,"");
    }
}
