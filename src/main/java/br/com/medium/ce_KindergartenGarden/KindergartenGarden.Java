package main.java.br.com.medium.ce_KindergartenGarden;

import java.util.ArrayList;
import java.util.List;

class KindergartenGarden {

    public String garden;
    public String student;
    List<String> students = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry");

    KindergartenGarden(String garden) {
        this.garden = garden;
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> plants = new ArrayList<>();
        for (int i = 0; i < garden.length(); i++) {
            char plant = garden.charAt(i);
            plants.add(Plant.getPlant(plant));
        }
        //List<Plant> plantsOfStudent = new ArrayList<>();
        plants.removeIf(p -> p == null);


        // for (Plant p: plants) {
        //     if (p != null) {
        //         plantsOfStudent.add(p);
        //     }
        // }
        return plants;
    }
}
