package com.Xworkz.java.practice.Recursion;

public class Subsqnce {

     public static void sub(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
         char current=str.charAt(idx);

         sub(str,idx+1,newStr+current);

         sub(str,idx+1,newStr);
     }

    public static void main(String[] args) {
        String str="abc";
        sub(str,0,"");

    }
}
