package org.example;

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        int res1 = Math.abs(getMinMax(a1)[1] - getMinMax(a2)[0]);
        int res2 = Math.abs(getMinMax(a2)[1] - getMinMax(a1)[0]);

        return Math.max(res1, res2);
    }

    static int[] getMinMax(String[] a) {

        int[] minMaxArr = new int[2];
        int aMax = a[0].length(), aMin = a[0].length();
        for (int i = 0; i < a.length - 1; i++) {
            aMin = Math.min(aMin, Math.min(a[i].length(), a[i + 1].length()));
            aMax = Math.max(aMax, Math.max(a[i].length(), a[i + 1].length()));
        }
        minMaxArr[0] = aMin;
        minMaxArr[1] = aMax;
        return minMaxArr;
    }
}
