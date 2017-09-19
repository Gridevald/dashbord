package com.hakerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j + 1) < n) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            if (i < n - 1) {
                System.out.println();
            }
        }
    }
}
