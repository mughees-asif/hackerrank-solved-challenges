package com.mughees;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;

class Scan {
    private byte[] buf = new byte[1024];
    private int index;
    private InputStream in;
    private int total;

    public Scan() {
        in = System.in;
    }

    public int scan() throws IOException {
        if (total < 0)
            throw new InputMismatchException();
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0)
                return -1;
        }
        return buf[index++];
    }

    public int scanInt() throws IOException {
        int integer = 0;
        int n = scan();
        while (isWhiteSpace(n))
            n = scan();
        int neg = 1;
        if (n == '-') {
            neg = -1;
            n = scan();
        }
        while (!isWhiteSpace(n)) {
            if (n >= '0' && n <= '9') {
                integer *= 10;
                integer += n - '0';
                n = scan();
            } else throw new InputMismatchException();
        }
        return neg * integer;
    }

    public double scanDouble() throws IOException {
        double doub = 0;
        int n = scan();
        while (isWhiteSpace(n))
            n = scan();
        int neg = 1;
        if (n == '-') {
            neg = -1;
            n = scan();
        }
        while (!isWhiteSpace(n) && n != '.') {
            if (n >= '0' && n <= '9') {
                doub *= 10;
                doub += n - '0';
                n = scan();
            } else throw new InputMismatchException();
        }
        if (n == '.') {
            n = scan();
            double temp = 1;
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    temp /= 10;
                    doub += (n - '0') * temp;
                    n = scan();
                } else throw new InputMismatchException();
            }
        }
        return doub * neg;
    }

    public String scanString() throws IOException {
        StringBuilder sb = new StringBuilder();
        int n = scan();
        while (isWhiteSpace(n))
            n = scan();
        while (!isWhiteSpace(n)) {
            sb.append((char) n);
            n = scan();
        }
        return sb.toString();
    }

    private boolean isWhiteSpace(int n) {
        if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
            return true;
        return false;
    }
}

public class Main {
    static long fac[] = new long[50001];
    static int m = 1000000007;

    public static void main(String args[]) throws IOException {
        fact();
        Scan s1 = new Scan();
        StringBuilder sb = new StringBuilder();
        String s = s1.scanString();
        int n = s.length();
        int ar[][] = new int[26][n];
        ar[s.charAt(0) - 'a'][0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 26; j++) {
                ar[j][i] = ar[j][i - 1];
            }
            ar[s.charAt(i) - 'a'][i]++;
        }

        int q = s1.scanInt();
        while (q-- != 0) {
            int l = s1.scanInt() - 1;
            int r = s1.scanInt() - 1;
            long count = 0;
            long counte = 0;
            long repeat = 1;
            ArrayList<Long> fe = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                int temp = 0;
                if (l > 0) {
                    temp = ar[i][r] - ar[i][l - 1];
                } else
                    temp = ar[i][r];
                if (temp % 2 != 0) {
                    count++;
                    counte += temp - 1;
                } else {
                    counte += temp;
                }
                if (temp > 1) {
                    fe.add(power(fac[temp / 2], m - 2, m));
                }
            }
            long ans = (fac[(int) (counte / 2)]) % m;
            if (count > 0) {
                ans = (ans * (count % m)) % m;
            }
            for (int i = 0; i < fe.size(); i++) {
                ans = (ans * (fe.get(i))) % m;
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }

    static void fact() {
        int n = 50000;
        int m = 1000000007;
        fac[0] = 1;
        fac[1] = 1;
        for (int i = 2; i <= n; i++) {
            fac[i] = (fac[i - 1] * (long) i) % m;
        }
    }

    static long power(long x, int y, int m) {
        if (y == 0)
            return 1;

        long p = power(x, y / 2, m) % m;
        p = (p * p) % m;

        if (y % 2 == 0)
            return p;
        else
            return (x * p) % m;
    }
}