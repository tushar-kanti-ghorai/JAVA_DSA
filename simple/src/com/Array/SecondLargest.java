package com.Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,5,5};
        System.out.println(find(arr));
    }

    public static int find(int[] arr){
        int count=0,l=arr[0],s=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>l){
                s=l;
                l=arr[i];
            }else if(arr[i]<l && arr[i]>s){
                s=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==s){
                count++;
            }
        }
        return count;
    }
}
