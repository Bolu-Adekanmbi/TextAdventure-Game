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
    private LinkedList<Armour> armourSet;
    
    // The weapon currently being held
    private Weapon inHand;



    






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

        public int attack(Entity victim) {
            return 0;


            // Will use weapon inHand that can be switched out
            // will return how much damage the attack was
            
            // Remember to make sure health never goes to negative after attack

        }




    


    /**
     * METHODS TO ADD
     * -- equip weapon
     * -- heal
     * 
     * 
     */



}