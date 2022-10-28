package Codewars;

import java.util.Arrays;

//  https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
public class Abbreviate_a_Two_Word_Name {
    public static void main(String[] args) {
        System.out.println(abbrevName("milutin toskic"));
    }
    public static String abbrevName(String name) {
        String[] strArr = name.toUpperCase().split(" ");
        return strArr[0].charAt(0) + "." + strArr[1].charAt(0);
//        String first = strArr[0];
//        String last = strArr[1];
//        return first.charAt(0) + "." + last.charAt(0);
    }
}
