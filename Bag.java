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

    


}
