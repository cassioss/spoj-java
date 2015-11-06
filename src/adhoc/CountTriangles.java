package adhoc;

import java.util.Scanner;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class CountTriangles {

    /**
     * Returns the total number of equilateral triangles in a big triangle with edge n, full of triangles with
     * edge 1.
     * (1) --> 1
     * (2) --> 1+(2) + 3+(1) + 1-(1)
     * (3) --> 1+(3) + 3+(2) + 6+(1) + 3-(1)
     * (4) --> 1+(4) + 3+(3) + 6+(2) + 10+(1) + 1-(2) + 6-(1)
     * (5) --> 1+(5) + 3+(4) + 6+(3) + 10+(2) + 15+(1) + 3-(2) + 10-(1)
     */
    private static long totalTriangles(int n) {
        long totalSum = n * (n + 1) * (n + 2) / 6;
        while (n >= 2) {
            totalSum += partialSum(n - 1);
            n -= 2;
        }
        return totalSum;
    }

    /**
     * Calculates the partial sum of 0 + 1 + 2 + ... + n.
     */
    private static long partialSum(int n) {
        return n * (n + 1) / 2;
    }

    /**
     * Main method.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(totalTriangles(n));
        }
    }


}
