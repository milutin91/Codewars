package Codewars;
//  https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
public class Basic_Mathematical_Operations {
    public static void main(String[] args) {
        System.out.println(basicMath("-", 8, 2));
    }
    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        switch (op) {
            case "/" : result = v1 / v2; break;
            case "*" : result = v1 * v2; break;
            case "+" : result = v1 + v2; break;
            case "-" : result = v1 - v2; break;
        }
        return result;
    }
}
