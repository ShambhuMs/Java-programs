package com.Xworkz.Tasks.Encapsulation;



public class HospitalEnter {
    public static void main(String[] args) {

        HospitalDTO h1=new HospitalDTO();
        h1.setName("Asha clinic");
        h1.setBiometric(true);
        h1.setEntryfee(250);
        h1.setMedicalShop(true);
        h1.setLocation("BTM 2nd stage");
        h1.setNoOfAmbulance(2);
        h1.setNoOfbed(15);
        h1.setNoOfDocters(3);
        h1.setNoOfPatient(5);
        h1.setTypeOfHsp("General");
        HospitalDTO h2=new HospitalDTO();
        h2.setName("Suhas clinic");
        h2.setBiometric(false);
        h2.setEntryfee(200);
        h2.setMedicalShop(false);
        h2.setLocation("BTM 2nd stage ns palya");
        h2.setNoOfAmbulance(1);
        h2.setNoOfbed(4);
        h2.setNoOfDocters(1);
        h2.setNoOfPatient(5);
        h2.setTypeOfHsp("eye");

        boolean ref=h1.equals(h2);
        System.out.println(ref);

    }
}
