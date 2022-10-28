package Codewars;

//  https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
public class Beginner_Series_3_Sum_of_Numbers {
    public static void main(String[] args) {
        System.out.println(GetSum(2, -1));
    }

    public static int GetSum(int a, int b) {
        int result = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            result += i;
        }
        return result;
    }
}
