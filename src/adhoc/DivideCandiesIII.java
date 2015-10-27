package adhoc;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class DivideCandiesIII {

    /**
     * Main method. Checks if a certain number of candies can be divided by a certain number of kids.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for (i = 0; i < n; i++) {
            long kids = sc.nextInt();
            BigInteger candies = BigInteger.ZERO;
            for (j = 0; j < kids; j++)
                candies = candies.add(new BigInteger(sc.next()));
            System.out.println((candies.remainder(BigInteger.valueOf(kids)).equals(BigInteger.ZERO) ? "YES" : "NO"));
        }
    }

}
