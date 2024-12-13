package Interactions;

public interface Interaction {
    
    /**
     * This will act as the method that actually performs the interaction between
     * 2 different entities.
     * 
     * [
     * The idea behind this is to have optional interactions and to see if I can
     * experiment with the possibilities of being able to access interactions 
     * before they execute. I might even be able to make it a dice rolling
     * turn game where you roll for an interaction to take place and the interaction
     * is stored and used for later story/world-building. 
     * ] 
     * 
     * @return Returns an integer indicating the status of the action that was to be
     *         executed
     */
    public int execute();




}
