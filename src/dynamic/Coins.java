package dynamic;

import java.util.*;

/**
 * @author Cassio dos Santos Sousa
 * @version 1.0
 */
public class Coins {


    //TODO Solve this problem

    public static int maxValue(int coin) {
        int max = coin / 2 + coin / 3 + coin / 4;
        if (max > coin)
            return max;
        else
            return coin;
    }

    /**
     * Main method.
     *
     * @param args input arguments (none).
     * @throws Exception if any.
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> allInputs = new ArrayList<>();
        while (sc.hasNext())
            allInputs.add(Integer.valueOf(sc.next()));
        System.out.println(allInputs);
        for (Integer input : allInputs)
            System.out.println(maxValue(input));

    }

}
