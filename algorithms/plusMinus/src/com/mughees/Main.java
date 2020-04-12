package com.mughees;

public class Main {

    public static void main(String[] args) {
	    plusMinus(new int[] {-4, 3, -9, 0, 4, 1,});
    }

    static void plusMinus(int[] arr) {

        int posCount = 0 ;
        int negCount = 0 ;
        int zeroCount = 0 ;
        for(int arr_i=0; arr_i < arr.length; arr_i++){

            if(arr[arr_i] > 0){ posCount++;}
            if(arr[arr_i] < 0){ negCount++;}
            if(arr[arr_i] == 0){ zeroCount++;}

        }
        System.out.println((double)posCount/(double)arr.length);
        System.out.println((double)negCount/(double)arr.length);
        System.out.println((double)zeroCount/(double)arr.length);
    }
}
