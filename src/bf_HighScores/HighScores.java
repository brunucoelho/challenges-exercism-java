package bf_HighScores;
import java.util.*;

class HighScores {

    List<Integer> highScores = new ArrayList<>();

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size()-1);
    }

    Integer personalBest() {
        return Collections.max(highScores);
        }

    List<Integer> personalTopThree() {
        List<Integer> listTopScores = new ArrayList<>(highScores);
        Collections.sort(listTopScores, Collections.reverseOrder());
        int size = listTopScores.size() < 3 ? listTopScores.size() : 3;
        return listTopScores.subList(0, size);
    }

}
