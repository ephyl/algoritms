package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Быстрая сортировка массива
        int[] unsortedArray = new int[30];
        Random random = new Random();
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = random.nextInt(100);
        }
        System.out.println("Несортированный массив: ");
        System.out.println(Arrays.toString(unsortedArray));

        System.out.println("Сортированный массив: ");
        int[] sortedArray = QuickSortIntArray.qSort(unsortedArray);

        System.out.println(Arrays.toString(sortedArray));
        printDelimiter();

        // Binary search
        System.out.println(BinarySearch.countBinarySearchIterations(sortedArray, unsortedArray[random.nextInt(30)]));
        printDelimiter();


        // Count each character in string
        String countCharsString = "test string test string qwertyuiopkjhgfds";
        Map<Character, Integer> map = CharactersCounting.countCharacter(countCharsString);
        System.out.println("Characters in string:");
        System.out.println("\t" + map);
        printDelimiter();


        // Find Integer Square Root
        System.out.println("Number of Iterations to find integer Square Root Number - 25, and Guess - 1");
        System.out.println("\t" + IntegerSq.anInt(25, 1));
        System.out.println("Number of Iterations to find integer Square Root Number - 125348, and Guess - 300");
        System.out.println("\t" + IntegerSq.anInt(125348, 300));
        printDelimiter();

        // Find maximum difference between 2 String arrays
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        System.out.println("Max difference:");
        System.out.println(MaxDiffLength.mxdiflg(s1, s2));
    }

    static void printDelimiter() {
        System.out.println("==================================================");
    }
}

