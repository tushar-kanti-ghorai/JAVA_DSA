package com.dsa;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={1,2,9,4,5};
        bubbleSort(arr,0,arr.length);
        System.out.println("sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr,int b,int n){
        int temp=0;
        for(int i=b;i<n-1;i++){
            int swapped=0;
            for(int j=b;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=1;
                }

            }
            if(swapped==0){
                break;
            }

        }
    }
}
