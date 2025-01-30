package com.String;

public class Reverse_String {
    public static void main(String[] args) {
        String str="Tushar";
        System.out.println(reverse(str));
    }

    static String reverse(String str){
        char[] charArray=str.toCharArray();
        for(int i=0;i<charArray.length/2;i++){
            char temp=charArray[i];
            charArray[i]=charArray[charArray.length-1-i];
            charArray[charArray.length-1-i]=temp;

        }
        return new String(charArray);
    }

}
