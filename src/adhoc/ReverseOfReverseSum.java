package adhoc;

import java.util.Scanner;

/**
 * Problem: for two given numbers A and B, return the reversed sum of their reversed versions. For instance, if
 * A = 12 and B = 13, then we first sum their reversed versions (21 + 31 = 52), and then reverse it
 * (the final answer is 25).
 *
 * @author Cassio Sousa
 */
public class ReverseOfReverseSum {

    /**
     * Calculates the reversed version of a number in decimal digits. If we have 1200, its reversed version is 21.
     *
     * @param number the original integer number.
     * @return its reversed version.
     */
    private static int reverse(int number) {
        if (number < 0)
            return -99999;      // Invalid - not getting in
        else {
            if (number >= 0 && number <= 9)
                return number;
            else {
                int firstDigit = number % 10;
                if (firstDigit == 0)
                    return reverse(number / 10);
                else {
                    int numberOfDigits = (int) (Math.log10(number));
                    int tenPower = (int) Math.pow(10, numberOfDigits);
                    return (firstDigit * tenPower) + reverse(number / 10);
                }
            }
        }
    }

    /**
     * Calculates the reversed sum of two numbers in reverse.
     *
     * @param first  the first (non-reversed) number.
     * @param second the second (non-reversed) number.
     * @return the reversed sum of those two numbers in reverse.
     */
    private static int reverseOfReserveSum(int first, int second) {
        return reverse(reverse(first) + reverse(second));
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
            int first = sc.nextInt();
            int second = sc.nextInt();
            System.out.println(reverseOfReserveSum(first, second));
        }
    }
}