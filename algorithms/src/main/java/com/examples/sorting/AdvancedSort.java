package com.examples.sorting;

import java.util.ArrayDeque;

public class AdvancedSort {

    private static void merge(long[] arr, int lowerBound, int middle, int upperBound) {
        int i;
        ArrayDeque<Long> buffer1 = new ArrayDeque<>();
        ArrayDeque<Long> buffer2 = new ArrayDeque<>();
        for (i = lowerBound; i <= middle; i++) {
            buffer1.add(arr[i]);
        }
        for (i = middle + 1; i <= upperBound; i++) {
            buffer2.add(arr[i]);
        }
        i = lowerBound;
        while (!(buffer1.isEmpty() || buffer2.isEmpty())) {
            if (buffer1.getFirst() <= buffer2.getFirst()) {
                arr[i++] = buffer1.pollFirst();
            } else {
                arr[i++] = buffer2.pollFirst();
            }
        }
        while (!(buffer1.isEmpty())) {
            arr[i++] = buffer1.pollFirst();
        }
        while (!(buffer2.isEmpty())) {
            arr[i++] = buffer2.pollFirst();
        }
    }

    public static long[] mergeSort(long[] arr, int lowerBound, int upperBound) {
        int middle;
        if (lowerBound < upperBound) {
            middle = (lowerBound + upperBound) / 2;
            mergeSort(arr, lowerBound, middle);
            mergeSort(arr, middle + 1, upperBound);
            merge(arr, lowerBound, middle, upperBound);
        }
        return arr;
    }
}
