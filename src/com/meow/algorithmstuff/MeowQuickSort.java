package com.meow.algorithmstuff;

import java.util.Collections;
import java.util.List;

public class MeowQuickSort implements Algorithm {

    @Override
    public void run(List<Integer> listToSort) {
        kittyQuickSort(listToSort, 0, listToSort.size()-1);
    }

    // QUick sort https://en.wikipedia.org/wiki/Quicksort
    // Start from index 0, up to size() -1

    public static List<Integer> kittyQuickSort(List<Integer> array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            kittyQuickSort(array, low, pivot - 1);
            kittyQuickSort(array, pivot + 1, high);
        }

        return array;
    }

    public static int partition(List<Integer> array, int low, int high) {
        int pivot = array.get(high); // element to be placed at right position
        int i = low - 1; // index of smaller element
        for (int j = low; j <= high - 1; j++) {
            if (array.get(j) <= pivot) {
                i++; // index
                Collections.swap(array, i, j);
            }
        }
        Collections.swap(array,i+1, high);
        return i + 1;
    }

    @Override
    public String name() {
        return this.getClass().getName();
    }
}
