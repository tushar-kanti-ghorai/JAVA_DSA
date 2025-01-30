package com.String;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Some_Method {
    public static void main(String[] args) {
        //remove white spaces
        String sentence="Hi hecfjfj kjdjk jdh";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s",""));

        //split

        String arr="Tushar,Abhijit,Suman";
        String[] names=arr.split(",");
        System.out.println(Arrays.toString(names));

        //rounding off
        DecimalFormat df=new DecimalFormat("00.0000");
        System.out.println(df.format(7.37));
    }
}
