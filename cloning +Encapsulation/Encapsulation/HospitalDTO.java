package com.Xworkz.Tasks.Encapsulation;


import java.util.Objects;

public class HospitalDTO {
    private String name;
    private String location;
    private int noOfDocters;
    private String typeOfHsp;
    private double entryfee;
    private int noOfAmbulance;
    private int noOfbed;
    private int noOfPatient;
    private boolean biometric=true;
    private boolean medicalShop;


    public HospitalDTO() {

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name="Asha clinic";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNoOfDocters() {
        return noOfDocters;
    }

    public void setNoOfDocters(int noOfDocters) {
        this.noOfDocters = noOfDocters;
    }

    public String getTypeOfHsp() {
        return typeOfHsp;
    }

    public void setTypeOfHsp(String typeOfHsp) {
        this.typeOfHsp = typeOfHsp;
    }

    public double getEntryfee() {
        return entryfee;
    }

    public void setEntryfee(double entryfee) {
        this.entryfee = entryfee;
    }

    public int getNoOfAmbulance() {
        return noOfAmbulance;
    }

    public void setNoOfAmbulance(int noOfAmbulance) {
        this.noOfAmbulance = noOfAmbulance;
    }

    public boolean biometric() {
        return biometric;
    }

    public void setBiometric(boolean biometric) {
        this.biometric = biometric;
    }

    public boolean medicalShop() {
        return medicalShop;
    }

    public void setMedicalShop(boolean medicalShop) {
        this.medicalShop = medicalShop;
    }

    public int getNoOfbed() {
        return noOfbed;
    }

    public void setNoOfbed(int noOfbed) {
        this.noOfbed = noOfbed;
    }

    public int getNoOfPatient() {
        return noOfPatient;
    }

    public void setNoOfPatient(int noOfPatient) {
        this.noOfPatient = noOfPatient;
    }



    @Override
    public String toString() {
        return ("HospitalDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", noOfDocters=" + noOfDocters +
                ", typeOfHsp='" + typeOfHsp + '\'' +
                ", entryfee=" + entryfee +
                ", noOfAmbulance=" + noOfAmbulance +
                ", noOfbed=" + noOfbed +
                ", noOfPatient=" + noOfPatient +
                ", biometric=" + biometric +
                ", medicalShop=" + medicalShop +
                '}');
    }


    @Override
    public boolean equals(Object obj) {
        HospitalDTO ref1=this;
        if(obj!=null){
            if(obj instanceof HospitalDTO){
                HospitalDTO ref2=(HospitalDTO)obj;
                if(ref1.entryfee==ref2.entryfee &&ref1.biometric==ref2.biometric && ref1.name==ref2.name){
                    System.out.println("both r same..");
                    return true;
                }else {
                    System.out.println("both r different..");
                }

            }
        }
        else {
            System.out.println("insert valid input");
        }
        return false;
    }


}
