package com.Xworkz.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RadioStation {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Bengaluru");
        collection.add("Mysuru");
        collection.add("Hubli");
        collection.add("Dharwad");
        collection.add("Chennai");
        collection.add("Mangaluru");
        collection.add("Udupi");

        Iterator<String> iterator= collection.iterator();
       /* for (int i = 0; iterator.hasNext() ; i++) {
            String is= iterator.next();
            System.out.println(is);
        }*/

        while (iterator.hasNext()){

            String str=iterator.next();
            if(str.endsWith("d")){
                System.out.println("RadioStation : "+str);
            }
            else {
                System.out.println("not ends with z ");
            }

        }
    }
}