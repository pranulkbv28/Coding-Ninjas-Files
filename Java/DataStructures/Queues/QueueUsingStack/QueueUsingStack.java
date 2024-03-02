package DataStructures.Queues.QueueUsingStack;

import java.util.Stack;

public class QueueUsingStack<T> {
    Stack<T> s1;
    Stack<T> s2;

    public QueueUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public int size() {
        return s1.size();
    }

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public T front() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        T front = s2.peek();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return front;
    }

    public T rear() {
        return s1.peek();
    }

    public void enqueue(T elem) {
        s1.push(elem);
    }

    public T dequeue() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        T dequeueElem = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return dequeueElem;
    }
}
