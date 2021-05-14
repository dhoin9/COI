package com.example.demo.coi;

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("C");
        System.out.println(getElement(lista1,-1));
    }

    public static String getElement(Object list, int number){
        return ((List)list).get(number).toString();

    }
}
