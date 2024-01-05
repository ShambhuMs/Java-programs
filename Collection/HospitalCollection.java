package com.Xworkz.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HospitalCollection {
    public static void main(String[] args) {

        Collection<String> collection=new ArrayList<>();
        collection.add("Manipal");
        collection.add("Victoria");
        collection.add("Ashaanand");
        collection.add("KMC");
        collection.add("Aditya");
        collection.add("Chinmayi");
        collection.add("Appollo");
        collection.add("Nimhans");
        collection.add("Mangaluru ");

        Iterator<String> itr= collection.iterator();
        while (itr.hasNext()){
           String str= itr.next();
           if(str.endsWith("o") || str.endsWith("O")){
               System.out.println(str);
           }
        }
    }
}
