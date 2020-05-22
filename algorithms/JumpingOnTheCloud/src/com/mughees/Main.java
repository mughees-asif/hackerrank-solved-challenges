package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[] {0,0,1,0,0,1,0}));
    }

    static int jumpingOnClouds(int[] c) {
        int minJumps = 0;
        int i = 0;
        while(i < c.length - 3) {
            i += (c[i+2] == 0 ? 2 : 1);
            minJumps++;
        }
        minJumps++;
        return minJumps;
    }
}
