package com.examples.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AdvancedSortTest {

    private static long[] toSort;
    private static long[] sorted;

    @BeforeAll
    public static void initVariables() {
        toSort = new long[]{5, 1, 89, 255, 7, 88, 200, 123, 66};
        sorted = new long[]{1, 5, 7, 66, 88, 89, 123, 200, 255};
    }

    @Test
    void mergeSort() {
        AdvancedSort.mergeSort(toSort, 0, toSort.length - 1);
        assertArrayEquals(sorted, toSort);
    }

    @Test
    void quickSort() {
        AdvancedSort.quickSort(toSort, 0, toSort.length - 1);
        assertArrayEquals(sorted, toSort);
    }

    @Test
    void shellSort() {
        AdvancedSort.shellSort(toSort);
        assertArrayEquals(sorted, toSort);
    }
}