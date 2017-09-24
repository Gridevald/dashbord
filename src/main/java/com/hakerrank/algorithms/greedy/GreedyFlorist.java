package com.hakerrank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/greedy-florist/problem
 */
public class GreedyFlorist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int minimumCost = getMinimumCost(n, k, c);
        System.out.println(minimumCost);
    }

    private static int getMinimumCost(int n, int k, int[] c){
        int sum = 0;
        Arrays.sort(c);
        int pos = n - 1;
        int coef = 1;
        while (pos >= 0) {
            for (int j = 0; j < k; j++) {
                sum += c[pos] * coef;
                pos--;
                if (pos < 0) break;
            }
            coef++;
        }
        return sum;
    }
}
