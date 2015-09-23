package assorted;

import java.util.Scanner;

/**
 * Problem: for a given number, see if it stops or not.
 *
 * @author Cassio Sousa
 */
public class WillItStop {

    private static String willItStop(double value) {
        if(value == 0) return "TAK";
        double log2number = Math.log(value)/Math.log(2.0);
        if(log2number == Math.floor(log2number))
            return "TAK";
        else
            return "NIE";
    }

    /**
     * Main function.
     *
     * @param args input arguments (none).
     * @throws Exception if any.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(willItStop(n));
    }
}