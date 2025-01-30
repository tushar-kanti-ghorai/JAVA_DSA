package com.stack_queue;

public class Circular_queue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

   public Circular_queue(){
        this(DEFAULT_SIZE);
    }

   public Circular_queue(int size){
        data=new int[size];
    }

    int font=0,end=0,size=0;

    public boolean isFull(){
        return size== data.length;
    }

    public boolean isEmpty(){
        return  size==0;
    }

    public boolean insert(int item){
        if(isFull()){
           return  false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public int removed() throws Exception{
        if(isEmpty()){
         throw new QueueException("circular queue is empty");
        }
        int removed=data[font++];
        font=font%data.length;
        size--;
        return removed;

    }

    public int font_check() throws Exception{
        if(isEmpty()){
            throw new QueueException("circular queue is empty");
        }
        return data[font];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("circular queue is empty");
            return;
        }
        int i=font;
       do{
           System.out.print(data[i]+"->");
           i++;
           i=i%data.length;
       }while (i!=end);
        System.out.println("End");
    }
}
