package com.mughees;

public class Main {

    public static void main(String[] args) {
	    int diskNumber = 3;
	    towerOfHanoi(diskNumber, 'A', 'B', 'C');
    }

    private static void towerOfHanoi(int disk, char from, char helper, char to) {
        if(disk == 1) {
            System.out.println("Moving disk #" + disk + " from rod " + from + " to rod " + to);
        }
        else {
            towerOfHanoi(disk - 1, from, to, helper);
            System.out.println("Moving disk #" + disk + " from rod " + from + " to rod " + to);
            towerOfHanoi(disk - 1, helper, from , to);
        }
    }
}
