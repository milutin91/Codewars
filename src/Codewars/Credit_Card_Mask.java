package Codewars;

//  https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java
public class Credit_Card_Mask {
    public static void main(String[] args) {
        System.out.println(maskify("123456789"));
    }

    public static String maskify(String str) {
        String result = "";
        if (str.length() < 5) {
            return str;
        } else {
            for (int i = 0; i < str.length() - 4; i++) {
                result += "#";
            }
            return result + str.substring(str.length() - 4);
        }
    }
}
