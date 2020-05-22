package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[] {0,0,1,0,0,1,0}));
    }

    static int jumpingOnClouds(int[] c) {
        int minJumps = 0;
        int i = 0;
        while(i < c.length - 1) {
            if (i+2 == c.length || c[i+2] == i) {
                i++;
                minJumps++;
            } else {
                i += 2;
                minJumps++;
            }
        }
        return minJumps;
    }
}
