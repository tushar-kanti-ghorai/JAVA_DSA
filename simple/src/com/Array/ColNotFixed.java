package com.Array;
import java.util.*;
public class ColNotFixed {
    public static void main(String[] args) {
        int[][] fixed={
                {1,2,3,4},
                {4,5},
                {0,9,8}
        };


        for(int row=0;row< fixed.length;row++){
            for(int col=0;col<fixed[row].length;col++){
                System.out.print(fixed[row][col]+" ");
            }
            System.out.println();
        }


        for(int row=0;row< fixed.length;row++){
            System.out.println(Arrays.toString(fixed[row]));
        }

    }
}
