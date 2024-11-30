package Interactions;
import Entities.*;

public class Attack {
    Entity aggressor;
    Entity recipient;
    int damage;

    public Attack() {

    }

    public Entity getAggressor() {
        return this.aggressor;
    }

    public void setAggressor(Entity newAggressor) {
        this.aggressor = newAggressor;
    }

    public Entity getRecipient() {
        return this.recipient;
    }

    public void setRecipient(Entity newRecipient) {
        this.recipient = newRecipient;
    }

    /**
     * This will be the method that actually makes sure that the attack takes place
     * 
     * I am using just in case I want to make event handlers later or add things in
     * between an action being called and the actual execution
     */
    public void execute() {

    }

    

}