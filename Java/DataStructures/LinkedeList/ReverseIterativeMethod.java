package DataStructures.LinkedeList;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class ReverseIterativeMethod {
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

    public static Node<Integer> reverseLinkedList(Node<Integer> head) {
        Node<Integer> current = head;
        Node<Integer> prev = null;
        Node<Integer> next;

        while (current != null) {
            next = current.next; // temporarily store the next node
            current.next = prev; // reverse the link
            prev = current; // move prev one step forward
            current = next; // move current one step forward
        }

        return prev;
    }

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput(sc);
        head = reverseLinkedList(head);
        print(head);
        sc.close();
    }
}
