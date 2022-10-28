package Codewars;

import java.util.Arrays;

//  https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
public class Find_the_smallest_integer_in_the_array {
    public static void main(String[] args) {
        int[] niz = {5, 8, 9, 2, 4, -5};
        System.out.println(findSmallestInt(niz));
    }

    public static int findSmallestInt(int[] args) {
        int min;
        int temp;
        for (int i = 0; i < args.length; i++) {
            min = i;
            for (int j = i + 1; j < args.length; j++) {
                if (args[j] < args[min]) {
                    temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        return args[0];
    }
}
