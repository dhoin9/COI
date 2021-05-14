package com.example.demo.coi;

public class Nine {
    public static void main(String[] args) {
        System.out.println(check("MARA", "RAMA"));
        System.out.println(check("BARA", "RAMA"));
        System.out.println(check("mARA", "RAMA"));
    }

    public static boolean check(String a, String b){

        a = a.toLowerCase();// program is not case sensitive
        b = b.toLowerCase();
        if (a.length()!=b.length()){
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            String s = Character.toString(a.charAt(i));
            if (b.contains(s)){
                b.replaceFirst( s,"");
            }else {
                return false;
            }
        }
        return true;
    }
}
