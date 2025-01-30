package com.dsa;
//
//public class LinkedList {
//    Node head;
//   class Node{
//       String data;
//       Node next;
//       Node(String data){
//           this.data=data;
//           next=null;
//       }
//   }
//
//   public void addFirst(String data){
//       Node newnode=new Node(data);
//       if(head==null){
//           head=newnode;
//           return;
//       }
//       newnode.next=head;
//       head=newnode;
//
//   }
//
//    public void printlist() {
//
//        if(head==null){
//            System.out.println("List is empty");
//        }
//        Node currentNode=head;
//        while(currentNode!=null){
//            System.out.print(currentNode.data+"->");
//            currentNode=currentNode.next;
//        }
//
//        System.out.println("NULL");
//    }
//
//    public static void main(String[] args) {
//        LinkedList list=new LinkedList();
//        list.addFirst("Tushar");
//        list.addFirst("T");
//        list.addFirst("i");
//        list.printlist();
//    }
//
//}
public class LinkedList {
    public static void main(String[] args) {
        float a=(int)5.0;
        float b=(int)3.0;
        float c=a/b;
        System.out.println(c);

    }

}