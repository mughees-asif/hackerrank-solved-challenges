package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(viralAdvertising(4));
    }

    static int viralAdvertising(int n) {
        int peopleReached = 2, peopleSharing = 2;
        for(int i = 1; i < n; i++) {
            peopleReached += (peopleSharing * 3) / 2;
            peopleSharing = (peopleSharing * 3) / 2;
        }
        return peopleReached;
    }
}
