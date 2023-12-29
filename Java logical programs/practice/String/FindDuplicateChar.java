package com.Xworkz.java.practice.String;

public class FindDuplicateChar {
    public static void main(String[] args) {

        String str="Shambhulinga";


        for (int i = 0; i < str.length();i++) {
            int count=1;
            char current = str.charAt(i);
            if(current!=-1) {
                for (int j = i + 1; j < str.length(); j++) {
                        char jc=str.charAt(j);
                         if(current==str.charAt(j)){
                             count++;
                             jc=(char)-1;
                         }
                }
                if(count>1){
                    System.out.println("repeated element: "+str.charAt(i)+" no of times: "+count);
                }

            }
        }
    }
}
