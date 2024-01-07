package com.Xworkz.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Employee {

    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("Shambhu");
        collection.add("Nitin");
        collection.add("Asis");
        collection.add("Arun");
        collection.add("Sunil");
        collection.add("Prashant");
     //  collection.clear();
        System.out.println(collection.iterator());
        System.out.println("IsEmpty: "+collection.isEmpty());
        System.out.println("Equals: "+collection.equals("shambhu"));
        System.out.println("Contains: "+ collection.contains("Prashant"));
        System.out.println("Hashcode: "+collection.hashCode());
        System.out.println("parallelStream: "+collection.parallelStream());
        System.out.println("Remove: "+collection.remove("Nitin"));
      //  System.out.println("Remove All: "+collection.removeAll(collection));
        System.out.println("Size: "+collection.size());
        System.out.println("toArray Object[]: "+collection.toArray());
        System.out.println("spliterator: "+collection.spliterator());
        System.out.println("before iterator......");
        System.out.println(collection);

        Iterator<String> it=collection.iterator();
        while(it.hasNext()) {
            String str = it.next();
            if (str == "Sunil") {
                it.remove();
            }
        }
        System.out.println("After Iterator....");
        System.out.println(collection);
    }
}
