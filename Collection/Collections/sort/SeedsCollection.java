package com.Xworkz.Collection.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SeedsCollection {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Dried fig");
        list.add("Mustard seeds");
        list.add("Pumpkin seeds");
        list.add("Sunflower seeds");
        list.add("Papaya seeds");
        list.add("Poppy seeds");
        list.add("Psyllium seeds");
        list.add("Sesame seeds");
        list.add("Tomato seeds");
        list.add("Chilli seeds");


        Comparator<String> comparator=new SeedsComparator();
        Collections.sort(list);
        System.out.println("After sorting...");
        for (String i: list) {
            System.out.println(i);
        }

        System.out.println("List after sorting in descending order....");
        Collections.sort(list,comparator);
        for (String i:list) {
            System.out.println(i);
        }
    }
}
