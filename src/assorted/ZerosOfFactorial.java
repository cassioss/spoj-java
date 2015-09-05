package assorted;

import java.util.*;
import java.lang.*;

/**
 * Problem: for a given number N, return the number of zeros in the decimal representation of N! (factorial).
 *
 * @author Cassio Sousa
 */
public class ZerosOfFactorial {

    /**
     * Gives the number of zeros in binary representation.
     */
    private static int zerosOfFactorial(int number) {
        if (number <= 4)
            return 0;
        else
            return number / 5 + zerosOfFactorial(number / 5);
    }

    /**
     * Main function.
     *
     * @param args input arguments (none).
     * @throws java.lang.Exception if any.
     */
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            System.out.println(zerosOfFactorial(number));
        }
    }
}