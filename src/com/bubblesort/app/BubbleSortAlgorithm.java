package com.bubblesort.app;

public class BubbleSortAlgorithm {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        //Displaying Unsorted Array
        
        System.out.println("Bubble sort\nUnsorted Array: ");
        
        for(int i : intArray) {
        	System.out.print("[" + i + "]" );
        }
        
        breakln();
        
        //Bubble sort
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        
        //Displaying Sorted Array
        System.out.println("Sorted Array:");
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("[" + intArray[i] + "]");
        }
        
        breakln();
        
    }
    
    //Methods
    //Swaping element
    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
    
    //This just print a breakLine
    public static void breakln() {
    	System.out.println();
    }

}
