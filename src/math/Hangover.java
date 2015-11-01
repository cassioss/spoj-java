package math;

import java.util.Scanner;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class Hangover {

    /**
     * Given the traditional game of hanging cards (which allows us to make an infinite bridge of cards by pushing it
     * always by 1/2 + 1/3 + ... + 1/n+1), return the number of cards that give back a certain hang length.
     */
    private static int hangOver(double hang) {
        return _hangOver(hang, 1);
    }

    /**
     * Iterative implemetation of the method above.
     */
    private static int _hangOver(double toHang, int currentCard) {
        double nextHang = 1.0 / (1.0 * currentCard + 1.0);
        if (toHang - nextHang <= 0.00)
            return currentCard;
        else
            return _hangOver(toHang - nextHang, currentCard + 1);
    }

    /**
     * Main method.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double hang = sc.nextDouble();
        while (hang != 0.00) {
            System.out.println(hangOver(hang) + " card(s)");
            hang = sc.nextDouble();
        }
    }

}