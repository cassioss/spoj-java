package assorted;

import java.util.Scanner;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class Cube888 {

    /**
     * For a given number k (bigger than 1), returns the k-th integer whose cube ends in 888. Since the output is
     * less than 2ˆ63, it can be stored in a long number.
     */
    private static long cube888(String k) {
        long longK = Long.valueOf(k);
        return 250 * longK - 58;
    }

    /**
     * Main function.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String k = sc.next();
            System.out.println(cube888(k));
        }
    }

}
