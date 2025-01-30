package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class MergerSort {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] arr={20,10,30,5,60,6};
//        System.out.println("Enter the elements one by one of the array:");
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }

        divide(arr,0,arr.length-1);
        System.out.println("sorted Array:");
        System.out.println(Arrays.toString(arr));
    }


    static void  divide(int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            divide(arr,left,mid);
            divide(arr,mid+1,right);

            merge(arr,left,mid,right);

        }
    }


    static void merge(int[] arr,int beg,int mid,int end){
        int n1=mid-beg+1;
        int n2=end-mid;

        int[] leftArray=new int[n1];
        int[] rightArray=new int[n2];

        for(int i=0;i<leftArray.length;i++){
            leftArray[i]=arr[beg+i];
        }

        for(int j=0;j<rightArray.length;j++){
            rightArray[j]=arr[mid+1+j];
        }


        int i=0;
        int j=0;
        int k=beg;
         //sorted element in the array
        while(i<leftArray.length && j<rightArray.length){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }else{
                arr[k]=rightArray[j];
                j++;

            }
            k++;
        }


        //Remaining Elements
        while(i<leftArray.length){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        //and also this.....
        while (j<rightArray.length){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }

}
