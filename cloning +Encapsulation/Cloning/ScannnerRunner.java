package com.Xworkz.Tasks.Cloning;

import  com.Xworkz.Tasks.Cloning.Scanner;

public class ScannnerRunner    {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner1=new Scanner(1,"philips",30000,4.5);
        Scanner sc=(Scanner)scanner1.clone();
        System.out.println(sc);
        System.out.println(scanner1);

    }
}
