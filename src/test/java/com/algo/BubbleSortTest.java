package com.algo;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
:wq!
    @Test
    public void testSort() {
        int[] inputArray = {12, 35, -1, 1, 55, 10};
        int[] expectedArray = {-1, 1, 10, 12, 35, 55};
        int[] sortedArray = new BubbleSort().sort(inputArray);
        assertArrayEquals(expectedArray, sortedArray);
    }

}
