package DataStructures;

public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public Queue() {
        head = null;
        tail = null;
    }

    public void enqueue(T anEntry) {
        Node<T> newNode = new Node<T>(anEntry);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            tail.setNext(newNode);
        }

        size++;
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }

        T data = head.getData();
        head = head.getNext();

        size--;
        return data;
    }

    



}
