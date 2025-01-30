package com.dsa.Recursion;

public class O_w_rev {
    public static void main(String[] args) {
      int s= rev(1234,0);
       System.out.println(s);
    }
//    ////1st way

   static int rev(int n,int sum){
      if(n==0){
           return sum;
      }
     int rem=n%10;
       sum=sum*10+rem;
     return rev(n/10,sum);

}
}
