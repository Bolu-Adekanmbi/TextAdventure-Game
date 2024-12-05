package GameEntities;

public class Enemy implements Entity {
    private double health;
    private String name;
    private int strength;
    private int defense;

    public Enemy(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double newHealth) {
        this.health =  newHealth;
    }

    public String toString() {
        return this.name +" Health: "+ this.health;
    }

    public void setStrength(int newStrength) {
        this.strength = newStrength;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setDefense(int newDefense) {
        this.defense = newDefense;
    }

    public int getDefense() {
        return this.defense;
    }

}