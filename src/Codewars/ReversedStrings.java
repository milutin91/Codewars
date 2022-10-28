package Codewars;

public class ReversedStrings {
    public static void main(String[] args) {
        System.out.println(solution("tata"));
    }
    public static String solution(String str) {
        // Your code here...
//        String result= "";
//        for (int i = str.length() -1; i >= 0 ; i--) {
//            result += str.charAt(i);
//        }
//        return result;
        return new StringBuilder(str).reverse().toString();
    }
}
