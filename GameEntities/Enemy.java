package GameEntities;

public class Enemy implements Entity {
    private double health;
    private String name;
    
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

}