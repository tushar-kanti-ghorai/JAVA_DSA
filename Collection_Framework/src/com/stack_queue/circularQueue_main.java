package com.stack_queue;

public class circularQueue_main {
    public static void main(String[] args) throws Exception{
        Circular_queue queue=new Dynamic_queue(5);
        System.out.println("Insert....");
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.display();
        System.out.println(queue.removed());
        queue.insert(12);
        queue.display();
    }

}
