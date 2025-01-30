package com.Function_Method;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
            //int a=78;already initialised outside the block in the same method, hence you cannot in initialise again
            a=100;//but you can change the value
            //reassign the original reference variable to some other value
            int c=99;
            //values initialised in this block, will remain block
        }
        int c=55;//anything already initialised inside the block, hence you can again initialise same reference variable but you can't
        // use outside of the block;
        System.out.println(a);
//        System.out.println(c);//cannot use outside the block

 //   same occurs inside the for loop

    }
}
