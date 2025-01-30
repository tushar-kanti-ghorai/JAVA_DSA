package com.LinkedList;

import java.util.LinkedList;

public class SingleLL {
    private Node head;
    private Node tail;

    int size;
    SingleLL(){
        this.size=0;
    }

    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int val){
        Node node=new Node(val);
        if(size==0){
            insertfirst(val);
            return;
        }
        tail.next=node;
        tail=node;
        size++;
    }


    public void insert(int val,int index){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
      Node node=new Node(val,temp.next);
       temp.next=node;
       size++;
    }


    public int deleteFirst() {
        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;

    }

    public int deleteLast() {
        if(size<=1){
            deleteFirst();
        }
        int val=tail.val;
        Node prevTail=get(size-2);
        tail=prevTail;
        tail.next=null;
        return val;

    }

    public int delete(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.val;
        prev.next=prev.next.next;
        return val;
    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void display(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ->");
            temp=temp.next;
        }
        System.out.println("END");
    }



    private class Node{
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
}
