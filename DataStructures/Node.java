package DataStructures;

/**
 * This is the Node class that I am planning to use a variety of data structures for this project.
 * 
 * Since this is a small-scale practice project, I want to focus on implementing concepts that I've
 * learnt this semester: Trees, Stacks, Queues, Deques, LinkedLists, Bags, etc.
 * 
 */
public class Node<T> {

    private T data;
    private Node<T> next;
    private Node<T> previous;

    /**
     * This is the constructor class for our Node Class. This Node class will act as the primary
     * building block for implementing most of our data structures.
     * 
     * @param data
     * @param nextNode
     */
    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.next = nextNode;
    }

    public Node(T data) {
        this(data, null);
    }

    public void setData(T newData) {
        this.data = newData;
    }

    public T getData() {
        return this.data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> nextNode) {
        this.next = nextNode;
    }

    public Node<T> getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node<T> previousNode) {
        this.previous = previousNode;
    }



}
