package com.hakerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
public class BreakingTheRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }

        int max = s[0];
        int min = s[0];

        int rMax = 0;
        int rMin = 0;

        for (int i = 1; i < s.length; i++) {
            if (s[i] > max) {
                rMax++;
                max = s[i];
            }
            if (s[i] < min) {
                rMin++;
                min = s[i];
            }
        }

        System.out.println(rMax + " " + rMin);
    }
}
