package com.mughees;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println(findDay(8,5,2015));
    }

    public static String findDay(int month, int day, int year) {
        String weekDay = null;
        try {
            String date = day + "/" + month + "/" + year;
            Date dayOfWeek = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
            weekDay = simpleDateformat.format(dayOfWeek).toUpperCase();
        } catch (Exception ignored) {

        }
        return weekDay;
    }
}
