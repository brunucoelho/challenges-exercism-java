package main.java.br.com.medium.cj_Prism;

import java.util.List;

public class Prism {

    public record LaserInfo(double x, double y, double angle) {
    }

    public record PrismInfo(int id, double x, double y, double angle) {
    }

    public static List<Integer> findSequence(LaserInfo laser, List<PrismInfo> prisms) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
