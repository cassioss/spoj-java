package assorted;

import java.util.*;
import java.lang.*;

public class LifeAndEverything {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n != 42) {
            do {
                System.out.println(n);
                n = sc.nextInt();
            } while (n != 42);
        }
    }
}