package adhoc;

import java.util.Scanner;

/**
 * Problem: for a given number, see if it stops or not. It basically checks if the number is a power of 2, bitwise.
 *
 * @author Cassio Sousa
 */
public class WillItStop {

    /**
     * Main method.
     *
     * @param args input arguments (none).
     * @throws Exception if any.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), n1 = n - 1;
        System.out.println((n & n1) == 0 ? "TAK" : "NIE");
    }
}