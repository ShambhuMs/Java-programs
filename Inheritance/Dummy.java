package com.Xworkz.Task1;

public class Dummy {
  static String name;
   int no;

     void nanu(String name){
       name=name;
        System.out.println("name: "+name);
   }

   static void nanu(int no){
        no=no;
       System.out.println("no is: "+no);
   }


    public static void main(String[] args) {

       nanu(10);
       Dummy d=new Dummy();
       d.nanu("dummy");
       System.out.println("============================");
       if(System.out.printf("Hello world")==null){

       }

       System.out.println("\n ==================================");
        String letters="";
        while(letters.length()!=2){
            letters +='a';
            System.out.print(letters);
        }
        System.out.println("=====================");
        String s="  Whitespace check /ABC   ";
        s=s.trim();
        System.out.println(s);


    }
}
