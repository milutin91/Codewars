package Codewars;
//  https://www.codewars.com/kata/latest/java?q=&r%5B%5D=-8&order_by=total_completed%20desc
public class Convert_a_String_to_a_Number {
    public static void main(String[] args) {
        System.out.println(stringToNumber("2564"));
    }
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
