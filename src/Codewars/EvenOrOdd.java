package Codewars;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(even_or_odd(55));

    }
    public static String even_or_odd(int number) {
        //Place code here
        return number % 2 == 0 ? "Even": "Odd";
    }
}
