package com.hakerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

    static int birthdayCakeCandles(int n, int[] ar) {
        Arrays.sort(ar);
        int result = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (ar[i] == ar[n - 1]) {
                result++;
            }
        }
        return result;
    }
}
