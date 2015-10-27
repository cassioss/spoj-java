package adhoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem: see if it is possible to share candies between different packs.
 *
 * @author Cassio Sousa
 */
public class DivideCandies {

    /**
     * Gets the number of candies that need to be relocated to achieve the average.
     *
     * @param candies the packs of candies with their amounts (integer).
     * @return the number of candies that need to be relocated, or -1 otherwise.
     */
    private static int shareCandies(List<Integer> candies) {
        double average = average(candies);
        if (Math.floor(average) != average)
            return -1;
        int intAverage = (int) average;
        int toBeMoved = 0;
        for (int iCandy : candies) {
            if (iCandy > intAverage)
                toBeMoved += iCandy - intAverage;
        }
        return toBeMoved;
    }

    /**
     * Calculates the average in a list of integers.
     *
     * @param numbers a list of integers.
     * @return the average of those numbers (as a double precision number).
     */
    private static double average(List<Integer> numbers) {
        double average = 0.0;
        for (int number : numbers)
            average += 1.0 * number;
        return average / (1.0 * numbers.size());
    }

    /**
     * Main method.
     *
     * @param args input arguments (none).
     * @throws Exception if any.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n != -1)
            do {
                List<Integer> candies = new ArrayList<>();
                for (int i = 0; i < n; i++)
                    candies.add(sc.nextInt());
                System.out.println(shareCandies(candies));
                n = sc.nextInt();
            } while (n != -1);
    }
}