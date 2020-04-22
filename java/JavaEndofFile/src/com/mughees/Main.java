package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(counter + " " + input);
            counter++;
        }
    }
}
