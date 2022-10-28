package Codewars;
//  https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/java
public class Remove_String_Spaces {
    public static void main(String[] args) {
        System.out.println(noSpace("mama tata bata"));
    }
    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}
