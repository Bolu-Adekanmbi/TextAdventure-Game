package GameEntities;

public class Enemy implements Entity {
    private double health;
    
    public Enemy() {

    }


    public double getHealth() {
        return this.health;
    }

    public void setHealth(double newHealth) {
        this.health =  newHealth;
    }
}