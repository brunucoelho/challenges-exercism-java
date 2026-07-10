package main.java.br.com.medium.cq_SumofMultiples;

public class Main {
    public static void main(String[] args) {
        int[] set = {2,3,5,7,11};
        int number = 10000;
        SumOfMultiples sumOfMultiples = new SumOfMultiples(number, set);

        System.out.println(sumOfMultiples.getSum());

    }
}


