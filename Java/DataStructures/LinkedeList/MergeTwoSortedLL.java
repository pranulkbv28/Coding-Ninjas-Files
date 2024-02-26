package DataStructures.LinkedeList;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

public class MergeTwoSortedLL {

    public static Node<Integer> takeInput(Scanner sc) {
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currrNode = new Node<Integer>(data);
            if (head == null) {
                head = currrNode;
                tail = currrNode;
            } else {
                tail.next = currrNode;
                tail = currrNode;
            }

            data = sc.nextInt();
        }

        return head;
    }

    public static Node<Integer> mergeSortedLL(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node<Integer> head = null, tail = null;

        if (head1.data <= head2.data) {
            head = head1;
            tail = head1;
            head1 = head1.next;
        } else {
            head = head2;
            tail = head2;
            head2 = head2.next;
        }

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                tail = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                tail = head2;
                head2 = head2.next;
            }
        }

        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return head;
    }

    public static void toPrint(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        toPrint(head.next);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head1 = takeInput(sc);
        Node<Integer> head2 = takeInput(sc);
        Node<Integer> mergedHead = mergeSortedLL(head1, head2);
        toPrint(mergedHead);
        sc.close();
    }
}
