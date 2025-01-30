package com.stack_queue;

public class Custom_queue {
   protected int[] data;

   private static final int DEFAULT_SIZE=10;

   public Custom_queue(){
       this(DEFAULT_SIZE);
   }

   public Custom_queue(int size){
       data=new int[size];

   }
   int end=0;

   public boolean isFull(){
       if(end==data.length){
           return true;
       }
       return false;
   }


   public boolean isEmpty(){
       if(end==0){
           return true;
       }
       return false;
   }

   public int insert(int item) throws Exception{
       if(isFull()){
           throw new QueueException("Queue is full!");
       }
       return  data[end++]=item;

   }

   public int removed() throws Exception{
       if(isEmpty()){
           throw new QueueException("Queue is empty");
       }

       int removed=data[0];
       for(int i=1;i<end;i++){
           data[i-1]=data[i];
       }
       return removed;
   }


   public int font() throws Exception{
       if(isEmpty()){
           throw new QueueException("Queue is empty");
       }
       return data[0];
   }

//   public int[] display(){
//       return data;
//    }

    public void display() throws Exception{
       if(isEmpty()){
           throw new QueueException("Queue is empty");
       }
       for(int i=0;i<end;i++){
           System.out.print(data[i] + "->");
       }
    }
}
