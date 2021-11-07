package com.meow.algorithmstuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KittyCat {
    public static void myEmpiricalCatAlgorithm() {
        long start = System.nanoTime();
        // do stuff
        long end = System.nanoTime();
        // print result
    }

    // Bubble sort, quadratic runtime
    public static void bubbleCatSort(List<Integer> listtoSort) {
        int n = listtoSort.size();

        for (int i = 0; i < n - 1; i ++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listtoSort.get(j) > listtoSort.get(j+1)) {
                    // Swap method 1
                    int temp = listtoSort.get(j);
                    listtoSort.set(j, listtoSort.get(j+1));
                    listtoSort.set(j+1, temp);

                    // swap method 2
//                    Collections.swap(listtoSort, j, j+1);

                    // swap method 3
                }
            }
        }
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

    // 5.12 Linear runtime
    public static void kittens(int n) {
        int[] kitten = new int[n];
        for (int i = 0; i < n; i++) {
            kitten[i] = i - 1;
//            System.out.println(i);
        }
    }

    public static List<Integer> initList() {
        List<Integer> cats = new ArrayList<>(Arrays.asList(5, 1, 33, 21, 66, 432, 22, 99, 00));
        return cats;
    }

}
