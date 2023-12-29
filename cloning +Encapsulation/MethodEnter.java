package com.Xworkz.Tasks;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class MethodEnter {
    public static void main(String[] args) {
       String name=new String("shambhu");
        System.out.println( name.toString());
        System.out.println(name.getBytes());
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.toLowerCase());
        System.out.println( name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println(name.codePointAt(3));
        System.out.println(name.codePointBefore(2));
        System.out.println(name.codePointCount(1,5));
        System.out.println(name.compareTo("ms"));
        System.out.println(name.compareToIgnoreCase("s"));
        System.out.println(name.concat("BC"));
        System.out.println(name.contains("s"));
        System.out.println(name.contentEquals("s"));
        System.out.println(name.contentEquals("BC"));
        System.out.println(name.endsWith("u"));
        System.out.println(name.indexOf(2));
        System.out.println(name.lastIndexOf("u"));
        System.out.println(name.hashCode());
        System.out.println(name.intern());
        System.out.println(name.replace("s","S"));
        System.out.println(name.replaceAll("shambhu","Shambhulinga"));
        System.out.println(name.split("m"));
        System.out.println(name.substring(0));
        System.out.println(name.substring(2,7));
        //System.out.println(name.replaceFirst("M",String.valueOf(0)));


    }
}
