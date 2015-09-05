package assorted;

import java.util.Scanner;

/**
 * Problem: for a base and its index, print the last digit of its decimal representation.
 *
 * @author Cassio Sousa
 */
public class LastDigitOfPower {

    /**
     * Gives the last digit of a power in its decimal representation.
     *
     * @param base  the base.
     * @param index the index of the power.
     * @return the last digit of its decimal representation.
     */
    private static int lastDigitOfPower(int base, int index) {
        int lastBase = base % 10;
        int indexMod4 = index % 4;
        if (lastBase == 0) return 0;
        if (indexMod4 == 0) return 1;
        else {
            int power = (int) (Math.pow(lastBase, indexMod4));
            return power % 10;
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
            int base = sc.nextInt();
            int index = sc.nextInt();
            System.out.println(lastDigitOfPower(base, index));
        }
    }
}