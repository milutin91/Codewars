package Codewars;

import com.sun.security.jgss.GSSUtil;

//  https://www.codewars.com/kata/582cb0224e56e068d800003c/train/java
public class Keep_Hydrated {
    public static void main(String[] args) {
        System.out.println(Liters(11.8));
    }
    public static int Liters(double time)  {
        return (int) Math.floor(time * 0.5);
    }
}
