package EntityPackage;

public class Player implements BasicEntity {
    private String name;
    private int health;
    private int strength;

    public Player(String name, int newHealth) {
        this.name = name;
        this.health = newHealth;
    }   

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }
}
