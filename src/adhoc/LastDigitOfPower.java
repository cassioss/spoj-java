package adhoc;

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
    private static int lastDigitOfPower(double base, double index) {
        double baseMod10 = base % 10.0;
        double indexMod4 = index % 4.0;
        if (baseMod10 == 0.0) return 0;
        if (indexMod4 == 0.0) return 1;
        else {
            double power = Math.pow(baseMod10, indexMod4);
            return (int) Math.round(power) % 10;
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
            double base = sc.nextDouble();
            double index = sc.nextDouble();
            System.out.println(lastDigitOfPower(base, index));
        }
    }
}