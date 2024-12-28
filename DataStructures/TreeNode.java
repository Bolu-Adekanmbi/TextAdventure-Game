package DataStructures;

public class TreeNode<T> extends Node<T> {
    
    private Node<T> left;
    private Node<T> right; 


    public TreeNode(T data) {
        super(data);
        this.left = null;
        this.right = null;
    }

    /*
     * Need to add getter and setter methods for the left and right nodes
     * Further, need to create a constructor for setting left, data, and right
     * and subsequently change the default constructor
     */


    @Override
    public Node<T> getNext() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setNext(Node<T> nextNode) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Node<T> getPrevious() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setPrevious(Node<T> previousNode) {
        throw new UnsupportedOperationException();
    }
}
