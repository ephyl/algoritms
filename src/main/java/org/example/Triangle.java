package org.example;

public class Triangle {
    static boolean isTriangleNumber(long n) {

        double sq = Math.sqrt(8 * n + 1) * 100;
        double x = Math.round(sq);
        return x % 100 == 0;

    }

    static long recNumber(int iterations) {
        long n = 0;
        int i = 0;
        while (i < iterations) {
            int j = i;
            while (j >= 0) {
                n++;
                j--;
            }
            i++;
        }
        return n;
    }

}
