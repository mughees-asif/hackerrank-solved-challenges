package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // read s, t, a, b, m and n
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        // init counting variable
        int num1 = 0;
        int num2 = 0;

        // check if apple falls within region
        int[] apple = new int[m];
        for(int i=0; i < m; i++){
            apple[i] = in.nextInt();
            if( apple[i] + a >= s && apple[i] + a <= t)
                num1++;
        }

        // check if orange falls within region
        int[] orange = new int[n];
        for(int j=0; j < n; j++){
            orange[j] = in.nextInt();
            if( orange[j] + b >= s && orange[j] + b <= t)
                num2++;
        }

        System.out.println(num1);
        System.out.println(num2);
    }
}
