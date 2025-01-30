package com.dsa;

import java.util.Arrays;

public class Inserction_sort {
    public static void main(String[] args) {
        int[] arr={15,12,9,7,3};
        inserction_sort(arr,arr.length);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));

    }

    static void inserction_sort(int[] arr,int n){
        int temp;
        for(int i=1;i< arr.length;i++){
            temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
    }
}
