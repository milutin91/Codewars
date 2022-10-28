package Codewars;

//https://www.codewars.com/kata/550e9fd127c656709400024d/java
public class CubeSimulation {
    public static void main(String[] args) {
        System.out.println(cubeSum(4, 0));
    }

    public static long cubeSum(int n, int m) {
        long sum = 0;
        if (n < m) {
            for (int i = n + 1; i <= m; i++) {
                sum += Math.pow(i, 3);
            }
        } else {
            for (int i = m + 1; i <= n; i++) {
                sum += Math.pow(i, 3);
            }
        }
        return sum;
    }
}
