package com.Xworkz.abstr.Runner;

import com.Xworkz.abstr.MetroRule;

public class MetroRuleimp implements MetroRule {

    @Override
    public double rechargeCard() {
        System.out.println("running rechargeCard");
        return 100d;
    }

    @Override
    public boolean bagCheck() {
        System.out.println("running bagcheck");
        return true;
    }


}
