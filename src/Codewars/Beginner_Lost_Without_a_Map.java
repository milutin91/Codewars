package Codewars;

import java.util.Arrays;

//  https://www.codewars.com/kata/57f781872e3d8ca2a000007e
public class Beginner_Lost_Without_a_Map {
    public static void main(String[] args) {
        int[] niz = {1,2,3};
        System.out.println(Arrays.toString(map(niz)));
    }
    public static int[] map(int[] arr) {
    int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * 2;
        }
        return newArr;
    }
}
