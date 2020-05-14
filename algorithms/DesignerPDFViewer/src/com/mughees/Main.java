package com.mughees;

public class Main {

    public static void main(String[] args) {
        int[] test = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5,
                5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        System.out.println(designerPdfViewer(test, "zaba"));
    }

    public static int designerPdfViewer(int[] h, String word) {
        int stringWidth = word.length();
        int maxHeight = 0;
        for(int i = 0; i < stringWidth; i++) {
            char tempChar = word.charAt(i);
            maxHeight = Math.max(maxHeight, h[tempChar - (int)'a']);
        }
        return maxHeight * stringWidth;
    }
}