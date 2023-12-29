package com.Xworkz.NewPackage.Runner;

public class DeliverySellerImp implements DeliveryRule,SellerRule {
    @Override
    public boolean damaged() {
        System.out.println("running damaged");
        return false;
    }

    @Override
    public int packed() {
        System.out.println("running packed");
        return 0;
    }

    @Override
    public boolean replacement() {
        System.out.println("running replacemenet");
        return false;
    }

    @Override
    public void DeliveryCharge() {
        System.out.println("running DeliveryCharge");
    }
}
