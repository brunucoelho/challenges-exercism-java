package main.java.br.com.easy.an_WizardsandWarriors;

public class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10: 6;
    }
}

class Wizard extends Fighter {

    boolean Spell = true;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        this.Spell = false;
    }

    @Override
    boolean isVulnerable() {
        return this.Spell ? true : false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return Spell ? 3: 12;
    }
    
}
