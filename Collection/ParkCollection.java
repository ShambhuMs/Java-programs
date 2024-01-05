package com.Xworkz.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ParkCollection {
    public static void main(String[] args) {
        Collection<String> parkNames=new ArrayList<>();
        parkNames.add("Central Park");
        parkNames.add("Golden Gate");
        parkNames.add("Hyde Park");
        parkNames.add("Yosemite National");
        parkNames.add("Grand Canyon National Park");
        parkNames.add("Yellowstone National Park");
        parkNames.add("Zion National Park");
        parkNames.add("Everglades National Park");
        parkNames.add("Banff National Park");
        parkNames.add("Great Smoky Mountains National Park");
        parkNames.add("High Line Park");
        parkNames.add("Acadia National Park");
        parkNames.add("Arches National Park");
        parkNames.add("Rocky Mountain National Park");
        parkNames.add("Sequoia National Park");
        parkNames.add("Redwood National and State Parks");
        parkNames.add("Mount Rainier National Park");
        parkNames.add("Glacier National Park");
        parkNames.add("Haleakalā National Park");
        parkNames.add("Volcanoes National Park");
        parkNames.add("Bryce Canyon National Park");
        parkNames.add("Mesa Verde National Park");
        parkNames.add("Cuyahoga Valley National Park");
        parkNames.add("Badlands National Park");
        parkNames.add("Joshua Tree National Park");
        parkNames.add("Death Valley National Park");
        parkNames.add("Grand Teton National Park");
        parkNames.add("Seoraksan National Park");
        parkNames.add("Plitvice Lakes National Park");
        parkNames.add("Kruger National Park");
        parkNames.add("Yellowstone National Park");
        parkNames.add("Denali National Park");
        parkNames.add("Everglades National Park");
        parkNames.add("Göreme National Park");
        parkNames.add("Iguaçu National Park");
        parkNames.add("Jiuzhaigou Valley National Park");
        parkNames.add("Kahurangi National Park");
        parkNames.add("Litchfield National Park");
        parkNames.add("Manuel Antonio National Park");
        parkNames.add("Nahanni National Park");
        parkNames.add("Olympic National Park");
        parkNames.add("Pukaskwa National Park");
        parkNames.add("Queulat National Park");
        parkNames.add("Rila Monastery Nature ");
        parkNames.add("Serengeti National Park");
        parkNames.add("Taroko National Park");
        parkNames.add("Ujung Kulon National Park");
        parkNames.add("Val Grande National Park");
        parkNames.add("Waterton Lakes National Park");
        parkNames.add("Xuan Son National Park");
        parkNames.add("Yoho National Park");
        parkNames.add("Zion National Park");

        Iterator<String> iterator=parkNames.iterator();
        while (iterator.hasNext()){
            String str= iterator.next();
            if(str.startsWith("b") || str.endsWith("k")){
                System.out.println(str);
            }
        }
    }
}
