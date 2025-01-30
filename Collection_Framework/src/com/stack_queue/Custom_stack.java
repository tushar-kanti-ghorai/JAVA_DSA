package com.stack_queue;

public class Custom_stack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    public Custom_stack(){
        this(DEFAULT_SIZE);
    }

    public Custom_stack(int size){
        this.data=new int[size];
    }

    int ptr=-1;
   public int  push(int item) throws Exception  {
        if(isFull()){
            throw new StackException("Stack is Overflow");
        }
        ptr++;
        data[ptr]=item;
        return data[ptr];
    }

   public boolean isFull(){
        if(ptr==data.length-1){
            return true;
        }
        return false;
    }




    public int pop() throws Exception{
        if(isEmpty()){
         throw new StackException("Stack is empty");
        }

        return data[ptr--];
    }

    public boolean isEmpty(){
       if(ptr==-1){
           return  true;
       }
       return false;
    }


    public int peek() throws Exception{
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }

        return data[ptr];
    }


    public void display() throws Exception{
       if(isEmpty()){
           throw  new StackException("Stack is empty");
       }
       for(int i=ptr;i>-1;i--){
           System.out.println(data[i]);
       }
    }
    
}
