package DataStructures;

public class ListNode<T> {
    private T data;
    private ListNode<T> next;

    public ListNode(T data, ListNode<T> nextNode) {
        this.data = data;
        this.next = nextNode;
    }

    public ListNode(T data) {
        this(data, null);
    }

    public void setData(T newData) {
        this.data = newData;
    }

    public T getData() {
        return this.data;
    }

    



}
