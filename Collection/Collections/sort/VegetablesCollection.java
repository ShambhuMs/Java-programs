package com.Xworkz.Collection.collections.sort;

import java.util.*;

public class VegetablesCollection {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Carrot");
        list.add("Betrrot");
        list.add("Tomato");
        list.add("Onion");
        list.add("Chilli");
        list.add("Potato");
        list.add("Ladies finger");
        list.add("Brinjal");
        list.add("Beans");
        list.add("Bitter guard");

        System.out.println(".........Ascending Order..........");
        Collections.sort(list);
        for (String str:list
             ) {
            System.out.println(str);
        }
        System.out.println(".........Descending Order..........");
        Comparator<String> comparator=new VegetablesComparator();
        Collections.sort(list,comparator);
        for (String s:list
             ) {
            System.out.println(s);
        }
    }
}
