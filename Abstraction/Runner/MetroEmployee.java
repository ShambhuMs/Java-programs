package com.Xworkz.abstr.Runner;

import com.Xworkz.abstr.MetroRule;

public class MetroEmployee {
    private MetroRule metroRule;

    public MetroEmployee(MetroRule metroRule) {
        this.metroRule = metroRule;
    }

    public void checked(){
        boolean bagcheck=metroRule.bagCheck();
        double recharge= metroRule.rechargeCard();

        if(bagcheck && recharge!=0.0){
            System.out.println("Available to travell");
        }
        else {
            System.out.println("not available");
        }
    }
}
