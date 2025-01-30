package com.first_program;

public class Binary {
    public static void main(String[] args){
        int num=0b1011;
        System.out.printf("The decimal form=%d\n",num);
        System.out.printf("The Octal form=%o\n",num);
        System.out.printf("The Hexadecimal form=%x\n",num);
        System.out.printf("Binary form=%s\n",Integer.toBinaryString(num));

    }
}
