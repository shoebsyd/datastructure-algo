package com.algo;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {12, 35, -1, 1, 55, 10};
        int[] sortedArray = new InsertionSort().sort(array);
        printArray(sortedArray);

    }

    public int[] sort(int[] array) {

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
            firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];

            int i;
            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
               array[i] = array[i - 1];
            }

            array[i] = newElement;
        }

        return array;
    }

    private static void printArray(int[] array) {
        for(int element : array)
            System.out.println(element);
    }

}
