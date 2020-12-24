package com.mughees;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        System.out.println(validParanthesis("{[()]}"));
        System.out.println(validParanthesis("{[(])}"));
        System.out.println(validParanthesis("{{[[(())]]}}"));
    }

    private static String validParanthesis(String input) {
        return isValid(input) ? "YES" : "NO";
    }

    private static boolean isValid(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            // push opening brackets onto stack
            if (input.charAt(i) == '(' ||
                    input.charAt(i) == '{' ||
                    input.charAt(i) == '[') {
                deque.add(input.charAt(i));
            } else {
                // no closing bracket match
                if (deque.isEmpty()) {
                    return false;
                }
                // ensure match
                if (input.charAt(i) == ')' && deque.peek() != '(' ||
                        input.charAt(i) == '}' && deque.peek() != '{' ||
                        input.charAt(i) == ']' && deque.peek() != '[') {
                    return false;
                }
                // good match
                deque.pop();
            }
        }
        // in case unmatched bracket is left in the stack
        return deque.isEmpty();
    }
}
