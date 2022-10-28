package Codewars;

//  https://www.codewars.com/kata/56676e8fabd2d1ff3000000c
public class A_Needle_in_the_Haystack {
    public static void main(String[] args) {
        Object[] niz = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        System.out.println(findNeedle(niz));
    }

    public static String findNeedle(Object[] haystack) {
        int position = 0;
        for (int i = 1; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                position = i;
            }
        }
        return "found the needle at position " + position;
    }
}
