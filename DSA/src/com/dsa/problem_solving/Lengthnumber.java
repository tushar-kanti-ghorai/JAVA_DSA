package com.dsa.problem_solving;

public class Lengthnumber {
    public static void main(String[] args) {
      long  num=2370514708903993L;
       int countNumber=count(num);
        System.out.println(countNumber);
    }

    static int count(long num){
       int count=0;
       while(num>0){
           count++;
           num=num/10;

       }

       return count;
    }
}
