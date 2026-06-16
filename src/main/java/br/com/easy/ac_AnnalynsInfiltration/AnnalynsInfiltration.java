package main.java.br.com.easy.ac_AnnalynsInfiltration;

public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

  
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }


    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean dogStrategy = petDogIsPresent && !archerIsAwake;

        boolean stealthStrategy = !petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake;

        return dogStrategy || stealthStrategy;
    }
}
