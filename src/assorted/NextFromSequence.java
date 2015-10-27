package assorted;

import java.util.Scanner;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class NextFromSequence {

    /**
     * Returns the next number from a sequence of three integers, along with the type of the progression (arithmetic
     * or geometric).
     */
    private static String nextFromSequence(int a1, int a2, int a3) {
        if (a1 + a3 == a2 + a2)
            return "AP " + String.valueOf(a3 + (a2 - a1));
        else
            return "GP " + String.valueOf((a3 * a2) / a1);
    }

    /**
     * Main function.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        while (!(a1 == 0 && a2 == 0 && a3 == 0)) {
            System.out.println(nextFromSequence(a1, a2, a3));
            a1 = sc.nextInt();
            a2 = sc.nextInt();
            a3 = sc.nextInt();
        }
    }
}
