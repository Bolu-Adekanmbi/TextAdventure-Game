package EntityPackage;

public class Enemy implements BasicEntity {
    private String name;
    private int health;

    public Enemy(String name, int newHealth) {
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
