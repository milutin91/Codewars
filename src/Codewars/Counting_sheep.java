package Codewars;
// https://www.codewars.com/kata/54edbc7200b811e956000556/train/java
public class Counting_sheep {
    public static void main(String[] args) {
        Boolean[] niz = {true,false,true,true,false};
        System.out.println(countSheeps(niz));
    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (boolean sheep : arrayOfSheeps) {
            if (sheep) {
                count++;
            }
        }
        return count;
    }
}
