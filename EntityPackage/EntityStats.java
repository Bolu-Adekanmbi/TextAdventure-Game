package EntityPackage;

/**
 * Need to work on this and complete later
 * 
 * Thinking of keeping all the stats in one class for now and potentially having subclasses of stats
 * once the project is a bit more fleshed out and developed
 */

public class EntityStats {
    private int strength;
    private int speed;
    private int defense;
    private int intelligence;
    private int accuracy;
    private int evasion;
    private int criticalChance;
    private int stamina;


    public EntityStats() {

    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int newStrength) {
        this.strength = newStrength;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getAccuracy() {
        return this.accuracy;
    }

    public int getEvasion() {
        return this.evasion;
    }

    public int getCriticalChance() {
        return this.criticalChance;
    }

    public int getStamina() {
        return this.stamina;
    }


}
