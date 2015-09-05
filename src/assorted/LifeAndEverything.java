package assorted;

import java.util.*;
import java.lang.*;

/**
 * Problem: receive numbers and print them until you receive the number 42. Don't print it.
 *
 * @author Cassio Sousa
 * @version 1.0
 */
public class LifeAndEverything {

    /**
     * Main function.
     *
     * @param args Input arguments (none).
     * @throws java.lang.Exception if any.
     */
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n != 42) {
            do {
                System.out.println(n);
                n = sc.nextInt();
            } while (n != 42);
        }
    }
}