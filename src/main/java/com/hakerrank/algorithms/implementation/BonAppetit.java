package com.hakerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BonAppetit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();

        int sum = 0;

        for (int i : ar) {
            sum += i;
        }

        sum -= ar[k];

        int half = sum / 2;

        if (half == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - half);
        }
    }
}
