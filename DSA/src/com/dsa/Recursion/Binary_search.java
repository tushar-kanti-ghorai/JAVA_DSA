package com.dsa.Recursion;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,66,78};
        int target=78;
        System.out.println(search(arr,0,target,arr.length-1));
    }

    static int search(int[] arr,int start,int target,int end){
        if(start>end){
            return -1;

        }
        int mid=start+(end-start)/2;//mid=(start+end)/2
        if(target==arr[mid]){
            return  mid;
        }
        if(target<arr[mid]){
            return search(arr,start,target,mid-1);
        }
        return  search(arr,mid+1,target,end);
    }
}
