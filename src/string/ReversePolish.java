package string;

import java.util.Scanner;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class ReversePolish {

    /**
     * Receives an expression surrounded by brackets and returns it in Reverse Polish Notation (RPN).
     */
    private static String reversePolish(String expression) {
        return _reversePolish(expression.substring(1, expression.length() - 1));
    }

    private static String _reversePolish(String noBrackets) {
        if (noBrackets.length() <= 1)
            return noBrackets;
        else {
            int length = noBrackets.length();
            char currentChar = noBrackets.charAt(0);
            if (currentChar == '(') {
                int i = 1, j = 1, openMinusClose = 1;
                while (openMinusClose != 0) {
                    if (noBrackets.charAt(j) == '(')
                        openMinusClose++;
                    if (noBrackets.charAt(j) == ')')
                        openMinusClose--;
                    j++;
                }
                return _reversePolish(noBrackets.substring(i, j - 1)) + _reversePolish(noBrackets.substring(j, length));
            } else {
                int unicode = (int) currentChar;
                if (unicode >= 97 && unicode <= 122)
                    return String.valueOf(currentChar) + _reversePolish(noBrackets.substring(1, length));
                else
                    return _reversePolish(noBrackets.substring(1, length)) + String.valueOf(currentChar);
            }
        }
    }

    /**
     * Main function.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String expression = sc.next();
            System.out.println(reversePolish(expression));
        }
    }
}
