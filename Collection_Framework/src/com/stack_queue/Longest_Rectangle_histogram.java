package com.stack_queue;

import java.util.Stack;

public class Longest_Rectangle_histogram {
    public static void main(String[] args) {
        int[] height={2,1,5,6,2,3};
        int max=0;
        int rectangle_l=histogram(height,max);
        System.out.println(rectangle_l);
    }

    public static int histogram(int[] height,int max){
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=1;i<height.length;i++) {
         while (!stack.isEmpty() && height[i]<height[stack.peek()]){
             max=getMax(height,stack,i,max);
         }
             stack.push(i);


         }

        int i=height.length;
        while (!stack.isEmpty()){
            max=getMax(height,stack,i,max);
        }
        return max;
    }

    public static int  getMax(int[] arr,Stack<Integer> stack,int i,int max){
        int area;
        int popped=stack.pop();
        if(stack.isEmpty()){
            area=arr[popped]*i;

        }else{
            area=arr[popped]*(i-1-stack.peek());
        }

        return Math.max(area,max);
    }
}
