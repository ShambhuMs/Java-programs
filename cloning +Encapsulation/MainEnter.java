package com.Xworkz.Tasks;

public class MainEnter {
    public static void main(String[] args) {

        Lens lens=new Lens("Canon",1,64);
        System.out.println(lens.toString());
        Lens lens1=new Lens("Nikon",2,48);
        System.out.println(lens1.toString());
        System.out.println("--------------");
        Object o=new Object();
        System.out.println(o.toString());
        System.out.println("==========================");
        Locker lock=new Locker("Hitler","Nitin",30);
        lock.toString();
        System.out.println(lock.toString());
        Locker lock1=new Locker("Ozone","Harsha",4000);
        lock1.toString();
        System.out.println(lock1.toString());
        System.out.println("==========================");
        Cotton cot=new Cotton(10,"prasad",120000);
        System.out.println(cot.toString());
        Cotton cot1=new Cotton(20,"Sachin",450000);
        System.out.println(cot1.toString());
        System.out.println("==========================");
        Mic mic=new Mic(4,2,"zebronics");
        System.out.println(mic.toString());
        Mic mic1=new Mic(5,1,"boat");
        System.out.println(mic1.toString());
        System.out.println("==========================");
        Heart heart=new Heart(1,3,"Normal");
        System.out.println(heart.toString());
        Heart heart1=new Heart(2,4,"High");
        System.out.println(heart.toString());
        System.out.println("==========================");
        Seed seed=new Seed("Sunflower",20,100);
        System.out.println(seed.toString());
        Seed seed1=new Seed("Almond",1,10);
        System.out.println(seed1.toString());
        System.out.println("==========================");
        Chain chain=new Chain("Gold",1,48000);
        System.out.println(chain.toString());
        Chain chain1=new Chain("Silver",2,2500);
        System.out.println(chain1.toString());
        System.out.println("==========================");
        Rice rice=new Rice("Basmati",1,32);
        System.out.println(rice.toString());
        Rice rice1=new Rice("SmallRice",2,53);
        System.out.println(rice1.toString());
        System.out.println("==========================");
        Bucket b=new Bucket("Black",1,300);
        System.out.println(b.toString());
        Bucket b1=new Bucket("red",2,600);
        System.out.println(b1.toString());
        System.out.println("==========================");
        Money money=new Money("white","Paper",true);
        System.out.println(money.toString());
        Money money1=new Money("golden","Coin",false);
        System.out.println(money1.toString());
        System.out.println("==========================");
        Spoon spoon=new Spoon(50,"Santoor",180);
        System.out.println(spoon.tostring());
        Spoon spoon1=new Spoon(100,"Jagwar",400);
        System.out.println(spoon1.tostring());
        System.out.println("========================================");
        Bowl bowl=new Bowl(50,"King",130);
        System.out.println(bowl.tostring());
        Bowl bowl1=new Bowl(100,"sky",200);
        System.out.println(bowl1.tostring());
        System.out.println("========================================");
       
    }
}
