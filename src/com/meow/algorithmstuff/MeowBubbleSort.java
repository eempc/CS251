package com.meow.algorithmstuff;

import java.util.List;

public class MeowBubbleSort implements Algorithm {


    @Override
    public void run(List<Integer> listToSort) {
        int n = listToSort.size();

        for (int i = 0; i < n - 1; i ++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listToSort.get(j) > listToSort.get(j+1)) {
                    // Swap method 1
                    int temp = listToSort.get(j);
                    listToSort.set(j, listToSort.get(j+1));
                    listToSort.set(j+1, temp);

                    // swap method 2
//                    Collections.swap(listtoSort, j, j+1);

                    // swap method 3
                }
            }
        }
    }

    @Override
    public String name() {
        return this.getClass().getName();
    }
}
