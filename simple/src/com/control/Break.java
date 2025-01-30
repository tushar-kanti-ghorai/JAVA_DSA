package com.control;

public class Break {
    public static void main(String[] args) {
        boolean x=true;
        b11:{
            b12:{
            b13:{
                System.out.println("Block b13");
                if(x){
                    break b12;

                }
            }//end of b13

                System.out.println("block b12");//This statement is not execute for break b12
            }//end of b12
            System.out.println("block b11");
        }//end of b11
        System.out.println("out of block");

    }
}
