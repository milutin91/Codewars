package Codewars;

import java.util.ArrayList;

//https://www.codewars.com/kata/554b4ac871d6813a03000035/java
public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 2 -3 4 5"));
        System.out.println(highAndLow("1 9 3 4 -5"));
    }
        public static String highAndLow(String numbers) {
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int temp;
            String[] num = numbers.split(" ");
            for (String s : num) {
                temp = Integer.parseInt(s);
                if (min > temp) {
                    min = temp;
                }
                if (max < temp) {
                    max = temp;
                }
            }
            return max + " " + min;
        }
}
