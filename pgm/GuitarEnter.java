package com.Xworkz.pgm;

public class GuitarEnter {
    public static void main(String[] args) {
       Guitar guitar1=new Guitar(111,5000,"wood");
        Guitar guitar2=new Guitar(112,5000,"wood");
   //  Guitar guitar3=new Guitar(111,5000,"wood");
        System.out.println(guitar1);
        System.out.println(guitar2);
        boolean check=guitar1.equals(guitar2);
        System.out.println("guitar.equals(guitar1) : "+check);
        System.out.println("====================");
        WifiDongal wifi1=new WifiDongal("tcp_link",300,1);
        WifiDongal wifi2=new WifiDongal("Jio",300,1);
        System.out.println(wifi1);
        System.out.println(wifi2);
        boolean check1=wifi1.equals(wifi2);
        System.out.println("wifi1.equals(wifi2): "+check1);
        System.out.println("====================");
        UsbHub us=new UsbHub(2,10,5000);
        UsbHub us1=new UsbHub(2,10,5000);
        System.out.println(us);
        System.out.println(us1);
        boolean check3=us.equals(us1);

        System.gc();
        System.out.println("us.equals(us1): "+check3);
    }
}
