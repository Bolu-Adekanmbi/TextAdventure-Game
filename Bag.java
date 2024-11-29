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

    private void expandCapacity(int extraSlots) {
        itemSlots = Arrays.copyOf(itemSlots, itemSlots.length + extraSlots);
    }

    public void shuffle() {

    }

    public boolean remove(Item anItem) {
        
        
        return false;
    }

    public boolean add(Item newItem) {
        if (this.isFull()) {
            return false;
        }

        // --> Should have some sort of prompt if player can expand inventory
        // ----> Or maybe separate add method from equip which includes add + prompt

        return false;
    }


    
    

    


}
