package GameEntities;

public class Weapon implements Item {

    private String name;
    private int level;
    public static StringBuilder weaponHistory;
    public double damage;


    public Weapon(String name, double damage) {
        // Need to add level upgrading system later
        int level = 0;


        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public boolean enhance(Upgrade newUpgrade) {
        return false;
    }

    public boolean upgrade(Upgrade weaponUpgrade) {
        return false;
    }

    public String tellStory() {
        return weaponHistory.toString();
    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double newDamage) {
        this.damage = newDamage;
    }

    public void addToStory(String newStory) {
        weaponHistory.append("\n" + newStory + "\n");
    }

    

    



    



}