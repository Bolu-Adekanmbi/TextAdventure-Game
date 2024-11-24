import java.util.LinkedList;

public class Character {
    // Fields -------------------------------
    
    /* Charracter attributes */

    // Idea --> Potentially store similar attributes in a HashMap instead of having too many fields?

    private String name;
    private double experience;
    private int level;
    private double health;
    private double strength;
    private double speed;
    private double intelligence;
    private LinkedList<Item> inventory;


    






    // Constructor -------------------------------
    public Character(String name) {

        

        inventory = new LinkedList<>();
    }


    // Methods -------------------------------
    
    /*
     * /////// BASIC GETTER METHODS //////////
     */
    public String getName() {
        return this.name;
    }

    public double getExperience() {
        return 0;
    }

    public int getLevel() {
        return this.level;
    }




    


    /**
     * METHODS TO ADD
     * -- equip weapon
     * -- heal
     * 
     * 
     */



}