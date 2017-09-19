package com.hakerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class VeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }

    static long aVeryBigSum(int n, long[] ar) {
        long temp = 0;
        for (int i = 0; i < ar.length; i++) {
            temp += ar[i];
        }
        return temp;
    }
}
