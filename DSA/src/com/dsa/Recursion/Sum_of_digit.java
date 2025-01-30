package com.dsa.Recursion;

public class Sum_of_digit {
    public static void main(String[] args) {
        int ans= sum_of_digit(1342);
        System.out.println(ans);
    }

    static int sum_of_digit(int n){
        if(n==0){
            return 0;
        }
        return sum_of_digit(n/10)+(n%10);
    }
}
