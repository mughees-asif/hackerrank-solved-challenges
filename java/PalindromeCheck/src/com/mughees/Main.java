package com.mughees;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        Stack stack = new Stack();
        for (int i = 0; i < A.length(); i++) {
            stack.push(A.charAt(i));
        }
        String reverse = "";
        while(!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }
        if (A.equals(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
