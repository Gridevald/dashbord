package com.hakerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */
public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        double t = (double) (x1 - x2) / (v2 - v1);

        if (t % 1 == 0 && t >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
