package com.onurcasun.sortalgorithms;

import com.onurcasun.util.ConsolePrinter;

// Stable algorithm
// O(n) - O(nlogn)
// in place or not, again depends on which sort algorithm is used
public class RadixSort {

    public static void Sort() {

        System.out.println("**Radix Sort**");

        // int[] intArray = new int[] { 4725, 4586, 1330, 8792, 1594, 5729 };
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };

        System.out.println("Unsorted Array: ");
        ConsolePrinter.print(stringsArray);

        radixSortImpl(stringsArray, 26, 5);
        System.out.println("Sorted Array: ");
        ConsolePrinter.print(stringsArray);
    }

    private static void radixSortImpl(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSortSingle(input, i, radix);
        }
    }

    // // covering stabilized counting sort algorithm
    private static void radixSortSingle(int[] input, int position, int radix) {

        int numOfItems = input.length;
        int[] countArray = new int[radix];

        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        // Adjust countArray
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] tempArray = new int[numOfItems];

        for (int tempIndex = numOfItems - 1; tempIndex >= 0; tempIndex--) {
            tempArray[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int i = 0; i < numOfItems; i++) {
            input[i] = tempArray[i];
        }

    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }

    private static void radixSortImpl(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSortSingle(input, i, radix);
        }
    }

    private static void radixSortSingle(String[] input, int position, int radix) {
        int numOfItems = input.length;
        int[] countArray = new int[radix];

        for (String value : input) {
            countArray[getIndex(position, value)]++;
        }

        // Adjust countArray
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] tempArray = new String[numOfItems];

        for (int tempIndex = numOfItems - 1; tempIndex >= 0; tempIndex--) {
            tempArray[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }

        for (int i = 0; i < numOfItems; i++) {
            input[i] = tempArray[i];
        }
    }

    private static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }
}
