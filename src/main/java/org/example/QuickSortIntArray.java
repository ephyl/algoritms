package org.example;

import java.util.ArrayList;
import java.util.List;

public class QuickSortIntArray {
    public static int[] qSort(int[] arr) {
        if (arr.length < 2)
            return arr;
        int less = 0;
        int more = 0;
        int pivot = arr[arr.length / 2 - 1];
        int pivotCount = 0;
        for (int k : arr) {
            if (k > pivot) {
                more++;
            } else if (k < pivot) {
                less++;
            } else {
                pivotCount++;
            }
        }
        int[] resultLess = new int[less];
        int[] resultMore = new int[more];

        int countLess = 0, countMore = 0;
        for (int j : arr) {
            if (j < pivot) {
                resultLess[countLess++] = j;
            } else if (j > pivot) {
                resultMore[countMore++] = j;
            }
        }

        resultLess = qSort(resultLess);
        resultMore = qSort(resultMore);

        int y = 0;
        while (y < less) {
            arr[y] = resultLess[y];
            y++;
        }
        while (pivotCount > 0) {
            arr[y] = pivot;
            pivotCount--;
            y++;
        }
        int x = 0;
        while (x < more) {
            arr[x + y] = resultMore[x];
            x++;
        }
        return arr;
    }

}
