package Codewars;
//  https://www.codewars.com/kata/latest/java?q=&r%5B%5D=-8&order_by=total_completed%20desc
public class Returning_Strings {
    public static void main(String[] args) {
        System.out.println(greet("milutin"));
    }
    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }
}
