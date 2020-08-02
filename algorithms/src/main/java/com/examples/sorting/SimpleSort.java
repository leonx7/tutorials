package com.examples.sorting;

import com.examples.datastructures.LinkedStack;

public class SimpleSort {

    //The complexity of the algorithm O(N^2);
    public static long[] bubbleSort(long[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    long temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    //The complexity of the algorithm O(N^2);
    public static long[] selectionSort(long[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            long temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    //The complexity of the algorithm O(N^2);
    public static long[] insertionSort(long[] arr) {
        for (int i = 1; i < arr.length; i++) {
            long temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
}




