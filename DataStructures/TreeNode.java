package DataStructures;

public class TreeNode<T> extends Node<T> {
    public TreeNode(T data) {
        super(data);
    }

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
