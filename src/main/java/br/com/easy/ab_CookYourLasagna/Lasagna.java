package main.java.br.com.easy.ab_CookYourLasagna;

public class Lasagna {
    // define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        int minutos = 40;
        return minutos;
    }

    // define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutos) {
        int minutosRestantes = expectedMinutesInOven() - minutos;
            return minutosRestantes;
    }

    // define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layer) {
        int totalLayers = layer * 2;
            return totalLayers;
    }
    // define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int hour) {
        int totalTime = preparationTimeInMinutes(layers) + hour;
        return totalTime;
    }
}