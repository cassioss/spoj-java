package palindromes;

import java.util.Scanner;

/**
 * Problem: for a given number N, find the smallest palindrome bigger than N.
 *
 * @author Cassio Sousa
 */
public class NextPalindrome {

    /**
     * Gives the next palindrome of a number.
     */
    private static int nextPalindrome(int number) {
        if (number < 0)
            return 0;
        if (number >= 0 && number <= 8)
            return number + 1;
        return number + 1;      // Complete here
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
        for (int i = 0; i < number; i++) {
            int input = sc.nextInt();
            System.out.println(nextPalindrome(input));
        }
    }
}