package com.String;

public class StringBuffered {

    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb =new StringBuffer();
        System.out.println(sb.capacity());

        //constructor 2
        StringBuffer sb2=new StringBuffer("Tushar Ghorai");

        //constructor3
        StringBuffer sb3=new StringBuffer(30);
        System.out.println(sb3.capacity());


        sb.append("Devs");
        sb.append(" is well");

        sb.insert(2,"Rahul");//DeRahulvs is well
        sb.replace(1,5,"Tushar");
        sb.delete(1,5);
        sb.reverse();

        System.out.println(sb.toString());

    }
}
