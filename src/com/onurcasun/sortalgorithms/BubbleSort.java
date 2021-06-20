package com.onurcasun.sortalgorithms;

import com.onurcasun.util.*;

// O(n^2) time complexity - stable algorithm
public class BubbleSort {

    public static void Sort() {
        System.out.println("**Bubble Sort**");

        int[] intArray = ArrayGenerator.GetRandomIntegerArray(5);

        System.out.println("Unsorted Array: ");
        ConsolePrinter.print(intArray);

        bubbleSortImpl(intArray);

        System.out.println("Sorted Array: ");
        ConsolePrinter.print(intArray);
    }

    private static void bubbleSortImpl(int[] intArray) {
        for (int unsortedPartitionIndex = intArray.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
