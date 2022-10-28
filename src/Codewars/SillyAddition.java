package Codewars;
//https://www.codewars.com/kata/5effa412233ac3002a9e471d/java

import java.util.Scanner;

public class SillyAddition {
    //    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.print("Unesite 1. broj: ");
////        int num1 = sc.nextInt();
////        System.out.print("Unesite 2. broj: ");
////        int num2 = sc.nextInt();
////
////        int num1Digit100 = num1 / 100;
////        int num1Digit10 = num1 % 100 / 10;
////        int num1Digit1 = num1 % 10;
////
////        int num2Digit100 = num2 / 100;
////        int num2Digit10 = num2 % 100 / 10;
////        int num2Digit1 = num2 % 10;
////
////        int result100 = num1Digit100 + num2Digit100;
////        int result10 = num1Digit10 + num2Digit10;
////        int result1 = num1Digit1 + num2Digit1;
////
////        String tempFinal = result100 + "" + result10 + "" + result1;
////        int resultFinal = Integer.parseInt(tempFinal);
////        System.out.println(resultFinal);
//        int num1 = 1564;
//        int num2 = 654789;
//        System.out.println(sum(num1, num2));
//
//    }
    public static int sum(int num1, int num2) {
        int rez = 0;
        int a, b;
        int counter = 0;
        int temp = 0;
        while (num1 > 0 || num2 > 0) {
            a = num1 % 10;
            b = num2 % 10;
            temp = a + b;

            rez = temp * (int) Math.pow(10, counter) + rez;
            if (temp > 10)
                counter++;
            counter++;
            num1 /= 10;
            num2 /= 10;
        }
        return rez;
    }

    public static void main(String[] args) {

        System.out.println(sum(16, 18));

        System.out.println(sum(248, 208));
    }
}

