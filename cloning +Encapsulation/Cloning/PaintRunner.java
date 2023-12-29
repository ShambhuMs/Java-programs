package com.Xworkz.Tasks.Cloning;

public class PaintRunner {
    public static void main(String[] args) throws CloneNotSupportedException{
        Paint paint=new Paint("Assian",1,450,"white");
        Paint paint1=(Paint)paint.clone();
        System.out.println(paint);
        System.out.println(paint1);

    }
}
