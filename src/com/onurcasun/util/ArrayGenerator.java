package com.onurcasun.util;

import java.util.Random;

public class ArrayGenerator {        
    private static int max = 20;
    private static int min = -20;
    private static Random random = new Random();

    public static int[] GetRandomIntegerArray(int length){        
        int[] intArray = new int[length];

        for (int i = 0; i < length; i++) {
            intArray[i] = GetRandomInt();
        }

        return intArray;        
    }

    public static int[] GetExampleArray(){
        return new int[] {20, 35, -15, 7, 55, 1, -22};
    }

    private static int GetRandomInt(){
        return random.nextInt((max-min) + 1) + min;
    }
}
