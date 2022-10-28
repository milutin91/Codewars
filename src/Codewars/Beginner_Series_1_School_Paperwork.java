package Codewars;
//  https://www.codewars.com/kata/55f9b48403f6b87a7c0000bd/train/java
public class Beginner_Series_1_School_Paperwork {
    public static void main(String[] args) {
        System.out.println(paperWork(5,5));
    }
    public static int paperWork(int n, int m) {
        return n < 0 || m < 0 ? 0 : n * m;
    }
}
