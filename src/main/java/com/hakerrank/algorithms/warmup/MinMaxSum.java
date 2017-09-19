package com.hakerrank.algorithms.warmup;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        Arrays.sort(arr);

        BigInteger f = BigInteger.valueOf(0);
        BigInteger s = BigInteger.valueOf(0);
        for(int i = 0; i < 4; i++) {
            f = f.add(BigInteger.valueOf(arr[i]));
            s = s.add(BigInteger.valueOf(arr[i + 1]));
        }

        System.out.print(f + " " + s);
    }
}
