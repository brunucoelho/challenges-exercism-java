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
        plants.removeIf(p -> p == null);

        List<Plant> plantsOfStudent = new ArrayList<>();

        if (students.indexOf(student) == 0) {
        for (int j = students.indexOf(student); j < plants.size(); j+=(plants.size()/2)) {
            plantsOfStudent.add(plants.get(j));
            plantsOfStudent.add(plants.get(j+1));
        }
    } else {
        for (int j = students.indexOf(student); j < (plants.size()/2); j+=(plants.size()/4)) {
            plantsOfStudent.add(plants.get(j*2));
            plantsOfStudent.add(plants.get((j*2)+1));
    }
}
return plantsOfStudent;
    }
}
