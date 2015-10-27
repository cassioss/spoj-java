package adhoc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class FashionShow {

    /**
     * Returns the combined hotness of every man-woman pair of a fashion show. As it is intended to obtain the max
     * hotness, we need to sort the arrays for men and women first.
     */
    private static int combinedHotness(int[] men, int[] women, int n) {
        Arrays.sort(men);
        Arrays.sort(women);
        int combined = 0;
        for (int i = 0; i < n; i++)
            combined += men[i] * women[i];
        return combined;
    }

    /**
     * Main method.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] men = new int[n];
            int[] women = new int[n];
            for (int j = 0; j < n; j++)
                men[j] = sc.nextInt();
            for (int k = 0; k < n; k++)
                women[k] = sc.nextInt();
            System.out.println(combinedHotness(men, women, n));
        }
    }
}
