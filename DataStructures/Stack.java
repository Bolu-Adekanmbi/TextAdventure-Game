package DataStructures;

import java.util.EmptyStackException;

// TODO: Replace all the IndexOutOfBounds to EmptyStackException

public class Stack<T> {
    private Node<T> head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void push(T anEntry) {
        Node<T> newNode = new Node<T>(anEntry);
        newNode.setNext(head);
        head = newNode;
    }

    public T pop() {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }


        T data = head.getData();
        head = head.getNext();
        return data;
    }

    public T[] toArray() {
        T[] arrayData = (T[]) new Object[size];
        if (size == 0) {
            return arrayData;
        }

        Node<T> currentNode = head;
        for (int i = 0; i < size; i++) {
            arrayData[i] = currentNode.getData();
            currentNode = currentNode.getNext();
        }

        return arrayData;
    }

    public Node<T> getHead() {
        return this.head;
    }

    
    public boolean equals(Stack<T> otherStack) {
        if (size != otherStack.getSize()) {
            return false;
        }

        Node<T> currentNode = head;
        Node<T> otherNode = otherStack.getHead();

        for (int i = 0; i < size; i++) {
            if (!currentNode.getData().equals(otherNode.getData())) {
                return false;
            }
            currentNode = currentNode.getNext();
            otherNode = otherNode.getNext();
        }

        return true;
    }

    public String toString() {
        if (head == null) {
            return "{}";
        }

        StringBuilder sb = new StringBuilder("{");
        Node<T> currentNode = head;
        while (currentNode.getNext() != null) {
            sb.append(currentNode.getData());
            sb.append(", ");
            currentNode = currentNode.getNext();
        }

        sb.append(currentNode.getData());
        sb.append("}");

        return sb.toString();

    }

    public boolean contains(T anEntry) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData().equals(anEntry)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }

        return false;
    }

    public T peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        return this.head.getData();
    }


    public T elementAt(int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode.getData();

    }


    
    



}
