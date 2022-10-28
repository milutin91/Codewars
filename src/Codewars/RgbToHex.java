package Codewars;

//https://www.codewars.com/kata/513e08acc600c94f01000001

public class RgbToHex {

    public static String convertToHex(int color) {
        String colorHex = "";
        if (color == 0) {
            colorHex = "0";
        } else if (color == 1) {
            colorHex = "1";
        } else if (color == 2) {
            colorHex = "2";
        } else if (color == 3) {
            colorHex = "3";
        } else if (color == 4) {
            colorHex = "4";
        } else if (color == 5) {
            colorHex = "5";
        } else if (color == 6) {
            colorHex = "6";
        } else if (color == 7) {
            colorHex = "7";
        } else if (color == 8) {
            colorHex = "8";
        } else if (color == 9) {
            colorHex = "9";
        } else if (color == 10) {
            colorHex = "A";
        } else if (color == 11) {
            colorHex = "B";
        } else if (color == 12) {
            colorHex = "C";
        } else if (color == 13) {
            colorHex = "D";
        } else if (color == 14) {
            colorHex = "E";
        } else if (color == 15) {
            colorHex = "F";
        }
        return colorHex;
    }

    public static int sanatize(int color) {
        if (color < 0) {
            color = 0;
        } else if (color > 255) {
            color = 255;
        }
        return color;
    }

    int r, g, b;

    public static String rgb(int r, int g, int b) {

        r = sanatize(r);
        g = sanatize(g);
        b = sanatize(b);


        int rH = r / 16;
        int r2H = r % 16;

        int gH = g / 16;
        int g2H = g % 16;

        int bH = b / 16;
        int b2H = b % 16;


        String result = "";

        String rHex = convertToHex(rH);
        String r2Hex = convertToHex(r2H);

        String gHex = convertToHex(gH);
        String g2Hex = convertToHex(g2H);

        String bHex = convertToHex(bH);
        String b2Hex = convertToHex(b2H);

        result = rHex + r2Hex + gHex + g2Hex + bHex + b2Hex;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(rgb(0, 191, 255));
    }
}
