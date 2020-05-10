package com.algo;

public class ShellSort {

    public static void main(String[] args) {

        int[] array = {12, 35, -1, 1, 55, 10};
        int[] sortedArray = new ShellSort().sort(array);
        printArray(sortedArray);

    }

    public int[] sort(int[] array) {

        for(int gap = array.length/2; gap > 0; gap = gap/2) {

            for(int i = gap; i < array.length; i++) {

                int newElement = array[i];
                int j = i;

                while(j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = newElement;

            }

        }

        return array;
    }

    private static void printArray(int[] array) {
        for(int element : array)
            System.out.println(element);
    }

}
