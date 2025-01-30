package com.LinkedList;

public class DoublyLL {
  Node head;
  Node previous;

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        Node(int val,Node next){
            this.val=val;
        }
    }
}
