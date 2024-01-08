package com.Xworkz.Collection.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TollCollection {
    public static void main(String[] args) {
        List<Double> list=new ArrayList<>();
        list.add(34.5);
        list.add(44.5);
        list.add(54.5);
        list.add(64.5);
        list.add(33.5);
        list.add(44.5);
        list.add(56.5);
        list.add(23.5);
        list.add(67.5);
        list.add(87.5);
        list.add(49.5);

        System.out.println("..........Ascending order............");
        Collections.sort(list);
        for (Double i:list
             ) {
            System.out.println(i);
        }

        System.out.println("...........After descending order.............");
        Comparator<Double> comparator=new TollComparator();
        Collections.sort(list,comparator);
        for (Double cost:list
             ) {
            System.out.println(cost);
        }
    }
}
