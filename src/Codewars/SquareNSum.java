package Codewars;

public class SquareNSum {
    public static void main(String[] args) {
        int[] niz = {1,2,2};
        System.out.println(squareSum(niz));
    }
    public static int squareSum(int[] n) {
        //Your Code
        int sum = 0;
        for (int nElement : n) {
            sum += Math.pow(nElement, 2);
        }
        return sum;
    }
}
