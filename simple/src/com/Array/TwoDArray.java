package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));

        }

        int[][] arr2d = new int[3][3];

        //take input from keyboard
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = in.nextInt();
            }
        }

        //given the output(1st)
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }


        //given the output(2nd)
        for (int row = 0; row < arr2d.length; row++) {
            System.out.println(Arrays.toString(arr2d[row]));
        }
        //given the output(3rd)
        for(int[] ar:arr2d){//Here datatype is an array itself which is int type
            System.out.println(Arrays.toString(ar));
        }
    }




    }

