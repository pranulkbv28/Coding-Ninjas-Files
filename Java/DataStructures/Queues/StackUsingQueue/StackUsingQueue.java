package DataStructures.Queues.StackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {
    Queue<T> q1;
    Queue<T> q2;

    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public int getSize() {
        return q1.size();
    }

    public boolean isEmpty() {
        return q1.size() == 0;
    }

    public void push(T elem) {
        q1.add(elem);
    }

    public T pop() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        T poppedElem = q1.poll();
        Queue<T> temp = q1;
        q1 = q2;
        q2 = temp;
        return poppedElem;
    }

    public T top() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        T topElem = q1.peek();
        q2.add(q1.poll());
        Queue<T> temp = q1;
        q1 = q2;
        q2 = temp;
        return topElem;
    }
}
