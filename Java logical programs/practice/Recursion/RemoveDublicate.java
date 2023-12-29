package com.Xworkz.java.practice.Recursion;

public class RemoveDublicate {
   public static boolean[] arr=new boolean[26];
    public static void findDub(String s,int idx,String newStr){
       if(idx==s.length()){

           System.out.println(newStr);
           return;
       }
        char c=s.charAt(idx);
        if(arr[c-'a']){
                findDub(s,idx+1,newStr);
            }
            else {
                newStr=newStr+c;
                arr[c-'a']=true;
                findDub(s,idx+1,newStr);
            }


    }

    public static void main(String[] args) {
       String s="abbacadbbcd";
       findDub(s,0,"");
    }
}
