package com.Xworkz.Tasks.Encapsulation;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Objects;

public class MedicalDTO {

    private String mName;
    private String ownerName;
    private  String location;
    private String employeeName;
    private String customerName;
    private int totalNoOfMedicines;
    private double openTime;
    private double closeTime;
    private int noOfCompartments;
    private int noOfFridge;


    MedicalDTO(){

    }

    public MedicalDTO(String mName, String ownerName, String location, String employeeName, String customerName, int totalNoOfMedicines, double openTime, double closeTime, int noOfCompartments, int noOfFridge) {
        this.mName = mName;
        this.ownerName = ownerName;
        this.location = location;
        this.employeeName = employeeName;
        this.customerName = customerName;
        this.totalNoOfMedicines = totalNoOfMedicines;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.noOfCompartments = noOfCompartments;
        this.noOfFridge = noOfFridge;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTotalNoOfMedicines() {
        return totalNoOfMedicines;
    }

    public void setTotalNoOfMedicines(int totalNoOfMedicines) {
        this.totalNoOfMedicines = totalNoOfMedicines;
    }

    public double getOpenTime() {
        return openTime;
    }

    public void setOpenTime(double openTime) {
        this.openTime = openTime;
    }

    public double getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(double closeTime) {
        this.closeTime = closeTime;
    }

    public int getNoOfCompartments() {
        return noOfCompartments;
    }

    public void setNoOfCompartments(int noOfCompartments) {
        this.noOfCompartments = noOfCompartments;
    }

    public int getNoOfFridge() {
        return noOfFridge;
    }

    public void setNoOfFridge(int noOfFridge) {
        this.noOfFridge = noOfFridge;
    }

    @Override
    public String toString() {
        return "MedicalDTO{" +
                "mName='" + mName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", location='" + location + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalNoOfMedicines=" + totalNoOfMedicines +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", noOfCompartments=" + noOfCompartments +
                ", noOfFridge=" + noOfFridge +
                '}';
    }

    @Override
    protected Object clone(){
        System.out.println("running");
        return "null";
    }


    @Override
    public boolean equals(Object obj) {
        MedicalDTO med1=this;
        if(obj!=null){
            if(obj instanceof MedicalDTO){
                MedicalDTO med2=(MedicalDTO) obj;
                if(med1.mName==med2.mName && med1.totalNoOfMedicines==med2.totalNoOfMedicines && med1.ownerName==med2.ownerName){
                    System.out.println("both r same..");
                    return true;
                }
                else{
                    System.out.println("both r different..");
                }
            }
        }
        return false;
    }

}
