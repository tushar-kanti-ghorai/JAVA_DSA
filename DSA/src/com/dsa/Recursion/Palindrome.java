package com.dsa.Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.println(palindrome(num));
    }

    static boolean palindrome(int num) {
        return num == re(num);
    }

    static int re(int num) {
        int digit = (int) (Math.log10(num));
        return rev(num, digit);
    }

    static int rev(int num, int digit) {
        if ((num % 10) == num) {
            return num;
        }
        int rem = num % 10;
        return rem * (int) Math.pow(10, digit) + rev(num / 10, digit - 1);
    }
}
