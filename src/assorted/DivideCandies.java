package assorted;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem: see if it is possible to share candies between different packages.
 *
 * @author Cassio Sousa
 */
public class DivideCandies {

    private static int shareCandies(List<Integer> candies) {
        double average = average(candies);
        if(Math.floor(average) != average)
            return -1;
        int intAverage = (int) average;
        int toBeMoved = 0;
        for(int i=0; i < candies.size(); i++){
            int iCandy = candies.get(i);
            if(iCandy > intAverage)
                toBeMoved += iCandy - intAverage;
        }
        return toBeMoved;
    }

    private static double average(List<Integer> numbers) {
        double average = 0.0;
        for (int i = 0; i < numbers.size(); i++)
            average += 1.0 * numbers.get(i);
        return average / (1.0 * numbers.size());
    }

    /**
     * Main function.
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