package com.Xworkz.ProductRunner;

import com.Xworkz.NewPackage.Runner.*;

public class ProductEnter {
    public static void main(String[] args) {
        DeliverySellerImp deliverySellerImp=new DeliverySellerImp();
        deliverySellerImp.DeliveryCharge();
        deliverySellerImp.damaged();
        deliverySellerImp.packed();
        deliverySellerImp.replacement();
        System.out.println("===========================");
        DeliveryRule deliveryRule=new DeliverySellerImp();
        deliveryRule.damaged();
        deliveryRule.packed();
        System.out.println("=======================");
        SellerRule sellerRule=new DeliverySellerImp();
        sellerRule.DeliveryCharge();
        sellerRule.replacement();
        System.out.println("=======================");
        System.out.println("=======================");
        System.out.println("=======================");

        CitizenRuleImp citizenRuleImp=new CitizenRuleImp();
        citizenRuleImp.voterId();
        citizenRuleImp.nri();
        citizenRuleImp.marksCard();
        citizenRuleImp.signalJump();
        citizenRuleImp.validLicense();
        CitizenRule citizenRule=(CitizenRule) citizenRuleImp;
        citizenRule.voterId();
        citizenRule.validLicense();
        citizenRule.nri();
        citizenRule.marksCard();
        citizenRule.signalJump();

        Object obj=(Object)citizenRule;

        System.out.println("==============================================================");
        System.out.println("==============================================================");
        System.out.println("==============================================================");

        Contractor contractor=new Contractor();
        contractor.population();
        contractor.wasteManagement();
        contractor.household();
        contractor.industrial();
        contractor.isDeveloping();
        contractor.legalSystem();
        contractor.propertyTax();
        contractor.taxation();
        System.out.println("=======================================");
        MetroContractor metroContractor=new MetroContractor();
        metroContractor.recycling();
        metroContractor.household();
        metroContractor.industrial();
        metroContractor.legalSystem();
        metroContractor.isDeveloping();
        metroContractor.segregation();
        metroContractor.population();
        metroContractor.propertyTax();
        metroContractor.taxation();
        metroContractor.wasteManagement();

    }
}
