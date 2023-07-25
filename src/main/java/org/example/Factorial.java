package org.example;

public class Factorial {
    public static long factorial(int num) {
        int count = 1;
        long sum = 1;
        while (count <= num) {
            sum *= count++;
        }
        return sum;
    }

    public static long factorial2(int num) {
        long result = 1;
        if (num == 1 || num == 0)
            return result;
        result = num * factorial2(num - 1);
        return result;
    }
}
