package Codewars;

//  https://www.codewars.com/kata/56606694ec01347ce800001b/train/java
public class Is_this_a_triangle {
    public static void main(String[] args) {
        System.out.println(isTriangle(1,2,2));
    }

    public static boolean isTriangle(int a, int b, int c) {
        return a < b + c && b < a + c && c < a + b;
    }
}
