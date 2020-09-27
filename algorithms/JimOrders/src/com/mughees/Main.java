package com.mughees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int testCases = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
	    for(int i = 0; i < testCases; i++) {
	        int customerNum = scanner.nextInt();
	        int orderNum = scanner.nextInt();
	        int result = customerNum + orderNum;
            list.add(result);
        }

	    ArrayList<Integer> resultList = new ArrayList<>();
	    int length = list.size();
	    for(int i = 0; i < length; i++) {
            int minIndex = list.indexOf(Collections.min(list));
            list.set(minIndex, Collections.max(list) + 1);
            resultList.add(minIndex + 1);
        }

	    for(int value: resultList) {
            System.out.print(value + " ");
        }
    }
}