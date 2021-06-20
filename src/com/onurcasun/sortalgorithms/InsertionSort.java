package com.onurcasun.sortalgorithms;

import com.onurcasun.util.*;

// O(n^2) time complexity - stable algorithm
public class InsertionSort {
    public static void Sort() {
        System.out.println("**Insertion Sort**");

        int[] intArray = ArrayGenerator.GetRandomIntegerArray(5);
        System.out.println("Unsorted Array: ");
        ConsolePrinter.print(intArray);

        // insertionSortImpl(intArray);
        insertionSortRecursiveImpl(intArray, intArray.length);
        System.out.println("Sorted Array");
        ConsolePrinter.print(intArray);
    }

    private static void insertionSortImpl(int[] intArray) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
    }

    private static void insertionSortRecursiveImpl(int[] input, int countOfNumbers) {

        if(countOfNumbers < 2)
            return;

        insertionSortRecursiveImpl(input, countOfNumbers - 1);

        int newElement = input[countOfNumbers-1];
        int i;

        for (i = countOfNumbers - 1 ; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }

        input[i] = newElement;
       
        System.out.println("-------Step------- New Element: " + newElement + " countOfNumbers: " + countOfNumbers);
        ConsolePrinter.print(input);
        System.out.println("----------------------");
    }
}
