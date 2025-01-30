package com.dsa.Recursion;

public class Count_zero {
    public static void main(String[] args) {
        System.out.println(count(30204));
    }

    static int count(int n) {
        return count_zero(n, 0);
    }

    static int count_zero(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return count_zero(n / 10, c + 1);
        }
        return count_zero(n / 10, c);
    }
}