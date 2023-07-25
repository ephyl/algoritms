package org.example;

public class BinarySearch {
    public static int countBinarySearchIterations(int[] arr, int num) {
        int count = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            System.out.println("Попытка №" + ++count);
            int mid = (low + high) / 2;
          //  System.out.println("среднее - " + mid);
            if (arr[mid] < num) {
                low = mid + 1;
                try {
                    Thread.sleep(100);
                  //  System.out.println(high);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else if (arr[mid] > num) {
                high = mid - 1;
                try {
                    Thread.sleep(100);
                   // System.out.println(low);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                return arr[mid];
            }
        }
        return arr[high];

    }
}
