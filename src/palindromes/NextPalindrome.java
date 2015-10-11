package palindromes;

import java.util.Scanner;

/**
 * Problem: for a given number N, find the smallest palindrome bigger than N.
 *
 * @author Cassio Sousa
 */
public class NextPalindrome {

    /**
     * Gives the next palindrome for a given number.
     */
    private static int nextPalindrome(int number) {
        if (number < 0)
            return 0;
        else if (number >= 0 && number <= 8)
            return number + 1;
        else if (hasOnlyNines(number))
            return number + 2;
        else
            return dissecate(number);
    }

    private static int dissecate(int number) {
        char[] dissecated = String.valueOf(number).toCharArray();
        if (isPalindrome(dissecated)) {
            return number + 3;
        } else {
            return number + 2;
        }
    }

    private static boolean isPalindrome(char[] numberArray) {
        int arrayLength = numberArray.length;
        for (int i = 0; i < arrayLength / 2; i++) {
            if (numberArray[i] != numberArray[arrayLength - i])
                return false;
        }
        return true;
    }

    private static boolean hasOnlyNines(int number) {
        int newNumber = number;
        while (newNumber > 0) {
            if (newNumber % 10 != 9)
                return false;
            else
                newNumber = newNumber / 10;
        }
        return true;
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