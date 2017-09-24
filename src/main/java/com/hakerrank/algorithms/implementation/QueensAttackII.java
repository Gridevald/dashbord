package com.hakerrank.algorithms.implementation;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * https://www.hackerrank.com/challenges/queens-attack-2/problem
 */
public class QueensAttackII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rq = sc.nextInt() - 1;
        int cq = sc.nextInt() - 1;

        int iPlus = n - cq - 1;
        int iMinus = cq;
        int jPlus = n - rq - 1;
        int jMinus = rq;
        int iPjP = min((n - rq - 1), (n - cq - 1));
        int iPjM = min((n - rq - 1), cq);
        int iMjM = min(rq, cq);
        int iMjP = min(rq, (n - cq - 1));

        for (int index = 0; index < k; index++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            if (i == rq) { //placed in the same row
                if (j > cq) {
                    if (j - cq - 1 < jPlus) {
                        jPlus = j - cq - 1;
                    }
                } else {
                    if (j < cq) {
                        if (cq - j - 1 < jMinus) {
                            jMinus = cq - j - 1;
                        }
                    }
                }
            } else {
                if (j == cq) { //paced in the same column
                    if (i > rq) {
                        if (i - rq - 1 < iPlus) {
                            iPlus = i - rq - 1;
                        }
                    } else {
                        if (i < rq) {
                            if (rq - i - 1 < iMinus) {
                                iMinus = rq - i - 1;
                            }
                        }
                    }
                } else {
                    if (abs(rq - i) == abs(cq - j)) { //placed on the diagonals
                        if (i > rq && j > cq) {
                            if (i - rq - 1 < iPjP) {
                                iPjP = i - rq - 1;
                            }
                        }
                        if (i > rq && j < cq) {
                            if (i - rq - 1 < iPjM) {
                                iPjM = i - rq - 1;
                            }
                        }
                        if (i < rq && j < cq) {
                            if (rq - i - 1 < iMjM) {
                                iMjM = rq - i - 1;
                            }
                        }
                        if (i < rq && j > cq) {
                            if (rq - i - 1 < iMjP) {
                                iMjP = rq - i - 1;
                            }
                        }
                    }
                }
            }
        }

        int counter = iPlus + iMinus + jPlus + jMinus
                + iPjP + iPjM + iMjM + iMjP;

        System.out.println(counter);
    }
}
