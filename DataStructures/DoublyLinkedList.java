package DataStructures;

/**
 * 
 */
public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    public static Node<T> cursor;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * 
     * @param index
     * @return
     * @throws IndexOutOfBoundsException, 
     */
    public T getData(int index) {
        if (index > size - 1 || size < 0) {
            throw new IndexOutOfBoundsException();
        }
        
        Node<T> currentNode = head;


    }

    public T remove() {

        try {

        }

        size--;
    }

    public void add(T newEntry) {
        size++;
    }



}
