package com.Array;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr={1,2,35,24,5};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,1));

    }

    static int maxRange(int[] arr,int start,int end) {
        int maxValue=arr[start];
        for(int i=start;i<=end;i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return  maxValue;

    }

    static int max(int[] arr){
        int maxValue=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return  maxValue;
    }

}
