package org.example;

public class SmashWords {
    public static String smash(String[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
            if (i != arr.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
