package com.dsa.Recursion;

public class Rev_number_given {
    public static void main(String[] args) {
//        rev(1234);
//        System.out.println(sum);
        System.out.println( rev1(1234));
    }
    ////1st way
//    static int sum=0;
//    static void rev(int n){
//        if(n==0){
//            return ;
//        }
//       int rem=n%10;
//        sum=sum*10+rem;
//        rev(n/10);
//    }

    //2nd way
    static int rev1(int n){
        int digit=(int)(Math.log10(n));//get the output is 3 in integer for this number 1234..it's return the boolean
        return reverse(n,digit);

    }
    static int reverse(int n,int digit){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digit)+reverse(n/10,digit-1);

    }
}

