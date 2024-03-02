package DataStructures.Queues.QueueUsingLL;

public class QueueUsingLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> front;
    private Node<T> rear;
    int size;

    public QueueUsingLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;

    }

    public void enqueue(T elem) {
        Node<T> newNode = new Node<>(elem);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T front() throws QueueEmptyException {

        if (front != null) {
            return front.data;
        } else {
            throw new QueueEmptyException();
        }
        // return null;
    }

    public T rear() throws QueueEmptyException {
        if (rear != null) {
            return rear.data;
        } else {
            throw new QueueEmptyException();
        }
        // return null;
    }

    public T dequeue() throws QueueEmptyException {
        if (front == null) {
            throw new QueueEmptyException();
        }
        T temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return temp;
    }

}
