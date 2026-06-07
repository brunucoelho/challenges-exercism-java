package main.java.br.com.medium.ci_NthPrime;

import java.util.ArrayList;
import java.util.List;

public class PrimeCalculator {

    int nth(int nth) {
        if (nth <= 0) {
            throw new IllegalArgumentException("Error");
        }

        List<Integer> listNumberPrime = new ArrayList<>();
        int numeroTestado = 2;

        while (listNumberPrime.size() < nth) {
            if (isPrime(numeroTestado)) {
                listNumberPrime.add(numeroTestado);
            }
            numeroTestado++;
        }

        return listNumberPrime.get(nth - 1);
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}


