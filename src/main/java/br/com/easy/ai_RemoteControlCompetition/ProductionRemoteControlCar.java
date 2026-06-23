package main.java.br.com.easy.ai_RemoteControlCompetition;

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int units = 0;
    private int numberOfVictories;

    public int compareTo(ProductionRemoteControlCar other) {
        if (this.numberOfVictories > other.getNumberOfVictories()) return -1;
        else if(this.numberOfVictories < other.getNumberOfVictories()) return 1;
        else return 0;
    }
        
    public void drive() {
        units += 10;
    }

    public int getDistanceTravelled() {
        return this.units;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
}

