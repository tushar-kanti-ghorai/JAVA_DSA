package com.dsa.Recursion;

public class Fibonacci_series {
    public static void main(String[] args) {
        int ans=fibo(50);
        System.out.println(ans);
    }

    private static int fibo(int n) {
        if(n<2){
            return n;
        }
      return fibo(n-1)+fibo(n-2);
    }
}
