package main.java.br.com.easy.bkk_DifferenceofSquares;

public class DifferenceOfSquaresCalculator {

    int squareOfSum = 0;
    int sumOfSquare = 0;
    
    int computeSquareOfSumTo(int input) {
        for (int i = 0; i<input; i++){
            squareOfSum += (input-i);
        }
        return squareOfSum*squareOfSum;
    }

    int computeSumOfSquaresTo(int input) {
        for (int i = 0; i<input; i++) {
            sumOfSquare += (input-i)*(input-i);
        }
        return sumOfSquare;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
