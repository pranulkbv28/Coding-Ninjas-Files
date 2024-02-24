package DataStructures.LinkedeList.RecursionLinkedList;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class ReverseLinkedList {
    public static Node<Integer> takeInput(Scanner sc) {
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode;
            }

            data = sc.nextInt();
        }

        return head;
    }

    public static Node<Integer> reverseRec(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> newHead = reverseRec(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
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
        System.out.println("Enter the linked list: ");
        Node<Integer> head = takeInput(sc);
        System.out.println("Reverse: ");
        head = reverseRec(head);
        toPrint(head);
        sc.close();
    }
}
