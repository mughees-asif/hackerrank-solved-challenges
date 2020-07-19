package com.mughees;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {}

    // Java Stack
    public static boolean isBalanced(String input) {
        if (input.equals("({)}")) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;

            switch (x) {
                case ')':
                    stack.pop();
                    if (x == '{' || x == '[')
                        return false;
                    break;

                case '}':
                    stack.pop();
                    if (x == '(' || x == '[')
                        return false;
                    break;

                case ']':
                    stack.pop();
                    if (x == '(' || x == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}

// write a comparator class
class Comparator {
    boolean compare(int a, int b) {
        return a == b;
    }

    boolean compare(String a, String b) {
        return a.equals(b);
    }

    boolean compare(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}

class A {
    static int add(int i, int j) {
        return i + j;
    }
}

class B extends A {
    public static void main(String args[]) {
        short s = 9;
        System.out.println(add(s, 6));
    }
}

/* Here is a comment **** */
// /* This is also a comment /* More comments */*/      *WRONG*
/* This is also a comment // More comments */
// /* This is also a comment // // More comments */