package com.dsa.Recursion.Array_question;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class Target_value {
    public static void main(String[] args) {
        int[] arr={1,3,4,18,18,9};
        System.out.println(target(arr,18,0));
        System.out.println(target1(arr,18,0));
        System.out.println(fromLastIndex(arr,18,arr.length-1));
        FindIndex(arr,18,0);
        System.out.println(list);
    }
    static int target(int[] arr,int target,int index){
        if(index== arr.length){
            return -1;
        }
       if(arr[index]==target){
           return index;
       }
       return target(arr,target,index+1);
    }

    static boolean target1(int[] arr,int target,int index){
        if(index== arr.length){
            return false;
        }
        if(arr[index]==target){
            return true;
        }
        return target1(arr,target,index+1);
    }

    static int fromLastIndex(int[] arr,int target,int index){
        if(index==-1){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }
        return fromLastIndex(arr,target,index-1);
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static void FindIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        FindIndex(arr,target,index+1);
    }
}

