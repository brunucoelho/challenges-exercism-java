package main.java.br.com.medium.cq_SumofMultiples;

import java.util.HashSet;
import java.util.Set;

public class SumOfMultiples {

  int number;
  int[] set;
  
  SumOfMultiples(int number, int[] set) {
    this.number = number;
    this.set = set;
  }
  
  int getSum() {
    int sum = 0;
    Set<Integer> numbers = new HashSet<>();
    for (int i : set) {
          for (int j = i; j < number; j += i) {
              numbers.add(j);
          }
      }
    for (int numberSet : numbers) {
      sum += numberSet;
    }
    
    return sum;

}

}
