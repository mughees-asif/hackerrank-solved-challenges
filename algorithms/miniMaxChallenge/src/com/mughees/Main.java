package com.mughees;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4, 5};
	    int[] arr2 = {454445455, 258445455, 968445455, 638445455, 745489755};
        miniMaxSum(arr);
        miniMaxSum(arr2);
    }
    static void miniMaxSum(int[] arr) {
        // sorting the array to make sure the smallest and largest values are in the correct index
        for(int gap = arr.length/2; gap > 0; gap /= 2) {
            for(int i = 0; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;

                while(j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }
        // calculating the sum of the largest and smallest numbers
        long sum = 0;
        for(long i : arr) {
            sum += i;
        }
        long largest = sum - arr[0];
        long smallest = sum - arr[arr.length-1];
        System.out.println(smallest + " " + largest);
    }

}
