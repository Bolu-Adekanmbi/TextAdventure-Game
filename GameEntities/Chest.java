package GameEntities;

public class Chest implements Inventory {
    private int capacity;
    


    /*
     * Since chests will generally have a much larger capacity that inventory on
     * hand I want to experiment with a linked list implementation since I switched
     * from linked list to arrays for the bag class 
     */

     /*
      * Another option I'm thinking about is to have a binary search tree for finding items
      because large number of items might prove difficult to render all at once while doing a linear
      search
      */


     /*
      * Additionally thinking of writing my own doubly linked list class to traverse
      backwards and forwards in the ches and show some sort of scroall bar animation in regards
      to which item we are currently on. It can be displayed at the bottom of the screen and
      fetch the next couple of items to be visible (will need to work on this)
      */



    @Override
    public int getCapacity() {
        // TODO Auto-generated method stub
        return this.capacity;
    }

    @Override
    public boolean addItem(Item newItem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addItem'");
    }

    @Override
    public void shuffle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shuffle'");
    }

    @Override
    public Item remove(Item anItem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean add(Item newItem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    
}
