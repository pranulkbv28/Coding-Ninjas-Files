package DataStructures.Queues.QueueUsingLL;

// import DataStructures.Queues.QueueUsingArray.QueueUsingArrays;

public class QueueLinkedListUse {
    public static void main(String[] args) throws QueueFullException {
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
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
