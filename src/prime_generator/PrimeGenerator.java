import java.util.*;
import java.lang.*;

class Main
{

    public static boolean isPrime(int number){
        if(number <= 1)
            return false;
        else{
            if(number == 2 || number == 3 || number == 5 || number == 7)
                return true;
            else{
                for(int i=2; i <= Math.sqrt(number); i++){
                    if(number % i == 0)
                        return false;
                } return true;
            }
        }
    }

    public static void printAllPrimesBetween(int first, int second){
        int bigger = first;
        int smaller = second;
        if(first < second){
            bigger = second;
            smaller = first;
        }
        for(int i=smaller; i<=bigger; i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner (System.in);
        int entries = sc.nextInt();

        for(int i=0; i<entries; i++){
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            printAllPrimesBetween(a,b);
            System.out.println();
        }
    }
}