package GameEntities;

public class Weapon implements Item {

    private int level;
    public static StringBuilder weaponHistory;
    public double damage;


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