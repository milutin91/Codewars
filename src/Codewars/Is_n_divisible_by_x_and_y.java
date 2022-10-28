package Codewars;
//  https://www.codewars.com/kata/5545f109004975ea66000086/train/java
public class Is_n_divisible_by_x_and_y {
    public static void main(String[] args) {
        System.out.println(isDivisible(100,5,3));
    }
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}
