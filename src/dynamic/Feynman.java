package dynamic;

import java.util.*;
import java.lang.*;

/**
 * Problem: fins the number of squares (of integer lengths) that can be formed in an N x N square grid. For reference,
 * an 1x1 grid only allows 1, but an 2x2 grid allows 5 squares.
 * <p>
 * Input: integer numbers;
 * Output: the number of squares in an NxN grid. If N=0, stop the program.
 *
 * @author Cassio Sousa
 */
public class Feynman {

    /**
     * Finds the number of squares in an NxN grid.
     */
    private static int numberOfSquaresInGrid(int N) {
        if (N <= 0)
            return 0;
        if (N == 1)
            return 1;
        else
            return N * N + numberOfSquaresInGrid(N - 1);
    }

    /**
     * Main method.
     *
     * @param args input arguments (none).
     * @throws java.lang.Exception if any.
     */
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n != 0) {
            do {
                System.out.println(numberOfSquaresInGrid(n));
                n = sc.nextInt();
            } while (n != 0);
        }
    }
}
