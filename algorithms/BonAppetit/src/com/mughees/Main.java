package com.mughees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        newList.add(3);
        newList.add(10);
        newList.add(2);
        newList.add(9);
        bonAppetit(newList, 1, 12);
    }

    public static void bonAppetit(List<Integer> bill, int k , int b) {
        int totalBill = 0;
        for (int i : bill) {
            totalBill += i;
        }
        int sharedBill = totalBill - bill.get(k);
        int splitBill = sharedBill / 2;
        if ((splitBill - b) == 0)      System.out.println("Bon Appetit");
        else                           System.out.println(Math.abs(splitBill - b));
    }
}
