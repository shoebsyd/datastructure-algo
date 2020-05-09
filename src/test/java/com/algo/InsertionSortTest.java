package com.algo;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void testSort() {
        int[] inputArray = {12, 35, -1, 1, 55, 10};
        int[] expectedArray = {-1, 1, 10, 12, 35, 55};
        int[] sortedArray = new InsertionSort().sort(inputArray);
        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortWithEqualNumbers() {
        int[] inputArray = {12, 35, -1, 1, 55, -1, 35, 0, 100, -100, 10};
        int[] expectedArray = {-100, -1, -1, 0, 1, 10, 12, 35, 35, 55, 100};
        int[] sortedArray = new InsertionSort().sort(inputArray);
        assertArrayEquals(expectedArray, sortedArray);
    }

}
