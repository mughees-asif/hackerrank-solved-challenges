package com.mughees;

import java.util.*;

public class Main {
    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    int totalPlayers = scanner.nextInt();
	    ArrayList<Integer> playerScores = new ArrayList<>();
	    for(int i = 0; i < totalPlayers; i++) {
	        playerScores.add(scanner.nextInt());
        }

	    int aliceTotalScores = scanner.nextInt();
	    ArrayList<Integer> aliceScores = new ArrayList<>();
	    for(int i = 0; i < aliceTotalScores; i++) {
	        aliceScores.add(scanner.nextInt());
        }

        ArrayList<Integer> finalScores = new ArrayList<>(playerScores);
        for(int i = 0; i < aliceTotalScores; i++) {
            finalScores.add(aliceScores.get(i));
            finalScores.sort(Collections.reverseOrder());
            Set<Integer> set = new LinkedHashSet<>(finalScores);
            finalScores.clear();
            finalScores.addAll(set);
            System.out.println(finalScores.indexOf(aliceScores.get(i)) + 1);
        }
    }
}
