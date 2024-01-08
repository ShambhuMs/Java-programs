package com.Xworkz.Collection.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OceanCollection {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Indian ocean");
        list.add("Atlantic Ocean");
        list.add("Pacific Ocean");
        list.add("Arctic Ocean");
        list.add("Southern Ocean");
        list.add("Antarctic Ocean");
        list.add("North Atlantic Ocean");
        list.add("South Atlantic Ocean");
        list.add("North Pacific Ocean");
        list.add("South Pacific Ocean");

        Collections.sort(list);
        System.out.println("before sorting");
        for (String s:list
             ) {
            System.out.println(s);
        }

        System.out.println("sorting in desc order....");
        Comparator<String> comparator=new OceanComparator();
        Collections.sort(list,comparator);
        for (String i:list
             ) {
            System.out.println(i);
        }
    }
}
