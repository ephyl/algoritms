package org.example;

public class IntegerSq{
    public static int anInt(long n, long guess ){
        long x = guess;
        int e = 1;
        long y = 0;
        long z = Long.MAX_VALUE;
        int count=0;
        while(z>e){
            y = x;
//            System.out.println("До вычисления  - " +x);
            x = (long) Math.floor((x + n / x) / 2);
//            System.out.println("После вычисления  - " +x);
            z=Math.abs(y-x);
            count++;
        }
        return count;
    }

}
