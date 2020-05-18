package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(squares(3,9));
        System.out.println(squares(17,24));
    }

    static int squares(int a, int b) {
        int counter = 0;
        int sqrt = (int) Math.sqrt(a);
        if(a > b)       return 0;
        while((sqrt * sqrt) <= b) {
            if((sqrt * sqrt) >= a) {
                counter++;
            }
            sqrt++;
        }
        return counter;
    }
}
