package com.dsa;

public class Selaction_sort {
        public static void main(String[] args) {
            int arr[]={13,46,24,5,52,20,9};
            int n=arr.length;
            int i,j,min=0;
            for(i=0;i<n-1;i++)
            {
                 min=i;
                for(j=i+1;j<n;j++)
                {
                    if(arr[min]>arr[j])
                    {
                      min=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
            for(i=0;i<n;i++)
            {
                System.out.println(arr[i]);
}
    }
}
