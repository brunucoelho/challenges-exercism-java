package main.java.br.com.easy.ad_BirdWatcher;

public 
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
      return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length - 1];
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
    }

    public void incrementTodaysCount() {
    if (this.birdsPerDay.length == 0) return; // ou lançar exceção, conforme regra
    this.birdsPerDay[this.birdsPerDay.length - 1]++;
}

    public boolean hasDayWithoutBirds() {
        for (int i: this.birdsPerDay) {
            if ( i == 0) return true ;
        } return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumOfBirds = 0;
        if (numberOfDays >= 7)
            numberOfDays = 7;
        for (int i = 0; i<numberOfDays; i++) {
            sumOfBirds+=this.birdsPerDay[i];
        } return sumOfBirds;
    }

    public int getBusyDays() {
        int countDays = 0;
        for (int i =0; i < this.birdsPerDay.length; i++ ) {
            if (this.birdsPerDay[i] >= 5)
                countDays+=1;
        } return countDays;
    }
}