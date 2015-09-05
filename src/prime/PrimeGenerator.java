package prime;

import java.util.*;
import java.lang.*;

/**
 * Problem: firstly, it receives an integer N. The following N lines of input receive two numbers p and q, and the
 * program is supposed to print all prime numbers between p and q, inclusive.
 *
 * @author Cassio Sousa
 * @version 1.0
 */
public class PrimeGenerator {

    /**
     * Check if a number is prime. The first if clause is there to simplify the number of checks for small numbers.
     *
     * @param number a given integer.
     * @return <code>true</code> if the number is prime.
     */
    private static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        else {
            if (number == 2 || number == 3 || number == 5 || number == 7)
                return true;
            else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0)
                        return false;
                }
                return true;
            }
        }
    }

    /**
     * Essence of this program. Sorts two numbers and print all primes between them, inclusive.
     *
     * @param first  the first number.
     * @param second the second number.
     */
    private static void printAllPrimesBetween(int first, int second) {
        int bigger = first;
        int smaller = second;
        if (first < second) {
            bigger = second;
            smaller = first;
        }
        for (int i = smaller; i <= bigger; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    /**
     * Main function.
     *
     * @param args input arguments (none here).
     * @throws java.lang.Exception if any.
     */
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int entries = sc.nextInt();

        for (int i = 0; i < entries; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            printAllPrimesBetween(a, b);
            System.out.println();
        }
    }
}