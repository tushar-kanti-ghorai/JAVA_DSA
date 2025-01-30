package com.stack_queue;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.SortedMap;

public class stack_main {
    public static void main(String[] args) throws Exception {
        Custom_stack stack=new Custom_stack(6);
        System.out.println("Push....");
        System.out.println(stack.push(56));
        System.out.println(stack.push(66));
        System.out.println(stack.push(69));
        System.out.println(stack.push(67));
        System.out.println(stack.push(63));
        System.out.println(stack.push(78));
        System.out.println("Display");
       stack.display();


        System.out.println("Peek Element");
        System.out.println(stack.peek());
        

        System.out.println("pop....");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }

}
