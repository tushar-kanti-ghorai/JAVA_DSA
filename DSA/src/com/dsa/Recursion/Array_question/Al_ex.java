package com.dsa.Recursion.Array_question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Al_ex {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //Adding element
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(1);
        System.out.println(list);

        //get element
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //remove element
        list.remove(2);
        System.out.println(list);

        //between add element
        list.add(2,8);
        System.out.println(list);

        //sorted the array(Ascending)
        Collections.sort(list);
        System.out.println(list);
    }
}
