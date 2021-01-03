package com.vincentmegia;

import java.util.*;

// Java program to print all permutations using
// Heap's algorithm
public class HeapAlgo {
    //Generating permutation using Heap Algorithm
    private List<String> list = new ArrayList<>();
    public List<String> getList() { return list; }

    public void permutate(String array[], int size) {
        // if size becomes 1 then prints the obtained
        // permutation
        if (size == 1) {
            String value = String.join("", array);
            System.out.println(value);
            list.add(value);
        };

        for (int i=0; i<size; i++) {
            permutate(array, size-1);
            // if size is odd, swap first and last
            // element
            //swap(array[0], array[k-1])
            if (size % 2 == 1) {//odd
                String temp = array[0];
                array[0] = array[size-1];
                array[size-1] = temp;
            } else {// If size is even, swap ith and last
                // element
                //swap(array[0], array[k-1]
                String temp = array[i];
                array[i] = array[size-1];
                array[size-1] = temp;
            }
        }
    }
}


