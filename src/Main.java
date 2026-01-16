import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // HighScores highScores = new HighScores(Arrays.asList(70, 50, 20, 30, 90));
        // //highScores.personalTopThree();
        // System.out.println(highScores.personalBest());
        // System.out.println(highScores.personalTopThree());
        // System.out.println(highScores.latest());

        ResistorColor resistorColor = new ResistorColor();
        System.out.println(resistorColor.colorCode("blue"));
                System.out.println(Arrays.toString(resistorColor.colors()));
                
    }
}