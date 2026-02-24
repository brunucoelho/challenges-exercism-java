package main.java.br.com.medium.bw_CollatzConjecture;

public class CollatzCalculator {

    public int sum = 0;

    int computeStepCount(int start) {
        if (start <= 0)
            throw new IllegalArgumentException("Only positive integers are allowed");
        
        while (start > 1) {
            if (start % 2 == 0) {
                start = start / 2;
                    sum++;
            } else {
                start = (start * 3) + 1;
                sum++;
            }
        }
    return sum;
}}

