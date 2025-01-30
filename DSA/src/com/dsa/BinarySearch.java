package com.dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=10;
        binary(arr,0,arr.length-1,target);

    }

    static void binary(int[] arr,int beg,int end,int num){
       int found=0;
        while(beg<=end){
            int mid=(beg+end)/2;
            if(arr[mid]==num){
                System.out.println(num+" number is found at position "+(mid+1));
                found=1;
                break;
            } else if (arr[mid]>num) {
                end=mid-1;
            }else {
                beg = mid + 1;
            }
        }
        if(found==0 && beg>end){
            System.out.println(num+" number is not find out in the array");
        }

        
    }
}
