package com.dsa;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
       int ans= linear(arr, target);
       System.out.println(ans);

    }

    static int  linear(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }else {
            for(int index=0;index<arr.length;index++){
                int element=arr[index];
                if(element==target){
                    return index;
                }

            }
            return -1;
        }


    }
}
