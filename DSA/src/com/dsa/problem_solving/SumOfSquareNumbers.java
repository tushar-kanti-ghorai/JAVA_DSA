package com.dsa.problem_solving;


public class SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }

        int a = 0;
        int b = (int) Math.sqrt(c);

        while (a <= b) {
            long sumOfSquares = (long) a * a + (long) b * b;
            if (sumOfSquares == c) {
                return true;
            } else if (sumOfSquares < c) {
                a++;
            } else {
                b--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(judgeSquareSum(5));  // true, because 1^2 + 2^2 = 5
        System.out.println(judgeSquareSum(3));  // false, because there are no such a and b
        System.out.println(judgeSquareSum(0));  // true, because 0^2 + 0^2 = 0
        System.out.println(judgeSquareSum(1));  // true, because 0^2 + 1^2 = 1
        System.out.println(judgeSquareSum(2));  // true, because 1^2 + 1^2 = 2
        System.out.println(judgeSquareSum(4));  // true, because 0^2 + 2^2 = 4
        System.out.println(judgeSquareSum(1000000000)); // true, large number test
        System.out.println(judgeSquareSum(2147483647)); // false, edge case for large number
    }
}
