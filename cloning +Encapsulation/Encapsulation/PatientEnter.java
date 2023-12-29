package com.Xworkz.Tasks.Encapsulation;

public class PatientEnter {

    public static void main(String[] args) {
        PatientDTO p1=new PatientDTO();
        p1.setpName("Nitin");
        p1.setPhNo(6364251678l);
        p1.setHospName("Marikamba");
        p1.setRegularPat(true);
        p1.setAge(21);
        p1.setAdress("RR nagar");
        p1.setWardNo(2);
        p1.setBedNo(13);
        p1.setGardianName("abhi");
        p1.setDisease("cancer");
        p1.toString();

        PatientDTO p2=new PatientDTO();
        p2.setpName("Nitin");
        p2.setPhNo(6364251678l);
        p2.setHospName("Marikamba");
        p2.setRegularPat(true);
        p2.setAge(21);
        p2.setAdress("RR nagar");
        p2.setWardNo(2);
        p2.setBedNo(13);
        p2.setGardianName("abhi");
        p2.setDisease("cancer");
        p2.toString();

        boolean r=p1.equals(p2);
        System.out.println(r);

    }
}
