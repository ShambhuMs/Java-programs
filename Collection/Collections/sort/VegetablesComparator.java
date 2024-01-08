package com.Xworkz.Collection.collections.sort;

import java.util.Comparator;

public class VegetablesComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int n=o2.compareTo(o1);
        return n;
    }
}
