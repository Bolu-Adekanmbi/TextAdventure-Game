public interface Inventory {

    public int getCapacity();

    public boolean addItem(Item newItem);

    public void shuffle();

    public boolean remove(Item anItem);

    public boolean add(Item newItem);


}
