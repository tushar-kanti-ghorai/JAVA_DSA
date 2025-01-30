package com.String;

import java.util.Arrays;

public class check_immutable {
    public static void main(String[] args) {
        int[] a={1,2,3,6};
        int[] b=a;
        b[3]=8;
        System.out.println(Arrays.toString(a));

        String a1="Tushar";
        String b1=a1;
        System.out.println(a1==b1);

    }
}
