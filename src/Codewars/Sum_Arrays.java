package Codewars;
//  https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java
public class Sum_Arrays {
    public static void main(String[] args) {
        double[] niz = {1, 5.2, 4, 0, -1};
        System.out.println(sum(niz));
    }
    public static double sum(double[] numbers) {
        double sum = 0;
        for (double n : numbers) {
            sum += n;
        }
        return sum;
    }
}
