package com.onurcasun.sortalgorithms;

import com.onurcasun.util.*;

// Divide and conquer,
// in place but not stable algorithm
// O(nlogn)
public class QuickSort {

    public static void Sort() {
        System.out.println("**Quick Sort**");

        int[] intArray = ArrayGenerator.GetExampleArray();
        System.out.println("Unsorted Array: ");
        ConsolePrinter.print(intArray);

        QuickSortImpl(intArray, 0, intArray.length);
        System.out.println("Sorted Array: ");
        ConsolePrinter.print(intArray);
    }

    public static void QuickSortImpl(int[] input, int start, int end) {
        if (end - start < 2)
            return;

        int pivotIndex = partition(input, start, end);
        QuickSortImpl(input, start, pivotIndex);
        QuickSortImpl(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {
        // Using first element of sub-array as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: Empty loop body for decrement j.
            while (i < j && input[--j] >= pivot)
                ;
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: Empty loop body for increment i.
            while (i < j && input[++i] <= pivot)
                ;
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }

}
