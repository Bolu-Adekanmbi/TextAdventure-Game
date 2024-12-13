package GameEntities;

public class Armour {
    private int durability;
    private int health;
    private int speedBoost;
    private int strengthBoost;
    
    public Armour() {

    }

    public int getDurability() {
        return this.durability;
    }

    public int getHealth() {
        return this.health;
    }

    public int getSpeedBoost() {
        return this.speedBoost;
    }

    public int getStrengthBoost() {
        return this.strengthBoost;
    }

    public void setDurability(int newDurability) {
        this.durability = newDurability;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public void setSpeedBoost(int newSpeedBoost) {
        this.speedBoost = newSpeedBoost;
    }

    public void setStrengthBoost(int newStrengthBoost) {
        this.strengthBoost = newStrengthBoost;
    }

    public void appriase() {
        // need to work on this functionality later
    }



}
