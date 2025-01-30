package com.dsa;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 6, 8, 1, 5};
        qs(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            qs(arr, low, pivot - 1);
            qs(arr, pivot + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int start = low + 1; // Start from the next element of pivot
        int end = high;
        int pivot = arr[low];

        while (start <= end) { // Use <= to ensure the loop runs correctly
            while (start <= end && arr[start] <= pivot) {
                start++;
            }

            while (start <= end && arr[end] > pivot) {
                end--;
            }

            if (start < end) { // Swap only if start is less than end
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        // Place pivot in the correct position
        arr[low] = arr[end];
        arr[end] = pivot;
        return end;
    }
}
