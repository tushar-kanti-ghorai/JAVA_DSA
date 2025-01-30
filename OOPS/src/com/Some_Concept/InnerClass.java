package com.Some_Concept;

import com.Method.Static;

import javax.xml.namespace.QName;
import java.util.Stack;

public class InnerClass {
    static class Test{
       static String name;
       Test(String name){
           this.name=name;
       }



    }

    public static void main(String[] args) {
        Test t=new Test("Tushar");
        System.out.println(Test.name);
    }

}
