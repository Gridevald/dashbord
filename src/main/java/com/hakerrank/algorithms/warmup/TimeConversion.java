package com.hakerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

    private static String timeConversion(String s) {
        String ampm = s.substring(8, 10);
        StringBuilder sb = new StringBuilder(s);
        sb.setLength(8);
        String sHour = "";
        String[] time = sb.toString().split(":");

        if (ampm.equalsIgnoreCase("am")) {
            if (time[0].equals("12")) {
                sHour = "00";
            } else {
                sHour += time[0];
            }
        } else {
            if (time[0].equals("12")) {
                sHour += "12";
            } else {
                int hour = Integer.valueOf(time[0]) + 12;
                sHour += hour;
            }
        }

        return sHour + ":" + time[1] + ":" + time[2];
    }
}
