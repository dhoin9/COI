package com.example.demo.coi;

import java.time.LocalDate;

public class Pesel {
    public static void main(String[] args) {
//        adult("9912011212");

        System.out.println(adult("033201011212"));
        System.out.println(adult("291209"));
        System.out.println(adult("0325134566"));
        System.out.println(adult("0345134566"));
    }

    public static boolean adult(String str){
        LocalDate todayAdult = LocalDate.now().minusYears(18);
        LocalDate birthday = birthday(str);
        System.out.print("Birthday: "+birthday+ " ");
//        System.out.println(todayAdult.compareTo(birthday));
       if(todayAdult.compareTo(birthday)<0){
           return false;
       }
        return true;
    }
///creating birthday from PESEL, work for XX,XXI and  XXII century;
    public static LocalDate birthday(String str){
        String monthStr = str.substring(2,3);
        int year = 0;
        int month = 0;
        int day = Integer.parseInt(str.substring(4,6));
        if(monthStr.equals("2")||monthStr.equals("3")){
            year = Integer.parseInt(str.substring(0,2))+2000;
            month = Integer.parseInt(str.substring(2,4)) - 20;
        }else if(monthStr.equals("1")||monthStr.equals("2")){
            year = Integer.parseInt(str.substring(0,2))+1900;
            month = Integer.parseInt(str.substring(2,4));
        } else if(monthStr.equals("4")||monthStr.equals("5")){
            year = Integer.parseInt(str.substring(0,2))+2100;
            month = Integer.parseInt(str.substring(2,4)) - 40;
    }
        return LocalDate.of(year,month, day);
    }
}
