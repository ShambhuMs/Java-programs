package com.Xworkz.Collection.collections.sort;

import java.util.Comparator;

public class TollComparator implements Comparator<Double> {
    @Override
    public int compare(Double o1, Double o2) {
        int cost=o2.compareTo(o1);
        return cost;
    }
}
