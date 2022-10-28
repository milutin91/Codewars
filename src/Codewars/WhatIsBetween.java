package Codewars;

import java.util.Arrays;

import static java.util.stream.IntStream.rangeClosed;

public class WhatIsBetween {

    //https://www.codewars.com/kata/55ecd718f46fba02e5000029/java

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1, 5)));
    }
    public static int[] between(int a, int b) {
//        int count = 0;
//        int i;
//        for (i = a; i <= b ; i++) {
//            count++;
//        }
//        int count2 = a;
//        int[] arr = new int[count];
//        for (i = 0; i < count ; i++) {
//            count2++;
//            arr[i] = count2 - 1;
//
//        }
//        return arr;
        return rangeClosed(a, b).toArray(); //----> mora da se importuje import static java.util.stream.IntStream.rangeClosed;
    }
}
