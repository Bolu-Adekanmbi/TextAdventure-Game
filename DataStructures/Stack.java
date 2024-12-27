package DataStructures;

public class Stack<T> {
    private Node<T> head;
    private int size;

    public Stack() {
        
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

    
    public boolean equals(Stack<T> otherStack) {
        return false;
    }

    @Override String toString() {
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

    

    
    



}
