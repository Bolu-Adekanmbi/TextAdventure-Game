package GameEntities;

import java.util.HashMap;

/**
 * The main idea of the map class is to be able to create maps as strings and then
 * go through the string and add backgrounds/assets as needed based on the mapKey
 * 
 * This is so that I can dynamically create maps and also experiment with algorithms that
 * automatically generate maps based on specific rules which I can work on coding out later
 * 
 * ^ -- this is just a fun little part I want to add later
 */


public class Map {
    /* Might have a map generation system that works based on tree traversal depending
    on the user location and which boundaries they fall within
    - mostly doing this to practice working with trees 

    -- Need to find a way to implement queue, stacks, etc to practice
    */ 


    private String name;
    private String map;

    private HashMap<String, String> mapKey;


    public Map(String mapName) {
        this.name = mapName;
    }

    public String getMap() {
        return this.map;
    }



}
