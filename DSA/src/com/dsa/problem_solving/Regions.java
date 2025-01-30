package com.dsa.problem_solving;

import java.util.*;

public class Regions {
    public static void main(String[] args) {

      /*  int size;
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }*/
        int[] arr={10,5,20,10};

        // Create a HashMap to store values and their corresponding indices
        HashMap<Integer, List<Integer>> indexMap = new HashMap<>();

        // Populate the HashMap
        for (int i = 0; i < arr.length; i++) {
            indexMap.putIfAbsent(arr[i], new ArrayList<>());
            indexMap.get(arr[i]).add(i);
        }

        // Sort the keys in descending order
        List<Integer> sortedKeys = new ArrayList<>(indexMap.keySet());
        Collections.sort(sortedKeys, Collections.reverseOrder());

        // Output the indices in the order of sorted keys
        System.out.print("Indices of elements in descending order: ");
        for (int key : sortedKeys) {
            List<Integer> indices = indexMap.get(key);
            for (int index : indices) {
                System.out.print(index + " ");
            }
        }
    }
}
