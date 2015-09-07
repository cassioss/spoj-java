package dynamic;

import java.util.Scanner;

/**
 * Problem: for a given number N of 1x1 squares, determine the number of distinct rectangles that can be formed with them.
 *
 * @author Cassio Sousa
 */
public class Rectangles {

    /**
     * Gives the number of rectangles that can be formed out of N 1x1 squares.
     */
    private static int rectanglesOutOfSquares(int number) {
        if (number <= 0)
            return 0;
        if (number >= 1 && number <= 3)
            return number;
        else
            return divisorsUntilRoot(number) + rectanglesOutOfSquares(number - 1);
    }

    /**
     * Finds the number of divisors that are smaller than or equal to the square root of a number.
     *
     * @param number a given integer (bigger than 3).
     * @return the number of divisors of a number until its square root.
     */
    private static int divisorsUntilRoot(int number) {
        int squareRoot = (int) Math.sqrt(number);
        int counterOfDivisors = 1;  // 1
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0)
                counterOfDivisors++;
        }
        return counterOfDivisors;
    }

    /**
     * Main function.
     *
     * @param args input arguments (none).
     * @throws Exception if any.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(rectanglesOutOfSquares(number));
    }
}