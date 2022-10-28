package Codewars;
//  https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
public class String_repeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(3, "mica"));
    }
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result+=string;
        }
        return result;
    }
}
