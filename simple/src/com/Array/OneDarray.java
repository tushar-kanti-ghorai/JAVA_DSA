package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class OneDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array of primitives
        int[] a = new int[6];

        System.out.println("Enter 6 elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Elements in the array:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        // Alternatively, you can use Arrays.toString() to print the array
         System.out.println(Arrays.toString(a));
        for(int arr:a){
            System.out.print(arr+" ");
        }


    }
}
