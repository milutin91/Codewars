package Codewars;

//  https://www.codewars.com/kata/563b662a59afc2b5120000c6/train/java
public class Growth_of_a_Population {
    public static void main(String[] args) {
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }

    public static int nbYear(int start, double percent, int fixPlusEveryYear, int end) {
        int count = 0;
        do {
            start = (int) (start + (start * percent/100) + fixPlusEveryYear);
            count++;
        } while (start < end);
        return count;
    }
}
