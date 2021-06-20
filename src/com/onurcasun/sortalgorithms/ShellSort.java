package com.onurcasun.sortalgorithms;

import com.onurcasun.util.*;

// O(n^2) Time complexity but it can perform much better than that. depends on the chosen gap value
// unstable algorithm
// Optimized insertion sort
public class ShellSort {
    public static void Sort() {
        System.out.println("**Shell Sort**");

        int[] intArray = ArrayGenerator.GetRandomIntegerArray(10);
        System.out.println("Unsorted Array: ");
        ConsolePrinter.print(intArray);

        shellSortImpl(intArray);

        System.out.println("Sorted Array: ");
        ConsolePrinter.print(intArray);
    }

    private static void shellSortImpl(int[] intArray) {
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {

                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;

                }
                
                intArray[j] = newElement;
            }

        }
    }
}
