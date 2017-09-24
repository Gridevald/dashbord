package com.hakerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */
public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        in.close();

        Arrays.sort(a);
        Arrays.sort(b);
        List<Integer> divisor = new ArrayList<>();
        int minInB = b[0];
        int count = 0;

        for (int i = 1; i <= minInB; i++) {
            boolean mark = true;
            for (int j = 0; j < b.length; j++) {
                if (b[j] % i != 0) {
                    mark = false;
                    break;
                }
            }
            if (mark) {
                divisor.add(i);
            }
        }

        for (int i = 0; i < divisor.size(); i++) {
            boolean mark = true;
            for (int j = 0; j < a.length; j++) {
                if (divisor.get(i) % a[j] != 0) {
                    mark = false;
                    break;
                }
            }
            if (mark) {
                count++;
            }
        }

        System.out.println(count);
    }
}
