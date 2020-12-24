package com.mughees;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        System.out.println(validParanthesis("{}()[]"));
        System.out.println(validParanthesis("{}(][]"));
        System.out.println(validParanthesis("{}({[]"));
    }

    private static String validParanthesis(String input) {
        return solve(input) ? "YES" : "NO";
    }

    private static boolean solve(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
                deque.add(input.charAt(i));
            } else {
                if(deque.isEmpty()) {
                    return false;
                }
                if(input.charAt(i) == ')' && deque.peek() != '(' ||
                        input.charAt(i) == '}' && deque.peek() != '{'||
                        input.charAt(i) == ']' && deque.peek() != '[') {
                    return false;
                }
                deque.pop();
            }
        }
        return deque.isEmpty();
    }
}
