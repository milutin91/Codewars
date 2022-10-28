package Codewars;

//  https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
public class Sum_of_positive {
    public static void main(String[] args) {
        int[] niz = {-1, 2, -2, 3};
        System.out.println(sum(niz));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int arrElement : arr) {
            if (arrElement > 0) {
                sum += arrElement;
            }
        }
        return sum;
    }
}
