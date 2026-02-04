package bm_Hamming;
public class Hamming {

    public String leftStrand;
    public String rightStrand;
    public int distance;

    public Hamming(String leftStrand, String rightStrand) {
        distance = 0;
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (leftStrand.length() != rightStrand.length()) 
            throw new IllegalArgumentException("strands must be of equal length");
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                distance++;
            }
        }
    }

    public int getHammingDistance() {
        return this.distance;
    }
}
