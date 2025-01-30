package com.stack_queue;

public class Dynamic_queue extends Circular_queue {
    public Dynamic_queue(){
        super();
    }

    public Dynamic_queue(int size){
        super(size);
    }


    @Override
    public boolean insert(int item) {
        if(isFull()){
            int[] temp=new int[data.length*2];
            for(int i=font;i< data.length;i++){
                temp[i]=data[(font+i)% data.length];

            }

            font=0;
            end= data.length;
            data=temp;
        }
        return super.insert(item);
    }
}
