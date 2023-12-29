package com.Xworkz.java.practice.Recursion;

public class Keypad {
   public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

   public static void printComb(String str,int idx,String comb){// comb =new empty string
     if(idx==str.length()){
         System.out.println(comb);
         return;
     }

       char curr=str.charAt(idx);
       String map=keypad[curr-'0'];
       for(int i=0;i<map.length();i++){
           printComb(str,idx+1,comb+map.charAt(i));
       }
   }

    public static void main(String[] args) {
    String str="4";
    printComb(str,0,"");
    }
}
