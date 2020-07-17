package com.examples.sorting;

import java.util.ArrayDeque;
import java.util.Arrays;

public class AdvancedSort {

    //The complexity of the algorithm O(N * log N);
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

    //The best-case complexity of the algorithm O(N * log N);
    public static void quickSort(long[] arr, int l, int h) {
        int p;
        if ((h - l) > 0) {
            p = partition(arr, l, h);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, h);
        }
    }

    private static int partition(long[] arr, int lowerBound, int upperBound) {
        int i;
        int pivot;
        int firstHighElement;
        pivot = upperBound;
        firstHighElement = lowerBound;
        for (i = lowerBound; i < upperBound; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, firstHighElement);
                firstHighElement++;
            }
        }
        swap(arr, pivot, firstHighElement);
        return firstHighElement;
    }

    private static void swap(long[] arr, int one, int two) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    //The complexity of the algorithm is in the interval from O(N^3/2) to O( N^7/6);
    public static void shellSort(long[] arr) {
        int inner, outer;
        long temp;
        int h = 1;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < arr.length; outer++) {
                temp = arr[outer];
                inner = outer;
                while (inner > h - 1 && arr[inner - 1] >= temp) {
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
