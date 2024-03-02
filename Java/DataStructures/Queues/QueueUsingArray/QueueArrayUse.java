package DataStructures.Queues.QueueUsingArray;

public class QueueArrayUse {
    public static void main(String[] args) throws QueueFullException {
        QueueUsingArrays queue = new QueueUsingArrays(3);
        int arr[] = { 10, 20, 30, 40 };
        for (int elem : arr) {
            // try {
            // } catch (QueueFullException e) {
            // }

            queue.enqueue(elem);
        }

        while (!queue.isEmpty()) {
            try {
                System.out.print(queue.dequeue() + " ");
            } catch (QueueEmptyException e) {
            }
        }
    }
}
