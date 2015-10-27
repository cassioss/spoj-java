package adhoc;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class Julka {

    /**
     * Given the total amount of apples and the number of apples Klaudia has more than Julia, the program should
     * print how may apples each one of the girls has. BigInteger is used because the inputs may have one hundred
     * digits.
     */
    private static void howManyMore(BigInteger totalApples, BigInteger moreApples, BigInteger two) {
        BigInteger sum = totalApples.add(moreApples);
        BigInteger sub = totalApples.subtract(moreApples);
        System.out.println(sum.divide(two));
        System.out.println(sub.divide(two));
    }

    /**
     * Main function.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BigInteger[] totalApplesArray = new BigInteger[10];
        BigInteger[] moreApplesArray = new BigInteger[10];
        int i;
        BigInteger two = new BigInteger("2");
        for (i = 0; i < 10; i++) {
            String total = sc.next();
            String more = sc.next();
            totalApplesArray[i] = new BigInteger(total);
            moreApplesArray[i] = new BigInteger(more);
        }
        for (i = 0; i < 10; i++) {
            howManyMore(totalApplesArray[i], moreApplesArray[i], two);
        }
    }

}
