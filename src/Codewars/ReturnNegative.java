package Codewars;

//https://www.codewars.com/kata/55685cd7ad70877c23000102/train/java
public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(0));
    }

    public static int makeNegative(final int x) {
        int result;
        if (x > 0) {
            result = -x;
        } else if (x < 0) {
            result = x;
        } else {
            result = 0;
        }
        return result; // Your code here.
    }
}
