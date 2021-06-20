package com.onurcasun.sortalgorithms;

import com.onurcasun.util.ConsolePrinter;

// not in place algorithm
// unstable but can be stable with extra steps
// O(n)
public class CountingSort {
    public static void Sort() {

        System.out.println("**Counting Sort**");

        int[] intArray = new int[] { 1, 10, 3, 8, 2, 9, 3, 4, 7, 6 };

        System.out.println("Unsorted Array: ");
        ConsolePrinter.print(intArray);

        countingSortImpl(intArray, 1, 10);
        
        System.out.println("Sorted Array: ");
        ConsolePrinter.print(intArray);
    }

    private static void countingSortImpl(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
