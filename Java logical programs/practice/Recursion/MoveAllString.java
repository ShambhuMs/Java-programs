package com.Xworkz.java.practice.Recursion;

public class MoveAllString {
    public static void move(String s,int count,int index,String news){

     if(index==s.length()){
         for(int i=0;i<count;i++){
             news=news+"x";
         }
         System.out.println(news);
         return;
     }

     char c=s.charAt(index);
      if(c=='x'){
          count++;
          move(s,count,index+1,news);
      }
      else{
           news=news+c;
          move(s,count,index+1,news);
      }


    }

    public static void main(String[] args) {
        String s="axbxxhdehi";
        move(s,0,0,"");
    }
}
