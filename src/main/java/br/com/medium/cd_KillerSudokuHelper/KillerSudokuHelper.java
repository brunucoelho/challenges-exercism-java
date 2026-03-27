package main.java.br.com.medium.cd_KillerSudokuHelper;

import java.util.ArrayList;
import java.util.List;

public class KillerSudokuHelper {

    public List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize, List<Integer> exclude) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(cageSum, cageSize, exclude, 1, new ArrayList<>(), result);
        return result;
    }

    public List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize) {
        return combinationsInCage(cageSum, cageSize, new ArrayList<>());
    }

    private void backtrack(int remainingSum, int remainingCells, List<Integer> exclude, 
                           int nextDigit, List<Integer> currentCombination, List<List<Integer>> result) {
        
        if (remainingCells == 0) {
            if (remainingSum == 0) {
                result.add(new ArrayList<>(currentCombination));
            }
            return;
        }

        for (int i = nextDigit; i <= 9; i++) {
            if (exclude.contains(i)) continue;
            
            if (i > remainingSum) break;

            currentCombination.add(i);

            backtrack(remainingSum - i, remainingCells - 1, exclude, i + 1, currentCombination, result);

            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
