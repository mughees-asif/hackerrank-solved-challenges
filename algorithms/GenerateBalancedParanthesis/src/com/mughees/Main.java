package com.mughees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(paranthesis(2));
    }

    // calling function
    private static List<String> paranthesis(int n) {
        List<String> result = new ArrayList<>();
        String output = "";
        solve(n, n, output, result);
        return result;
    }

    // main function
    private static void solve(int open, int close, String output, List<String> result) {

        // base condition
        if(open == 0 && close == 0) {
            result.add(output);
        }

        if(open != 0) {
            String output1 = output;
            output1 += "(";
            solve(open - 1, close, output1, result);
        }

        if(close > open) {
            String output2 = output;
            output2 += ")";
            solve(open, close - 1, output2, result);
        }
    }
}
