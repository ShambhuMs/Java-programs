package com.Xworkz.Collection.collections.sort;

import java.util.Comparator;

public class TreeComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int age=o2.compareTo(o1);
        return age;
    }
}
