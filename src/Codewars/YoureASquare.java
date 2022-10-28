package Codewars;
    //https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java
public class YoureASquare {
        public static void main(String[] args) {
            System.out.println(isSquare(26));
            int sum = 25%1;
        }
        public static boolean isSquare(int n) {
            int sqrt;
            if (n >= 0) {
                sqrt = (int) Math.sqrt(n);
                return sqrt * sqrt == n;
            }
            return false;
        }
}
