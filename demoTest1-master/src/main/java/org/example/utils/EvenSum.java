package org.example.utils;

public class EvenSum {

    public static int calculateEvenSum(int n) {

        if (n < 2) {
            return 0;
        }

        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            if (i % 8 != 0) {
                sum += i;
            }
        }

        return sum;
    }
    public static int calculateOddSum(int[] so) {
        if (so == null || so.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int sum = 0;
        for (int i = 0; i < so.length; i++) {
            if (i % 2 != 0) {
                sum += so[i];
            }
        }
        return sum;
    }
}
