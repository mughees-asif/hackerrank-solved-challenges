package com.mughees;

import java.util.Arrays;

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
            int firstSmallChar = inputStringArr[endIndex - 1];
            int nextSmallChar  = endIndex;

            // find the smallest char on right side of the [endIndex - 1]'th char
            // which is greater than inputStringArr[endIndex - 1]
            for(int startIndex = endIndex + 1; startIndex < length; startIndex++) {
                if(inputStringArr[startIndex] > firstSmallChar &&
                inputStringArr[startIndex] < inputStringArr[nextSmallChar]) {
                    nextSmallChar = startIndex;
                }
            }

            // swap the next smallest char with inputStringArr[endIndex - 1]
            swap(inputStringArr, endIndex -1, nextSmallChar);

            // sort the half of the inputStringArr (after [endIndex - 1]) in
            // ascending order
            Arrays.sort(inputStringArr, endIndex, length);
        }
        return new String(inputStringArr);
    }

    static void swap (char[] input, int index, int smallestChar) {
        char temp = input[index];
        input[index] = input[smallestChar];
        input[smallestChar] = temp;
    }
}
