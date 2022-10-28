package Codewars;
    //https://www.codewars.com/kata/55908aad6620c066bc00002a/java
public class ExesAndOhs {
        public static void main(String[] args) {
            System.out.println(XO("xXoo"));
        }
        public static boolean XO (String strInput) {
            int countX = 0;
            int countO = 0;
            for (int i = 0; i < strInput.length(); i++) {
                if (strInput.toLowerCase().charAt(i) == 'x') {
                    countX++;
                }
                if (strInput.toLowerCase().charAt(i) == 'o') {
                    countO++;
                }
            }
            if (countX == countO) {
                return true;
            }
            return false;
        }
}
