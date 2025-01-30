package com.dsa.problem_solving;

import java.util.Arrays;

public class Missing_Number_array {


    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1};
        int[] arr2 = {2, 3, 4};

        int missingElement = findMissingArrayElement(arr1, arr2);
        if (missingElement != -1) {
            System.out.println("Missing element is: " + missingElement);
        } else {
            System.out.println("No missing element found.");
        }
    }

     static int findMissingArrayElement(int[] arr1, int[] arr2) {
         Arrays.sort(arr1);
         Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] != arr2[j]) {
                return arr1[i];
            }
            i++;
            j++;
        }

        return  -1;
    }

}

