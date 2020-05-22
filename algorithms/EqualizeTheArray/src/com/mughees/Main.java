package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(equalizeArray(new int[] {3, 3, 2, 1, 3}));
        System.out.println(equalizeArray(new int[] {1,2,2,3}));
    }

    static int equalizeArray(int[] arr) {
        int len = arr.length;
        int[] aux = new int[101];
        for(int i = 0; i < len; i++) {
            int index = arr[i];
            aux[index]++;
        }
        int maxFreqCount = getMaxFreqCount(aux);
        return len - maxFreqCount;
    }

    private static int getMaxFreqCount(int[] aux) {
        int maxFreqCount = Integer.MIN_VALUE;
        for(int freqCount : aux) {
            if(freqCount > maxFreqCount) {
                maxFreqCount = freqCount;
            }
        }
        return maxFreqCount;
    }
}
