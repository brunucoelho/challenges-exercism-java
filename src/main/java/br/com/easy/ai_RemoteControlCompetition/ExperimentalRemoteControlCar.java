package main.java.br.com.easy.ai_RemoteControlCompetition;

public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int units = 0;
    
    public void drive() {
        units += 20; 
    }

    public int getDistanceTravelled() {
        return this.units;
    }
}
