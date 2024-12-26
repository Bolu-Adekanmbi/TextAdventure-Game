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

    }

    @Override
    public boolean equals() {
        
    }

    @Override String toString() {

    }

    public boolean contains() {

    }

    

    
    



}
