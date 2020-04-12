package com.mughees;

public class Main {

    public static void main(String[] args) {
	kangaroo(0, 2, 5, 3);
    }

    static String meetingPoint(int k2Start, int k2Jump, int k1Start, int k1Jump) {
        while(k2Start != k1Start) {
            k1Start = k1Start + k1Jump;
            k2Start = k2Start + k2Jump;
            if(k2Start > k1Start) {
                break;
            }
        }
        if(k2Start == k1Start) {
            return "YES";
        } else {
            return "NO";
        }
    }
    
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if((x1 > x2 && v2 > v1) || (x1 > x2 && v1 > v2)) {
            return "NO";
        } else if (x1 > x2) {
            return meetingPoint(x2, v2, x1, v1);
        } else {
            return meetingPoint(x1, v1, x2, v2);
        }
    }
}
