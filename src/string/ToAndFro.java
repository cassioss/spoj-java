package string;

import java.util.Scanner;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class ToAndFro {

    // ttyohhieneesiaabss, 3
    //
    // t  t  y
    // h  h  o
    // i  e  n
    // s  e  e
    // i  a  a
    // s  s  b
    //
    // Returns:
    //
    // thisistheeasyoneab

    /**
     * Returns the decoded version of a message, based on a column disposition of the letters that were usually
     * disposed in a single row. See example above for details of the procedure.
     */
    private static String decrypt(String encrypted, int numColumns) {
        int length = encrypted.length();
        int numRows = length / numColumns;
        char[][] charTable = new char[numRows][numColumns];

        boolean turnedLeft = false;
        int counter = 0;

        for (int i = 0; i < length; i++) {
            if (!turnedLeft)
                charTable[i / numColumns][i % numColumns] = encrypted.charAt(i);
            else
                charTable[i / numColumns][numColumns - 1 - (i % numColumns)] = encrypted.charAt(i);
            counter++;
            if (counter == numColumns) {
                turnedLeft = !turnedLeft;
                counter = 0;
            }
        }

        String correctMessage = "";
        for (int i = 0; i < length; i++)
            correctMessage += String.valueOf(charTable[i % numRows][i / numRows]);
        return correctMessage;
    }

    /**
     * Main method.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            String text = sc.next();
            System.out.println(decrypt(text, n));
            n = sc.nextInt();
        }
    }
}
