package main.java.br.com.easy.ai_RemoteControlCompetition;

import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        cars.sort(null);
        return cars;

    }
}
