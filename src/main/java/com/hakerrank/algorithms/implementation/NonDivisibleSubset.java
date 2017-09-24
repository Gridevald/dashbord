package com.hakerrank.algorithms.implementation;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/non-divisible-subset/problem
 */
public class NonDivisibleSubset {

    private int size;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[k];
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            list.add(temp);
            arr[temp % k]++;
        }
        sc.close();

        new NonDivisibleSubset().go(list, k);
        new NonDivisibleSubset().solve(arr, k);
    }

    //my solution. don't pass some tests by timeout
    private void go(List<Integer> list, int k) {
        find(list, k);
        System.out.println(size);
    }

    private boolean divisible(List<Integer> list, int k) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if ((i != j) && ((list.get(i) + list.get(j)) % k == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void find(List<Integer> list, int k) {
        if (list.size() > size) {
            if (divisible(list, k)) {
                for (int i = 0; i < list.size(); i++) {
                    List<Integer> inner = new ArrayList<>(list);
                    inner.remove(i);
                    if (inner.size() >= 1) {
                        this.find(inner, k);
                    }
                }
            } else {
                size = list.size();
            }
        }
    }

    //solution from forum
    private void solve(int[] arr, int k) {
        int result = 0;
        //there can be many pares, so we can't add all of them, but we should add only 1
        if (k % 2 == 0) {
            result++;
        }
        //If no number wholly divisible don't add it to pair else add once
        result = result + Math.min(arr[0], 1);
        //find max value from pares
        for (int j = 1; j <= k / 2; j++) {
            if (j != k - j) {
                result += Math.max(arr[j], arr[k - j]);
            }
        }
        System.out.println(result);
    }
}
