package GameEntities;

public interface Entity {
    /**
     * This is a getter method that returns the health of the entity
     * @return Returns the health of the entity
     */
    public double getHealth();

    /**
     * This is a mutator method that sets the health of the entity to a specified value
     * @param newHealth This is the new health we want to set the entitie's health to
     */
    public void setHealth(double newHealth);

    /**
     * This is a getter method that gets the name of the current entityt
     * @return Returns the name of the entity
     */
    public String getName();

}