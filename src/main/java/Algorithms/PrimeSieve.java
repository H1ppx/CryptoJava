package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//TODO: Run a faster algorithm
public class PrimeSieve {

    private static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }

    public static boolean isPrime(int n) {

        if(isEven(n) && n != 2){
            return false;
        }

        for(int i = 3;Math.pow(i,2) <= n; i += 2) {
            if(n%i==0)
                return false;
        }
        return true;

    }

    public static ArrayList<String> primeFactorization(int num) {

        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        ArrayList<String> factorization = new ArrayList<String>();

        if (isPrime(num)) {
            factorization.add(Integer.toString(num));
            return factorization;
        } else {

            while (num % 2 == 0) {
                num = num / 2;
                primeFactors.add(2);
            }

            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    primeFactors.add(i);
                    num = num / i;
                }

                if (isPrime(num)) {
                    primeFactors.add(num);
                }
            }

            Set<Integer> unique = new HashSet<Integer>(primeFactors);
            for (Integer key : unique) {
                factorization.add(key + "^(" + Collections.frequency(primeFactors, key) + ")");
            }

            return factorization;
        }
    }
}
