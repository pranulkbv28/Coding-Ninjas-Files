package DataStructures.Queues.QueueInCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInCollections {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.size()); // gives size of the queue
        System.out.println(queue.peek()); // shows front element
        System.out.println(queue.poll()); // retreives and removes the head and throws null if empty

    }
}
