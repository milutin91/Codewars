package Codewars;

//  https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
public class Isograms {
    public static void main(String[] args) {
        System.out.println(isIsogram("moOse"));
    }

    public static boolean isIsogram(String str) {
        String temp = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (temp.charAt(j) == temp.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
