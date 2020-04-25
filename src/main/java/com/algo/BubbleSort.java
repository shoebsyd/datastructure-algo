package com.algo;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {12, 35, -1, 1, 55, 10};
        int[] sortedArray = new BubbleSort().sort(array);
        printArray(sortedArray);

    }

    public int[] sort(int[] array) {
        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0;
            lastUnsortedIndex--) {

            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(array[i] > array[i+1])
                    swap(array, i, i+1);
            }

        }

        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array) {
        for(int element : array)
            System.out.println(element);
    }

}
