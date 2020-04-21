package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int[] gradesArray = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            int grade = sc.nextInt();
            if (grade < 38) {
                gradesArray[i] = grade;
            } else {
                int num1 = grade + 1;
                int num2 = grade + 2;
                if (num1 % 5 == 0) {
                    gradesArray[i] = num1;
                } else if (num2 % 5 == 0) {
                    gradesArray[i] = num2;
                } else {
                    gradesArray[i] = grade;
                }
            }
        }
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(gradesArray[i]);
        }
    }
}
