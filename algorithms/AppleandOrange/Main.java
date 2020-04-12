package com.mughees;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int s = in.nextInt();
            int t = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int m = in.nextInt();
            int n = in.nextInt();

            int n1,n2;
            n1=n2=0;

            int[] apple = new int[m];

            for(int apple_i=0; apple_i < m; apple_i++){
                apple[apple_i] = in.nextInt();
                if( apple[apple_i] +a >=s && apple[apple_i] + a <=t)
                    n1 +=1;
            }

            int[] orange = new int[n];
            for(int orange_i=0; orange_i < n; orange_i++){
                orange[orange_i] = in.nextInt();
                if( orange[orange_i] +b >=s && orange[orange_i] + b <=t)
                    n2 +=1;
            }

            System.out.println(n1);
            System.out.println(n2);
        }
}
