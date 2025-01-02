package DataStructures;

// This is an alternative that I am writing to decide on later
public class LinkedChain<T> {
    private Node<T> firstNode;
    private int numberOfEntries;

    public LinkedChain() {
        firstNode = null;
        numberOfEntries = 0;
    }

    public void add(T newEntry) {
        Node<T> newNode = new Node<>(newEntry);
        if (isEmpty()) {
            firstNode = newNode;
        } else {
            Node<T> lastNode = getNodeAt(numberOfEntries);
            lastNode.setNext(newNode);
        }
        numberOfEntries++;
    }

    public boolean remove(T anEntry) {
        Node<T> currentNode = firstNode;
        Node<T> previousNode = null;

        while (currentNode != null) {
            if (currentNode.getData().equals(anEntry)) {
                if (previousNode == null) {
                    firstNode = currentNode.getNext();
                } else {
                    previousNode.setNext(currentNode.getNext());
                }
                numberOfEntries--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        return false;
    }
    
    public int getSize() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    private Node<T> getNodeAt(int index) {
        Node<T> currentNode = firstNode;
        for (int i = 1; i < index && currentNode != null; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public T getEntry(int givenPosition) {
        if (givenPosition >= 1 && givenPosition <= numberOfEntries) {
            return getNodeAt(givenPosition).getData();
        }
        return null;
    }

    public void printList() {
        Node<T> currentNode = firstNode;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    private boolean isNodeInChain(Node<T> node) {
        Node<T> currentNode = firstNode;
        while (currentNode != null) {
            if (currentNode == node) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public Node<T> getPreviousNode(Node<T> desiredNode) {
        if (desiredNode == null || desiredNode == firstNode) {
            return null;
        }

        Node<T> currentNode = firstNode;
        while (currentNode != null && currentNode.getNext() != desiredNode) {
            currentNode = currentNode.getNext();
        }

        if (currentNode == null) {
            return null;
        }

        return currentNode;
    }

    public void partialReverse(Node<T> givenNode) {
        if (givenNode == null || firstNode == null) {
            return;
        }

        if (!isNodeInChain(givenNode)) {
            return;
        }

        Node<T> startRemaining = givenNode.getNext();
        
        Node<T> current = givenNode;
        Node<T> point = givenNode;
        
        int counter = 0;
        Node<T> c = firstNode;
        while (c != givenNode) {
        	c = c.getNext();
        	counter++;
        }
        
        for (int i = 0; i < counter; i++) {
        	current.setNext(getPreviousNode(point));
        	current = current.getNext();
        	current.setNext(point);
        	point = getPreviousNode(point);
        }
        
        firstNode = givenNode;
        
        Node<T> pos = firstNode;
        for (int i = 0; i < counter; i++) {
        	pos = pos.getNext();
        }
        pos.setNext(startRemaining);
        
    }

    public Node<T> getReferenceTo(T anEntry) {
        Node<T> currentNode = firstNode;
        while (currentNode != null) {
            if (currentNode.getData().equals(anEntry)) {
                return currentNode; // Return the reference to the found node
            }
            currentNode = currentNode.getNext();
        }
        return null; // Return null if the entry is not found
    }

    public static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T dataPortion) {
            this(dataPortion, null);
        }

        public Node(T dataPortion, Node<T> nextNode) {
            data = dataPortion;
            next = nextNode;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> newNext) {
            next = newNext;
        }
    }

}
