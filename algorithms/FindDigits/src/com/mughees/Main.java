package com.mughees;

public class Main {

    public static void main(String[] args) {

    }

    public static int findDigits(int n) {
        int r = n;
        int count = 0;
        while(r > 0){
            if(r % 10 != 0 && n % (r % 10) == 0) count++;
            r /= 10;
        }
        return count;
    }
}
