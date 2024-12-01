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

    

    



    



}