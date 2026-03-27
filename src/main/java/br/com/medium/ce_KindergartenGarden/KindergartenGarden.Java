import java.util.List;

class KindergartenGarden {

  public String garden;
  public String student;
  List<Plant> plants = new ArrayList<>();

    KindergartenGarden(String garden) {
        this.garden = garden;
    }

    List<Plant> getPlantsOfStudent(String student) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
