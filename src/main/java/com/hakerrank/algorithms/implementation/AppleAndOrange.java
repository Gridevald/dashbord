package com.hakerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 */
public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }

        int as = s - a;
        int at = t - a;
        int bt = b - t;
        int bs = b - s;

        int cApple = 0;
        int cOrange = 0;

        for (int i : apple) {
            if (i >= as && i<= at) {
                cApple++;
            }
        }

        for (int i : orange) {
            if (-i >= bt && -i <=bs) {
                cOrange++;
            }
        }

        StringBuilder sb = new StringBuilder(cApple + "\n" + cOrange);
        System.out.println(sb);
    }
}
