package Codewars;

//  https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/java
public class Grasshopper_Summation {
    public static void main(String[] args) {
        System.out.println(summation(8));
    }

    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
