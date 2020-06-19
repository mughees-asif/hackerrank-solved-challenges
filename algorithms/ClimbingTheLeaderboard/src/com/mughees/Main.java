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
	    ArrayList<Integer> aliceArrayList = new ArrayList<>();
	    for(int i = 0; i < aliceTotalScores; i++) {
	        aliceArrayList.add(scanner.nextInt());
        }

        List<Integer> finalList = new ArrayList<>(playerScores);
        for(int i = 0; i < aliceTotalScores; i++) {
            finalList.add(aliceArrayList.get(i));
            finalList.sort(Collections.reverseOrder());
            Set<Integer> set = new LinkedHashSet<>(finalList);
            finalList.clear();
            finalList.addAll(set);
            System.out.println(finalList.indexOf(aliceArrayList.get(i)) + 1);
        }
    }
}
