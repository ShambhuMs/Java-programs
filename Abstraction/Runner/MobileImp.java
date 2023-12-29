package com.Xworkz.abstr.Runner;

import com.Xworkz.abstr.Mobile;

public class MobileImp implements Mobile {
    @Override
    public void display() {
        System.out.println("running display method");
    }

    @Override
    public void playGame() {
        System.out.println("running playGame method");
    }
}
