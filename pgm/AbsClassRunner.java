package com.Xworkz.pgm;

public class AbsClassRunner extends AbsClass{
     AbsClassRunner() {

    }

     AbsClassRunner(int no) {
        super(no);
    }

    public static void main(String[] args) {
        AbsClassRunner a=new AbsClassRunner();
        AbsClassRunner a1=new AbsClassRunner(20);
        System.out.println(a.name);
        a.nan();
    }
}
