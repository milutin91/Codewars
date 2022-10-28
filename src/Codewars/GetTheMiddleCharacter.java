package Codewars;
    ///https://www.codewars.com/kata/56747fd5cb988479af000028/train/java
public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("tata"));
    }
    public static String getMiddle(String word) {
        int position;
        int length;

        if (word.length() % 2 == 0) {
            position = word.length()/2-1;
            length = 2;
        } else {
            position = word.length()/2;
            length = 1;
        }

        return word.substring(position, position + length);
    }
}
