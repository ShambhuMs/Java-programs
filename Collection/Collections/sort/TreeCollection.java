package com.Xworkz.Collection.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreeCollection {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(44);
        list.add(54);
        list.add(64);
        list.add(33);
        list.add(44);
        list.add(56);
        list.add(23);
        list.add(67);
        list.add(87);
        list.add(49);

        System.out.println(".........Ascending Order.........");
        Collections.sort(list);
        for (Integer i:list
             ) {
            System.out.println(i);
        }

        System.out.println(".........Descending Order.........");
        Comparator<Integer> comparator=new TreeComparator();
        Collections.sort(list,comparator);
        for (int a:list
             ) {
            System.out.println(a);
        }
    }
}
