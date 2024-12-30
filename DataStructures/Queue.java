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

    public T peek() {
        if (head == null) {
            return null;
        }
        return head.getData();
    }

    public T rear() {
        if (tail == null) {
            return null;
        }

        return tail.getData();
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }



    



}
