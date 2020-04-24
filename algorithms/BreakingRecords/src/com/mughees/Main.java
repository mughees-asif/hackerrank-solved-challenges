package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startScore = scanner.nextInt();
        int[] scores = new int[startScore];
        for(int i = 0; i < startScore; i++) {
            scores[i] = scanner.nextInt();
        }
        breakingRecords(scores);
    }

    static int[] breakingRecords(int[] scores) {

        int highScore = scores[0];
        int counterHigh = 0;
        int lowScore = scores[0];
        int counterLow = 0;

        for (int score : scores) {
            if (score > highScore) {
                counterHigh++;
                highScore = score;
            }
            if (score < lowScore) {
                counterLow++;
                lowScore = score;
            }
        }
        System.out.println(counterHigh + " " + counterLow);
        return scores;
    }
}
