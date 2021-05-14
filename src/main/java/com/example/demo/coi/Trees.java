package com.example.demo.coi;

public class Trees {

    public static void main(String[] args) {
        String [] drzewa = {"brzoza", "modrzew", "grab", "buk", "wierzba"};
        for (String str:drzewa ){
            System.out.println(str);
        }
        writeDown(drzewa);
    }

    public static <T> void writeDown(T[] array ){
        for(T t:array ){
            System.out.println(t);
        }
    }
    public static  void met(String ... str){

    }
}
