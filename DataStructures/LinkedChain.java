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

}
