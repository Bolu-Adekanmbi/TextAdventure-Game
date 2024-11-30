import java.util.Arrays;

public class Bag implements Inventory {
    private int capacity;
    Item[] itemSlots;
    private int size;

    public Bag(int bagCapacity) {
        this.capacity = bagCapacity;
        this.size = 0;
        itemSlots = new Item[capacity];
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean addItem(Item newItem) {
        if (isFull()) {
            return false;
        }

        itemSlots[size] = newItem;
        size++;
        return true;

    }

    public boolean isFull() {
        return size >= capacity;
    }

    public void expandCapacity(int extraSlots) {
        itemSlots = Arrays.copyOf(itemSlots, itemSlots.length + extraSlots);
    }

    public void shuffle() {
        
    }

    public Item remove(Item anItem) {
        Item dropped = null;
        for (int i = 0; i < itemSlots.length; i++) {
            if (itemSlots[i].equals(anItem)) {
                dropped = itemSlots[i];
                itemSlots[i] = null;
            }
        } 
        
        this.size--;
        return dropped;
    }

    public boolean add(Item newItem) {
        if (this.isFull()) {
            return false;
        }

        itemSlots[size-1] = newItem;

        // --> Should have some sort of prompt if player can expand inventory
        // ----> Or maybe separate add method from equip which includes add + prompt

        this.size++;

        return true;
    }

    /**
     * 
     * @param newItem
     * @return
     */
    private int addCase(Item newItem) { //--> Will need to rename later
        if (this.isFull()) {
            return 0;
        }

        for (Item currentItem : itemSlots) {
            if (currentItem.equals(newItem)) {
                return -1;
            }
        }

        /* 
        itemSlots[size-1] = newItem;

        // --> Should have some sort of prompt if player can expand inventory
        // ----> Or maybe separate add method from equip which includes add + prompt

        this.size++;
        */

        return 1;
    }

    public String equip(Item newItem) {
        int addCase = addCase(newItem);

        switch(addCase) {
            case 0:
                return "Full"; // need to change strings later
            case 1:
                itemSlots[size-1] = newItem;
                size++;
                return "You have successfully equipped";
            case -1:
                return "You have already equipped this item";
            default:
                return "???";
        }
    } 


    
    

    


}
