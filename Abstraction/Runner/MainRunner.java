package com.Xworkz.abstr.Runner;

import com.Xworkz.abstr.MetroRule;

public class MainRunner {
    public static void main(String[] args) {
        MetroRule metroRule1=new MetroRuleimp();
        System.out.println("Id is : "+metroRule1.id);

        MetroRuleimp m=new MetroRuleimp();
        m.bagCheck();
        m.rechargeCard();

        MetroRule metroRule=new MetroRuleimp();
        MetroEmployee metroEmployee=new MetroEmployee(metroRule);
        metroEmployee.checked();

    }
}
