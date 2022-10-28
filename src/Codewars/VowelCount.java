package Codewars;
    //https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
public class VowelCount {
        public static void main(String[] args) {
            System.out.println(getCount("mama  "));
        }
        public static int getCount(String str) {
            int vowelsCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowelsCount++;
                }
            }
            // your code here
            return vowelsCount;
        }
}
