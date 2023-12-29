package com.Xworkz.abstr.Runner;

import com.Xworkz.abstr.Mobile;

public class ShambhuImpl implements Mobile {
    @Override
    public void display() {
        System.out.println("running display in ShambhuImpl");
    }

    @Override
    public void playGame() {
        System.out.println("running playGame in ShambhuImpl");
    }
}
