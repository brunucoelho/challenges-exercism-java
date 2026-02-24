package main.java.br.com.easy.bx_SpaceAge;

class SpaceAge {
    public double seconds;
    public double DAYS_ON_EARTH = 365.25;
    public double SECONDS_ON_EARTH = 86400;
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }
    double getSeconds() {
        return seconds;
    }
    double onEarth() {
        return getSeconds() / ((DAYS_ON_EARTH * 1) * SECONDS_ON_EARTH);
    }
    double onMercury() {
        return getSeconds() / ((DAYS_ON_EARTH * 0.2408467) * SECONDS_ON_EARTH);
    }
    double onVenus() {
        return getSeconds() / ((DAYS_ON_EARTH * 0.61519726) * SECONDS_ON_EARTH);
    }
    double onMars() {
        return getSeconds() / ((DAYS_ON_EARTH * 1.8808158) * SECONDS_ON_EARTH);
    }
    double onJupiter() {
        return getSeconds() / ((DAYS_ON_EARTH * 11.862615) * SECONDS_ON_EARTH);
    }
    double onSaturn() {
        return getSeconds() / ((DAYS_ON_EARTH * 29.447498) * SECONDS_ON_EARTH);
    }
    double onUranus() {
        return getSeconds() / ((DAYS_ON_EARTH * 84.016846) * SECONDS_ON_EARTH);
    }
    double onNeptune() {
        return getSeconds() / ((DAYS_ON_EARTH * 164.79132) * SECONDS_ON_EARTH);
    }
}