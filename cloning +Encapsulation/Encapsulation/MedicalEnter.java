package com.Xworkz.Tasks.Encapsulation;

public class MedicalEnter {
    public static void main(String[] args) {

        MedicalDTO m1=new MedicalDTO("shashank","prasanna","ns palya","kiran","sameer",120,6.00,11.30,30,2);

        MedicalDTO m2=new MedicalDTO("shashank","arun","ns palya","kiran","sameer",120,6.00,11.30,30,2);
        m1.clone();
       boolean check=m1.equals(m2);
       System.out.println(check);



    }
}
