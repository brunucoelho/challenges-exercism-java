package be_Grains;

import java.math.BigInteger;

class Grains {
    
    BigInteger grainsOnSquare(final int square) {
        BigInteger totalSum = BigInteger.ZERO;
        if (square < 1 || square > 64) 
            throw new IllegalArgumentException("Square must be between 1 and 64");
        for (int i = 1; i <= square; i++) {
            if (i <= 1) {
                totalSum = BigInteger.valueOf(i);
            } else {
                totalSum = BigInteger.valueOf(2).pow(i - 1);
            }
        }
        return totalSum;
        }

    BigInteger grainsOnBoard() {
        return grainsOnSquare(64).multiply(BigInteger.valueOf(2)).subtract(BigInteger.ONE);
    }

}
