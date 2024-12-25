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


    public EntityStats(
        int strength,
        int speed,
        int defense,
        int intelligence,
        int accuracy,
        int evasion,
        int criticalChance,
        int stamina
    ) {
        this.strength = strength;
        this.speed = speed;
        this.defense = defense;
        this.intelligence = intelligence;
        this.accuracy = accuracy;
        this.evasion = evasion;
        this.criticalChance = criticalChance;
        this.stamina = stamina;
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

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int newDefense) {
        this.defense = newDefense;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(int newIntelligence) {
        this.intelligence = newIntelligence;
    }

    public int getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(int newAccuracy) {
        this.accuracy = newAccuracy;
    }

    public int getEvasion() {
        return this.evasion;
    }

    public void setEvasion(int newEvasion) {
        this.evasion = newEvasion;
    } 

    public int getCriticalChance() {
        return this.criticalChance;
    }

    public void setCriticalChance(int newCriticalChance) {
        this.criticalChance = newCriticalChance;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int newStamina) {
        this.stamina = newStamina;
    }


}
