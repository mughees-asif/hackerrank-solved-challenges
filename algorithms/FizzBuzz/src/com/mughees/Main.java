package com.mughees;

public class Main {

    public static void main(String[] args) {
        fizzBuzz(1, 50);
    }

    private static void fizzBuzz (int start, int end) {
        for (int i = start; i <= end; i++) {
            if(i % 15 == 0) {
                System.out.println(i + "\t FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + "\t Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + "\t Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
