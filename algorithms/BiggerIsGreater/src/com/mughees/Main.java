package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(biggerIsGreater("ab"));
    }

    static String biggerIsGreater(String w) {
        char[] inputStringArr = w.toCharArray();
        int length = inputStringArr.length;
        int endIndex = 0;

        // start from the right most char to find the first char which
        // is smaller than the previous char
        for (endIndex = length - 1; endIndex > 0; endIndex--) {
            if (inputStringArr[endIndex] > inputStringArr[endIndex - 1]) {
                break;
            }
        }
        
        // if no such char is found, then all the chars are in descending order
        // therefore there is no greater string with the same set of chars

        if (endIndex == 0) {
            return "no answer";
        } else {

        }


        return w;
    }
}
