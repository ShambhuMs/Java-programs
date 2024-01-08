package com.Xworkz.Collection.collections.sort;

import java.util.Comparator;

public class SeedsComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int num=o2.compareTo(o1);
        return num;
    }
}
