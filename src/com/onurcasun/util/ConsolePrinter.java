package com.onurcasun.util;

public class ConsolePrinter {
    public static void print(int[] intArray){
        for (int i = 0; i < intArray.length; i++) {            
            if(i == intArray.length -1){                
                System.out.println(intArray[i]);
            }else{
                System.out.print(intArray[i] + ", ");
            }
        }
    }

    public static void print(String[] intArray){
        for (int i = 0; i < intArray.length; i++) {            
            if(i == intArray.length -1){                
                System.out.println(intArray[i]);
            }else{
                System.out.print(intArray[i] + ", ");
            }
        }
    }
    
}
