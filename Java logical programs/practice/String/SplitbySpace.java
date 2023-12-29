package com.Xworkz.java.practice.String;

public class SplitbySpace {

   /* @Override
    public String toString() {
        return "RemoveSpace{}";
    }*/

    public static void main(String[] args) {
        String s="Hello how are  you";
        String[] w=s.split(" ");
        for (int i=0;i< w.length;i++) {

                System.out.println(w[i]);

        }

        }
    }

