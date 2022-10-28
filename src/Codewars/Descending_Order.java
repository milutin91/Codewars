package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//  https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java
public class Descending_Order {
    public static void main(String[] args) {
//        int input = 42145;
//        System.out.println(sortDesc(input));
    }

//    public static int sortDesc(final int num) {
//        String input = String.valueOf(num);
//        String[] numArr = input.split("");
//        int[] newNumArr = new int[numArr.length];
//        int temp;
//        for (int i = 0; i < numArr.length; i++) {
//            newNumArr[i] = Integer.parseInt(numArr[i]);
//        }
//        int min;
//        for (int i = 0; i < newNumArr.length; i++) {
//            min = i;
//            for (int j = i + 1; j < newNumArr.length; j++) {
//                if (newNumArr[j] > newNumArr[min]) {
//                    temp = newNumArr[i];
//                    newNumArr[i] = newNumArr[j];
//                    newNumArr[j] = temp;
//                }
//            }
//        }
//        String fin = "";
//        for (int n : newNumArr) {
//            fin += String.valueOf(n);
//        }
//
//        return Integer.parseInt(fin);
//
//    }


    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }

}