import bm_Hamming.Hamming;

public class Main {
    public static void main(String[] args) {
        Hamming hamming = new Hamming("AATG", "AAA");
        int distance = hamming.getHammingDistance();
        System.out.println(distance);
    }
};