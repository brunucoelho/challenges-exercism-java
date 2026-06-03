package main.java.br.com.medium.ce_KindergartenGarden;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String garden = "VVCG\nVVRC";
        String student = "Bob";
        KindergartenGarden kindergartenGarden = new KindergartenGarden(garden);
        List<Plant> plants = kindergartenGarden.getPlantsOfStudent(student);
        System.out.println(plants);
    }
}
