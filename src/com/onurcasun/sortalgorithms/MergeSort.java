package com.onurcasun.sortalgorithms;

import com.onurcasun.util.*;

// Divide and conquer,
// recursive, has two phases: split and merging
// not in place, 
// O(nlogn), stable algorithm
public class MergeSort {
    public static void Sort() {
        System.out.println("**Merge Sort**");

        int[] intArray = ArrayGenerator.GetRandomIntegerArray(20);
        System.out.println("Unsorted Array: ");
        ConsolePrinter.print(intArray);

        mergeSortImpl(intArray, 0, intArray.length);
        System.out.println("Sorted Array: ");
        ConsolePrinter.print(intArray);

        mergeSortDescImpl(intArray, 0, intArray.length);
        System.out.println("Desc Sorted Array: ");
        ConsolePrinter.print(intArray);
    }

    private static void mergeSortImpl(int[] input, int start, int end) {

        if (end - start < 2)
            return;

        int mid = (end + start) / 2;
        mergeSortImpl(input, start, mid);
        mergeSortImpl(input, mid, end);
        merge(input, start, mid, end);        
    }

    private static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid])
            return;

        int[] tempArray = new int[end - start];
        int tempIndex = 0;
        int i = start;
        int j = mid;

        while (i < mid && j < end) {
            tempArray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, input, start, tempIndex);

    }
    
    private static void mergeSortDescImpl(int[] input, int start, int end) {

        if (end - start < 2)
            return;

        int mid = (end + start) / 2;
        mergeSortDescImpl(input, start, mid);
        mergeSortDescImpl(input, mid, end);        
        mergeDesc(input, start, mid, end);
    }

    private static void mergeDesc(int[] input, int start, int mid, int end) {

        if (input[mid - 1] >= input[mid])
            return;

        int[] tempArray = new int[end - start];
        int tempIndex = 0;
        int i = start;
        int j = mid;

        while (i < mid && j < end) {
            tempArray[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, input, start, tempIndex);

    }
}
