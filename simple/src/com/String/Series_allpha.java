package com.String;

import java.util.Arrays;

public class Series_allpha {
    public static void main(String[] args) {
//        String series=" ";
//        for(int i=0;i<26;i++){
//            char ch=(char) ('a'+i);
//            series=series+ch;//here evertime creating new object that causes will be waste of memory,so
        //for better solution use String Builder
//        }

//        System.out.println(series);


        //StringBuilder

        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }

        System.out.println(builder.toString());
    }
}


