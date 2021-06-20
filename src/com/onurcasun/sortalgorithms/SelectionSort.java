package com.onurcasun.sortalgorithms;

import com.onurcasun.util.*;

// O(n^2) time complexity - unstable algorithm
public class SelectionSort {

    public static void Sort(){
        System.out.println("**Selection Sort**");

        int[] intArray = ArrayGenerator.GetRandomIntegerArray(10);
        System.out.println("Unsorted Array: ");        
        ConsolePrinter.print(intArray);

        selectionSortImpl(intArray);

        System.out.println("Sorted Array: ");
        ConsolePrinter.print(intArray);
    }

    private static void selectionSortImpl(int[] intArray) {
        for(int unsortedPartitionIndex = intArray.length -1; unsortedPartitionIndex > 0; unsortedPartitionIndex--){

            int largestValueIndex = 0;

            for (int i = 1; i <= unsortedPartitionIndex; i++) {
                if(intArray[i] > intArray[largestValueIndex]){
                    largestValueIndex = i;
                }
            }
            
            swap(intArray, largestValueIndex, unsortedPartitionIndex);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
}
