package Codewars;
    // https://www.codewars.com/kata/554e4a2f232cdd87d9000038/java
public class ComplementaryDNA {
        public static void main(String[] args) {
            System.out.println(makeComplement("ATTGC"));
        }
        public static String makeComplement(String dna) {
            //Your code
            for (int i = 0; i < dna.length(); i++) {
                if (dna.charAt(i) == 'A') {
                    dna.replace(dna.charAt(i), 'T');
                }
                if (dna.charAt(i) == 'T') {
                    dna.replace(dna.charAt(i), 'A');
                }
                if (dna.charAt(i) == 'C') {
                    dna.replace(dna.charAt(i), 'G');
                }
                if (dna.charAt(i) == 'G') {
                    dna.replace(dna.charAt(i), 'C');
                }
            }
            return dna;
        }
}
