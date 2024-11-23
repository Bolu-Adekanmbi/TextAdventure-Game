public class Weapon implements Item {

    private int level;
    public static StringBuilder weaponHistory;


    public boolean enhance() {
        return false;
    }

    public boolean upgrade() {
        return false;
    }

    public String tellStory() {
        return weaponHistory.toString();
    }

    



    



}