package main.java.br.com.easy.ah_NeedforSpeed;

public class NeedForSpeed {
   public int speed;
    public int meters;
    public int batteryDrain;
    public int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;       
    }

    public int distanceDriven() {
        return this.meters;
    }

    public void drive() {
        if (battery >= batteryDrain) {
        battery -= batteryDrain;
        meters += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    public int distance;
    public int times;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        times = car.battery / car.batteryDrain;
        return (times * car.speed) >= this.distance;
    }
}

