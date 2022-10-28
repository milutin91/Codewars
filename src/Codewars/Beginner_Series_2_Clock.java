package Codewars;
import java.time.Duration;

//  https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a/train/java
public class Beginner_Series_2_Clock {
    public static void main(String[] args) {
        System.out.println(Past(0,1,1));
    }

    public static int Past(int h, int m, int s) {
//        return 3600000 * h + 60000 * m + 1000 * s;
        return (int)Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
    }
}
