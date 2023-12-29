package com.Xworkz.java.practice.Recursion;

public class Strindex {
    public static int first;
    public static int last;

    public static void findIn(String name,int index,char ele) {
      if(index==name.length()){
          System.out.println(first);
          System.out.println(last);
          return;
      }
      char current=name.charAt(index);
      if(current==ele){
          if(first==-1){
              first=index;
          }
          else {
              last=index;
          }
      }
      findIn(name,index+1,ele);
    }


    public static void main(String[] args) {
        String name="aehahaahsjaak";
        findIn(name,0,'a');

        for(int i=0;i<=name.length();i++){

        }
    }
}
