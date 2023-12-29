package com.Xworkz.NewPackage.Runner;

public class RoughImplements implements Rough{
    @Override
    public void pen() {
        Rough.super.pen();
    }

    @Override
    public void nan() {
        System.out.println("its impl");
    }

    public static void main(String[] args) {
        RoughImplements roughImplements=new RoughImplements();
       System.out.println(Rough.num());
        roughImplements.nan();
        roughImplements.pen();
    }

}

