package com.Xworkz.Tasks.Cloning;

public class CandleRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Candle candle=new Candle(1,15,45,4.5);
        Candle candle1=(Candle) candle.clone();
        System.out.println(candle);
        System.out.println(candle1);
    }
}
