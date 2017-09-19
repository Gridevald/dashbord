package com.hakerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }

        Arrays.sort(height);
        int out = 0;
        if (height[n - 1] > k) {
            out = height[n - 1] - k;
        }
        System.out.print(out);
    }
}
