package com.first_program;

import org.w3c.dom.Node;

public class check {
    public static void main(String[] args) {





      class Node{
            int val;
            Node next;
            Node(int val){
                this.val=val;
            }

            Node(int val,Node next){
                this.val=val;
                this.next=next;
            }



        }

        Node head=new Node(8);
        System.out.println(head);

    }
}
