package Codewars;

public class SquareEveryDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
    public static int squareDigits(int n) {
        char[] niz = ("" + n).toCharArray();
        String str = "";
        for (int i = 0; i < niz.length; i++) {
            int m = Integer.parseInt(String.valueOf(niz[i]));
            str += m * m;
        }
        return Integer.parseInt(str);
    }
}
