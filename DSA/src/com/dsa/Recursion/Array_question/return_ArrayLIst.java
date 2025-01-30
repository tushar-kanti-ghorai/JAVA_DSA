package com.dsa.Recursion.Array_question;

import java.util.ArrayList;

public class return_ArrayLIst {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5};
        System.out.println(findAllindex(arr,4,0,new ArrayList<>()));


    }
    static ArrayList<Integer> findAllindex(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
      return  findAllindex(arr,target,index+1,list);
    }
}
