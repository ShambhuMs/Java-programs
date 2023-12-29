package com.Xworkz.NewPackage.Runner;

public class CitizenRuleImp implements CitizenRule {
    @Override
    public String voterId() {
        System.out.println("running voterId");
        return null;
    }

    @Override
    public boolean marksCard() {
        System.out.println("markscard");
        return false;
    }

    @Override
    public boolean nri() {
        System.out.println("nri");
        return false;
    }

    @Override
    public void signalJump() {
        System.out.println("signalJump");
    }

    @Override
    public long validLicense() {
        System.out.println("validLicense");
        return 0;
    }
}
