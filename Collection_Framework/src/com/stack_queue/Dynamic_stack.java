package com.stack_queue;

public class Dynamic_stack extends Custom_stack{
    //Dynamic stack:- stack will never be full

    public Dynamic_stack(){
        super();
    }

    public Dynamic_stack(int size){
        super(size);
    }

    public int push(int item) throws Exception {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
