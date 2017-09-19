package com.hakerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        double pos = 0;
        double neg = 0;
        double zer = 0;

        for (int i = 0; i < n; i++) {
            if (mas[i] > 0) {
                pos++;
            } else {
                if (mas[i] < 0) {
                    neg++;
                } else {
                    if (mas[i] == 0) zer++;
                }
            }
        }

        System.out.printf("%.6f %n", pos / n);
        System.out.printf("%.6f %n", neg / n);
        System.out.printf("%.6f %n", zer / n);
    }
}
