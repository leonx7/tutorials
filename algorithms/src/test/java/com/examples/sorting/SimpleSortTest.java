package com.examples.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SimpleSortTest {

    private static long[] toSort;
    private static long[] sorted;

    @BeforeAll
    public static void initVariables() {
        toSort = new long[]{5, 1, 89, 255, 7, 88, 200, 123, 66};
        sorted = new long[]{1, 5, 7, 66, 88, 89, 123, 200, 255};
    }

    @Test
    void bubbleSort() {
        SimpleSort.bubbleSort(toSort);
        assertArrayEquals(toSort, sorted);
    }

    @Test
    void selectionSort() {
        SimpleSort.selectionSort(toSort);
        assertArrayEquals(toSort, sorted);
    }

    @Test
    void insertionSort() {
        SimpleSort.insertionSort(toSort);
        assertArrayEquals(toSort, sorted);
    }
}