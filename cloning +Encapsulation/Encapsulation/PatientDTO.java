package com.Xworkz.Tasks.Encapsulation;



public class PatientDTO {
    private String pName;
    private long phNo;
    private String hospName;
    private boolean regularPat;
    private int age;
    private String adress;
    private int wardNo;
    private int bedNo;
    private String gardianName;
    private String disease;

    public PatientDTO() {

    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    public String getHospName() {
        return hospName;
    }

    public void setHospName(String hospName) {
        this.hospName = hospName;
    }

    public boolean isRegularPat() {
        return regularPat;
    }

    public void setRegularPat(boolean regularPat) {
        this.regularPat = regularPat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getWardNo() {
        return wardNo;
    }

    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }

    public int getBedNo() {
        return bedNo;
    }

    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }

    public String getGardianName() {
        return gardianName;
    }

    public void setGardianName(String gardianName) {
        this.gardianName = gardianName;
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "pName='" + pName + '\'' +
                ", phNo=" + phNo +
                ", hospName='" + hospName + '\'' +
                ", regularPat=" + regularPat +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", wardNo=" + wardNo +
                ", bedNo=" + bedNo +
                ", gardianName='" + gardianName + '\'' +
                ", disease='" + disease + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        PatientDTO ref1 = this;
        if (obj != null) {
            if (obj instanceof PatientDTO) {
                PatientDTO ref2 = (PatientDTO) obj;
                if (ref1.phNo == ref2.phNo && ref1.bedNo == ref2.bedNo&& ref1.disease==ref2.disease) {
                    System.out.println("both r same..");
                    return true;
                } else {
                    System.out.println("both r different...");
                }
            } else {
                System.out.println("its not insatnceof PatientDTO");
            }
        } else {
            System.out.println("invalid data...");
        }
        return false;
    }
}
