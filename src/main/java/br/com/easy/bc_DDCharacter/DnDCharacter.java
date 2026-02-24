package main.java.br.com.easy.bc_DDCharacter;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class DnDCharacter {
    
        private final int strength;
        private final int dexterity;
        private final int constitution;
        private final int intelligence;
        private final int wisdom;
        private final int charisma;
        private final int hitpoints;

    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.hitpoints = 10 + modifier(this.constitution);
    }

    int ability(List<Integer> scores) {
        int sum = 0;
        Integer minScore = Collections.min(scores);
        for (int score : scores) {
            sum += score;
        }
        return sum - minScore;
        }

    List<Integer> rollDice() {
        List<Integer> dice = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }
    
    //int input = getConstitution();
    
    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() { return strength; }
    int getDexterity() { return dexterity; }
    int getConstitution() { return constitution; }
    int getIntelligence() { return intelligence; }
    int getWisdom() { return wisdom; }
    int getCharisma() { return charisma; }
    int getHitpoints() { return hitpoints; }
}
