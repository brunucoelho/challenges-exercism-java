package main.java.br.com.medium.cq_SumofMultiples;

public class SumOfMultiples {

  int number;
  int[] set;
  
  SumOfMultiples(int number, int[] set) {
    this.number = number;
    this.set = set;
  }
  
  int getSum() {
    int sum = 0;

    for (int i = 1; i < number; i++) {
        for (int divisor : set) {
            if (divisor != 0 && i % divisor == 0) {
                sum += i;
                break;
            }
        }
    }

    return sum;

}

}
