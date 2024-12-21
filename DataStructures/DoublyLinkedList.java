package DataStructures;

/**
 * 
 */
public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

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
        return getNode(index).getData();
    }

    /**
     * 
     * @param anEntry
     * @return
    
    public boolean add(T anEntry) {
        add(size - 1, anEntry);
        return true;
    }
    */

    public boolean add(int index, T item) {
        if (index < 0 || index > size) {
            return false;
        }

        Node<T> insertionNode = getNode(index);
        Node<T> previousNode = insertionNode.getPrevious();
        Node<T> nextNode = insertionNode.getNext();

        Node<T> newNode = new Node(item);


        return true;


    }


    private Node<T> getNode(int index) {
        if (index > size - 1 || size < 0) {
            throw new IndexOutOfBoundsException();
        }
        
        Node<T> currentNode = head;
        int indexCount = 0;

        while (currentNode != null && indexCount < size) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    } 

    public T remove(int index) {
        Node<T> removedNode = getNode(index);

        Node<T> previousNode = removedNode.getPrevious();
        Node<T> nextNode = removedNode.getNext();

        previousNode.setNext(nextNode);
        nextNode.setPrevious(previousNode);

        size--;
        return removedNode.getData();
    }

    public void add(T newEntry) {
        size++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> currentNode = head;
        
        sb.append("[");

        while (currentNode.getNext() != null) {
            sb.append(currentNode.getData() +", ");
            currentNode = currentNode.getNext();
        }

        sb.append(currentNode);
        sb.append("]");

        return sb.toString();
    }



}
