package com.algo;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {12, 35, -1, 1, 55, 10};
        int[] sortedArray = new SelectionSort().sort(array);
        printArray(sortedArray);

    }

    public int[] sort(int[] array) {

        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0;
            lastUnsortedIndex--) {

            int indexOfLargest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(array[indexOfLargest] < array[i])
                    indexOfLargest = i;
            }

            swap(array, indexOfLargest, lastUnsortedIndex);
        }

        return array;
    }

    private static void swap(int[] array, int i, int j) {

        if(i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array) {
        for(int element : array)
            System.out.println(element);
    }

}
