package com.Method;

public class ProStaticBlock {
    public static void main(String[] args) {
        ProStaticBlock p=new ProStaticBlock();
    }
    ProStaticBlock(){
        System.out.println("constructor");
    }
    {
        System.out.println("instance block");
    }     
    static {
        System.out.println("Static block");
    }
}
