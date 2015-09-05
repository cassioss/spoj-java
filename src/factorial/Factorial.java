package factorial;

import java.lang.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Problem: for a given number N, return the factorial of N (or N!).
 *
 * @author Cassio Sousa
 */
public class Factorial {

    /**
     * Calculates the factorial of a given number.
     */
    private static BigInteger factorial(int number) {
        if (number < 0)
            return BigInteger.valueOf(0);
        else {
            if (number == 0 || number == 1)
                return BigInteger.valueOf(1);
            else {
                BigInteger fact = BigInteger.valueOf(number);
                return fact.multiply(factorial(number - 1));
            }
        }
    }

    /**
     * Main function.
     *
     * @param args input arguments (none).
     * @throws Exception if any.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            System.out.println(factorial(number));
        }
    }
}