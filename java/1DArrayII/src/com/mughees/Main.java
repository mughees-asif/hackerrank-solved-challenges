package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(canWin(3, new int[]{0,0,1,1,1,0}));
        System.out.println(canWin(3, new int[]{0,0,0,0,0}));
        System.out.println(canWin(3, new int[]{0,0,0,1,1,1}));

    }

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    public static boolean isSolvable(int leap, int[] game, int i) {
        if(i >= game.length)    return true;
        if(i < 0 || game[i] == 1)   return false;
        game[i] = 1;

        return isSolvable(leap, game, i+leap)
                || isSolvable(leap, game, i+1)
                || isSolvable(leap, game, i-1);
    }
}
