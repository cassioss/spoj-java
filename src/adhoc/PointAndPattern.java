package adhoc;

import java.util.Scanner;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class PointAndPattern {

    /**
     * Checks, for a specific pattern for coordinates X and Y, if there is a number in that point, and if so, which
     * is it.
     */
    private static String pointAndPattern(int x, int y) {
        if (x < 0 || y < 0)
            return "No Number";
        if (x == y) {
            if (x % 2 == 0)
                return String.valueOf(2 * y);
            else
                return String.valueOf(2 * y - 1);
        } else if (x - y == 2) {
            if (x % 2 == 0)
                return String.valueOf(2 * y + 2);
            else
                return String.valueOf(2 * y + 1);
        } else return "No Number";
    }

    /**
     * Main function.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(pointAndPattern(x, y));
        }
    }

}
