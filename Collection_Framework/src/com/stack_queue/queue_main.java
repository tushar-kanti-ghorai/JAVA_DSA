package com.stack_queue;

import java.util.Queue;
import java.util.SortedMap;

public class queue_main {
    public static void main(String[] args) throws Exception {
        Custom_queue queue=new Custom_queue(5);
        System.out.println("Insert.....");
        System.out.println(queue.insert(10));
        System.out.println(queue.insert(20));
        System.out.println(queue.insert(30));
        System.out.println(queue.insert(40));
        System.out.println(queue.insert(50));

        System.out.println(queue.removed());

        System.out.println(queue.font());


        queue.display();

    }

}
