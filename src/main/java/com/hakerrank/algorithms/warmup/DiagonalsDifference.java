package com.hakerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalsDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mas = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                mas[i][j] = sc.nextInt();
            }
        }

        int first = 0;
        for(int i = 0; i < n; i++) {
            first += mas[i][i];
        }

        int second = 0;
        for(int i = 0; i < n; i++) {
            second += mas[i][n - 1 - i];
        }

        System.out.print(Math.abs(first - second));
    }
}
