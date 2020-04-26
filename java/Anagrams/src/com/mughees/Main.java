package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String a, String b) {

        // length
        int length = a.length();
        int length2 = b.length();

        // edge cases
        char[] arr1 = a.toLowerCase().trim().toCharArray();
        char[] arr2 = b.toLowerCase().trim().toCharArray();

        if(length != length2) {
            return false;
        } else {
            sort(arr1);
            sort(arr2);

            // check instances of same alphabet
            for (int i = 0; i < length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    // sort the array into alphabetical order
    static void sort(char[] array) {
        for(int i  = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    char temp2 = array[i];
                    array[i] = array[j];
                    array[j] = temp2;
                }
            }
        }
    }
}
