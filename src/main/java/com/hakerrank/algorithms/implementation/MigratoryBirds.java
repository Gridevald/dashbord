package com.hakerrank.algorithms.implementation;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */
public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Set<Integer> set = new TreeSet<Integer>();

        for (int i : ar) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
            set.add(i);
        }

        int typeVal = 0;
        int typeNum = 0;

        for (int i : set) {
            if ((map.get(i) > typeNum) || (map.get(i) == typeNum && i < typeVal)) {
                typeVal = i;
                typeNum = map.get(i);
            }
        }

        System.out.println(typeVal);
    }
}
