package com.dsa.DP;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int[] dp=new int[6];
        Arrays.fill(dp,-1);
        int ans=fibo(5,dp);
        System.out.println(ans);
    }

   static int fibo(int n,int[] dp){
        if(n<2){
            return n;
        }
       if(dp[n]!=-1){
           return dp[n];
       }

    return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);

   }
}
