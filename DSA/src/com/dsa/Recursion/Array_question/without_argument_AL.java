package com.dsa.Recursion.Array_question;

import java.util.ArrayList;

public class without_argument_AL {
    public static void main(String[] args) {
        int[] arr={1,4,4,5};
        System.out.println(findAllIndex(arr,4,0));
    }

    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans=findAllIndex(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}
